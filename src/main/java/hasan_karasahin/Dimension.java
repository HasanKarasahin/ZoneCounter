package hasan_karasahin;

/**
 *
 * @author hasan_karasahin
 */
public class Dimension {
    
    //publicden private yapıldı. Dogrudan erişim yasaklandı. Bunun yerine getter ve setter metotları ekleencek.
    private int width, height;

    public Dimension(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public boolean CheckWithin(int x, int y) {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    
    
    
}
