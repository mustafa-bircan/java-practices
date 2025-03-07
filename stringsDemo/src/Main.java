public class Main {
    public static void main(String[] args) {
        String mesaj = "   Bugün günlerden stringler.    ";
        System.out.println(mesaj);
        System.out.println("5.eleman " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın"));//yeni bir string oluşur.
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.startsWith("b"));//büyük küçük harf duyarlılığı vardır.
        System.out.println(mesaj.endsWith(")"));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('l'));
        System.out.println(mesaj.lastIndexOf('l'));
        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(5,8));//5 den başla 8e kadar
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim());//boşlukları atıyoruz
    }
}