package hasan_karasahin;

import static hasan_karasahin.Utils.BoundaryNumber;
import static hasan_karasahin.Utils.CoordinatesAreInvalid;
import static hasan_karasahin.Utils.NotFoundZeroValue;
import static hasan_karasahin.Utils.getRandomNumber;
import java.util.ArrayList;

/**
 *
 * @author hasan_karasahin
 */


public class Solution implements ZoneCounterInterface {
    private MapInterface map;
    private ArrayList<Integer> numberStack;

    @Override
    public void Init(MapInterface map) throws Exception {
        if (map != null) {
            this.map = map;
            numberStack = new ArrayList<Integer>();
        } else {
            throw new NullPointerException("init: Parametre boş olamaz.");
        }
    }

    @Override
    public int Solve() throws Exception {
        int[] firstZero = {0};
        int boundaryNumber = BoundaryNumber;
        
        while((firstZero = findFirstZeroValue())[0]!=NotFoundZeroValue){
            int newNumber = createNewuniqueNumber();
            boundaryFill(firstZero[0],firstZero[1],boundaryNumber,newNumber);
        }
      
        int size = numberStack.size();
        return size;
    }
    
    private int createNewuniqueNumber(){
        
        int newNumber = getRandomNumber();
        boolean result = numberStack.contains(newNumber);
        if(result){
             createNewuniqueNumber();
        }else{
            numberStack.add(newNumber);
        }
        return newNumber;
    }
    
    private void boundaryFill(int posX,int posY,int boundaryNumber,int fillNumber){
        
        int currentNumber = map.GetValueFromPos(posX,posY);
        
        if(currentNumber!=CoordinatesAreInvalid && currentNumber!=boundaryNumber && currentNumber!=fillNumber ){
            map.SetValue(posX, posY, fillNumber);
            
            boundaryFill(posX+1,posY,boundaryNumber,fillNumber);
            boundaryFill(posX-1,posY,boundaryNumber,fillNumber);
            boundaryFill(posX,posY-1,boundaryNumber,fillNumber);
            boundaryFill(posX,posY+1,boundaryNumber,fillNumber);
        }
    }
    
    private int[] findFirstZeroValue(){
        
         Dimension dim = map.GetSize();
         
         int Height = dim.getHeight();
         int Width = dim.getWidth();
         
        for (int i = 0; i < Width; i++) {
            for (int j = 0; j < Height; j++) {
                if (map.GetValueFromPos(i,j)==0) {
                    int[] poz = {i,j};
                    return poz;
                }
            }
        }
        int[] notFound = {NotFoundZeroValue};
        return notFound;
    }
}
