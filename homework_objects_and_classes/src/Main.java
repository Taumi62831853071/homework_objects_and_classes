public class Main {

    public static void main(String[] args) {

        Book paleFire = new Book ("Pale Fire", 1962);
        System.out.println(paleFire.getTitleOfTheBook());
        System.out.println(paleFire.getYearOfPublication());
        Author nabokov = new  Author ("Vladimir", "Nabokov");
        System.out.println(nabokov.getFirstname());
        System.out.println(nabokov.getLastname());

        Book it = new Book ("It", 1986);
        System.out.println(it.getTitleOfTheBook());
        System.out.println(it.getYearOfPublication());
        it.setYearOfPublication(2077);
        System.out.println(it.getYearOfPublication());
        Author stephenKing = new  Author ("Stephen", "King");
        System.out.println(stephenKing.getFirstname());
        System.out.println(stephenKing.getLastname());

    }
}