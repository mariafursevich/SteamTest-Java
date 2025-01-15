package ITechArt;
import ITechArt.Pages.AgeCheckPage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import java.util.Optional;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Tabs extends AgeCheckPage {
    public SelenideElement selectGameWithMaxDiscountOrPrice() throws InterruptedException {
        Thread.sleep(5000);
        ElementsCollection games = $$(".v9uRg57bwOaPsvAnkXESO");
        SelenideElement gameWithMaxDiscount = null;
        SelenideElement gameWithMaxPrice = null;
        int maxDiscount = 0;
        int maxPrice = 0;
        for (SelenideElement game : games) {
            if (game.$(".cnkoFkzVCby40gJ0jGGS4").exists()) {
                String discountText = game.$(".cnkoFkzVCby40gJ0jGGS4").getText().replace("-", "").replace("%", "").trim();
                if (!discountText.equalsIgnoreCase("Free To Play")) {
                    try {
                        int discount = Integer.parseInt(discountText);
                        if (discount > maxDiscount) {
                            maxDiscount = discount;
                            gameWithMaxDiscount = game;
                            System.out.println(discount);
                            System.out.println(game);
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Ошибка преобразования скидки: " + discountText);
                    }
                }
            }
            if (!game.$(".cnkoFkzVCby40gJ0jGGS4").exists()) {
                String priceText = game.$("._3j4dI1yA7cRfCvK8h406OB").getText().replace("$", "").replace(".", "").trim();
                if (!priceText.equalsIgnoreCase("Free To Play")) {
                    try {
                        int price = Integer.parseInt(priceText);
                        if (price > maxPrice) {
                            maxPrice = price;
                            gameWithMaxPrice = game;
                            System.out.println(price);
                            System.out.println(game.getText());
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Ошибка преобразования цены: " + priceText);
                    }
                }
            }
        }
        SelenideElement selectedGame = Optional.ofNullable(gameWithMaxDiscount).orElse(gameWithMaxPrice);
        if (selectedGame != null) {
            System.out.println(selectedGame.getText() + " Выбранная игра");
            SelenideElement link = selectedGame.$("a");
            link.shouldBe(visible);
            executeJavaScript("arguments[0].click();", link);
            switchTo().window(1);
            if (ageCheckForm.isDisplayed()) {
                new AgeCheckPage().fillAgeCheckForm();
            }
        } else {
            System.err.println("Нет доступных игр с подходящей скидкой или ценой.");
            return null;
        }
        SelenideElement gameTitle = $("#appHubAppName").shouldBe(visible);
        System.out.println("Название игры на новой вкладке: " + gameTitle.getText());
        return gameTitle;
    }
}