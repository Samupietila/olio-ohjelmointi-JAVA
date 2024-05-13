class Pet {
    private double x;
    private double y;
    private double speed = 2.0;

    public Pet(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void moveTo(double targetX, double targetY) {
        double dx = targetX - x;
        double dy = targetY - y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        if (distance > speed) {
            double ratio = speed / distance;
            x += dx * ratio;
            y += dy * ratio;
        } else {
            x = targetX;
            y = targetY;
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}