package catproducts.catdb.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import catproducts.catdb.api.entities.Product;


@Component
public class CatDbSeeder implements CommandLineRunner{
    @Autowired
    IProductRespository productRepo;

    @Override
    public void run(String... args) throws Exception {
        Product catBed = new Product("Comfy Cat Bed 2000", 2000.00,"Very Comfy many soft, meow", 5, "https://images-na.ssl-images-amazon.com/images/I/51Llq1R4pSL._SL500_AC_SS350_.jpg");
        Product redBow = new Product("Red Bowtie", 15.00,"Much Sophistication, great style.", 500, "https://i.pinimg.com/236x/53/e8/86/53e886b28608b3e267fd8bf9357e47f2--lady-in-red-red-bows.jpg");
        Product miniGlasses = new Product("Glasses", 20.99, "Look sharp and smart! Only works on cats though.", 50, "https://ae01.alicdn.com/kf/HTB1i4M4df6H8KJjSspmq6z2WXXah/Funny-Pet-Glasses-Dog-Cat-SunGlasses-Transparent-Eye-wear-Protection-Puppy-Pet-Teacher-Bachelor-Cosplay-Glasses.jpg_640x640.jpg");
        Product collar = new Product("Pretty Pink Collar", 3.00, "Collar that is Pink and automatically makes you pretty.", 1001, "https://cdn.shopify.com/s/files/1/0949/8146/collections/bengal-kitten-with-pink-collar-1334058_large.jpg?v=1452227084");
        Product featherStick = new Product("Feather on a Stick", 6.99, "Good for catching birds without the real bird.", 1000, "https://cdn.shopify.com/s/files/1/0095/7700/5115/products/product-image-289465928_1001x.jpg?v=1536771329");
        Product bucketHat = new Product("Bucket Hat for Cat", 15.99, "It rhymes, do you need any more?", 50, "https://s7d1.scene7.com/is/image/PETCO/2629881-center-1?$ProductDetail-large$");
        Product santaHelper = new Product("Santa's Little Helper Costume", 12.25, "HO Ho Ho", 666, "https://images-na.ssl-images-amazon.com/images/I/41KUXfdbjlL.jpg");
        Product scratchPole = new Product("Scritch Scratch Pole", 116.99, "Good for scritching and a' scratching.", 25, "https://ak1.ostkcdn.com/images/products/12709002/MAX-MARLOW-32-INCH-CAT-SCRATCHING-POST-3342c095-679d-4f5b-b375-1f94ad085cd9_600.jpg");

        productRepo.deleteAll();

        List<Product> products = Arrays.asList(catBed, redBow, miniGlasses, collar, miniGlasses, featherStick,bucketHat, santaHelper,scratchPole);
        productRepo.saveAll(products);
    }


}