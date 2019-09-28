import entities.Laika;
import entities.Leopard;
import selfAnnotation.Cats;

public class Main {
    public static void main(String[] args) {
        Leopard leopard = new Leopard();
        Class a = leopard.getClass();
        Cats cats = (Cats)a.getAnnotation(Cats.class);
        System.out.println(cats.isCat());

        Laika laika = new Laika();
        a = laika.getClass();
        cats = (Cats)a.getAnnotation(Cats.class);
        if(cats ==null){
            System.out.println(a.getName()+" это не кот");
        }
    }
}
