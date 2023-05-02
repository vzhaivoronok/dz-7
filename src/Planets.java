public enum Planets {
    MERCURY (1, 0, 5, null),
    VENUS (2, 50, 6, MERCURY),
    EARTH (3, 38, 6, VENUS),
    MARS (4, 20, 6, EARTH),
    JUPITER (5, 60, 69, MARS),
    SATURN (6, 55, 56, JUPITER),
    URANUS (7, 58, 6, SATURN),
    NEPTUNE (8, 45, 24, URANUS);

    private final int indexFromSun;
    private final int distanceFromPrevious;
    private final int distanceFromSun;
    private final int radius;
    private final Planets previousPlanet;

    Planets(Integer indexFromSun, Integer distanceFromPrevious, Integer radius, Planets previousPlanet) {
        this.indexFromSun = indexFromSun;
        this.distanceFromPrevious = distanceFromPrevious;
        this.distanceFromSun = previousPlanet != null ? previousPlanet.getDistanceFromSun() + distanceFromPrevious : distanceFromPrevious;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
    }


    public int getIndexFromSun() {
        return indexFromSun;
    }

    public int getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public Planets getPreviousPlanet() {
        return previousPlanet;
    }
}
