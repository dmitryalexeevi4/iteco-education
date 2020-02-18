package part1.lesson05.task04;

class Female extends Human {
    Female(String femaleName) {
        this.name = femaleName;
    }

    public void run() {
        System.out.println(this.getName() + " бежит в умеренном темпе");
    }
}

