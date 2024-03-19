package violated.OCP;

class Shape {
    String type;

    public Shape(String type) {
        this.type = type;
    }

    //more shapes could be added but that violates OCP
    public void draw() {
        if (type.equals("circle")) {
            System.out.println("Drawing Circle");
        } else if (type.equals("rectangle")) {
            System.out.println("Drawing Rectangle");
        } else if (type.equals("triangle")) {
            System.out.println("Drawing Triangle");
        }
    }
}


