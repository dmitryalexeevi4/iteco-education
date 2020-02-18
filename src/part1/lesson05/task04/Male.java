package part1.lesson05.task04;

class Male extends Human {
    Male(String maleName) {
        this.name = maleName;
    }

    public void swim() {
        System.out.println(this.getName() + " плывет, задержав дыхание");
    }
}
