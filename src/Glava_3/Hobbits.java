package Glava_3;

class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = -1;
        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "бильбо";
            if (z == 1){
                h[z].name = "фродо";
            }
            if (z == 2){
                h[z].name = "сэм";
            }
            System.out.print(h[z].name + " - это ");
            System.out.println("хорошее имя для хоббита");
        }
    }
}
