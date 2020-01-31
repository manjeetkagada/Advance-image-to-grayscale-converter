import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        int width;
        int height;
        String path_input_file="D:\\java project\\IOG\\src\\input.jpg";

        BufferedImage image;

        try {

            image= ImageIO.read(new File(path_input_file));
            width=image.getWidth();
            height=image.getHeight();

            for (int i=0;i<height;i++){
                for (int j=0;j<width;j++){
                    Color color=new Color(image.getRGB(j,i));
                    int red = (int)(color.getRed() * 0.299);
                    int green = (int)(color.getGreen() * 0.587);
                    int blue = (int)(color.getBlue() *0.114);
                    int sum=red+green+blue;
                    Color color1=new Color(sum,sum,sum);
                    image.setRGB(j,i,color1.getRGB());


                }
                File outfie=new File("outfile.jpg");
                ImageIO.write(image,"jpg",outfie);



            }





        }catch (Exception e){
            e.printStackTrace();

        }





    }
}
