package hasan_karasahin;

/**
 *
 * @author hasan_karasahin
 */
public interface MapInterface {
    
    // Creates / Allocates a map of given size.
    void SetSize(Dimension dim);
    
    // Void olan geri dönüş degerini Dimension olarak degiştirdim. Çünkü GetSize geriye bir deger döndürmelidir.
    //Aldıgı parametreyi sildim. Çünkü get metotolarında geriye dönüş yapılırken parametreye ihtiya duyulmaz. Burada da kullanırken ihtiyaç duymadım.
    // Get dimensions of given map.
    Dimension GetSize();
    
    //Map üzerinde hernagi bir noktanın verisini getirme
    int GetValueFromPos(int x,int y);
    
    //Map üzerinde bir noktanın degerini degiştirme
    void SetValue(int x,int y, int value);
    
    
    // Sets border at given point.
    void SetBorder(int x, int y) throws Exception;
    
    // Clears border at given point.
    void ClearBorder(int x, int y) throws Exception;
    
    // Checks if given point is border.
    boolean IsBorder(int x, int y) throws Exception;
    
    // Show map contents.   
    void Show();
}
