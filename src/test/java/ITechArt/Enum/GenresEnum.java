package ITechArt.Enum;

public enum GenresEnum {
    Action("Action"),
    Arcade("ARCADE"),
    Adventures("ADVENTURES"),
    ArcadeRhythm("ArcadeRhythm"),
    FightingMartialArts("FightingMartialArts"),
    FirstPersonShooter("FirstPersonShooter"),
    HackSlash("HackSlash"),
    PlatformerRunner("PlatformerRunner"),
    ThirdPersonShooter("ThirdPersonShooter"),
    Shmup("Shmup"),
    AdventureRPG("AdventureRPG"),
    Casual("Casual"),
    HiddenObject("HiddenObject"),
    Metroidvania("Metroidvania"),
    Puzzle("Puzzle"),
    StoryRich("StoryRich"),
    VisualNovel("VisualNovel"),
    RolePlaying("RolePlaying"),
    ActionRPG("ActionRPG"),
    JRPG("JRPG"),
    PartyBased("PartyBased"),
    RogueLike("RogueLike"),
    StrategyRPG("StrategyRPG"),
    TurnBased("TurnBased"),
    Simulation("Simulation"),
    BuildingAutomation(" BuildingAutomation"),
    Dating("Dating"),
    FarmingCrafting("FarmingCrafting"),
    HobbyJob("HobbyJob"),
    LifeImmersive("LifeImmersive"),
    SandboxPhysics("SandboxPhysics"),
    SpaceFlight("SpaceFlight"),
    Strategy("Strategy"),
    CardBoard("CardBoard"),
    CitySettlement("CitySettlement"),
    Grand4X("Grand4X"),
    Military("Military"),
    RealTimeStrategy("RealTimeStrategy"),
    TowerDefense("TowerDefense"),
    TurnBasedStrategy("TurnBasedStrategy"),
    SportsRacing("SportsRacing"),
    AllSports("AllSports"),
    FishingHunting(" FishingHunting"),
    IndividualSports("IndividualSports"),
    Racing("Racing"),
    RacingSim("RacingSim"),
    SportsSim("SportsSim"),
    TeamSports("TeamSports");

    private final String displayName;
    GenresEnum(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }
}

