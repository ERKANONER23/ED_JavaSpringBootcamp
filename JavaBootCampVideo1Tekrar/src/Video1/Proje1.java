package Video1;

public class Proje1 {

	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 20;

		sayi1 = sayi2;

		sayi2 = 200;

		System.out.println("sayi1 : " + sayi1);
		System.out.println("sayi2 : " + sayi2);

		int dizi1[] = { 10, 20, 30, 40, 50 };
		int dizi2[] = { 60, 70, 80, 90, 100 };

		dizi1 = dizi2;

		dizi2[0] = 100;

		System.out.println("dizi 1 : " + dizi1[0]);
		System.out.println("dizi 2 : " + dizi2[0]);

		
		String isim ="erkan";
		String soyisim ="oner";
		
		isim=soyisim;
		
		soyisim="deneme";
		
		System.out.println("isim : "+isim);
		System.out.println("soyisim : "+soyisim);
		
	}

}
