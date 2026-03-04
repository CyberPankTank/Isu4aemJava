package Glava_3;

class Books {
    String title;
    String author;
}
class BooksTestDirve {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "Гроздья Java";
        myBooks[1].title = "Великий Java Гэтсби";
        myBooks[2].title = "Java-поваренная книга";
        myBooks[0].author = "боб";
        myBooks[1].author = "сю";
        myBooks[2].author = "ян";
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" - автор: ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
