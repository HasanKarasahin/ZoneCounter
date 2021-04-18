package hasan_karasahin;

import static hasan_karasahin.Utils.CoordinatesAreInvalid;

/**
 *
 * @author hasan_karasahin
 */
public class Map implements MapInterface {
    private int[][] map;
    private Dimension dim;

    @Override
    public void SetSize(Dimension dim) {
        if (dim != null) {
            map = new int[dim.getWidth()][dim.getHeight()];
            this.dim = dim;
        } else {
            throw new NullPointerException("SetSize: Parametre boş olamaz.");
        }
    }

    @Override
    public Dimension GetSize() {
        return dim;
    }

    @Override
    public void SetBorder(int x, int y) throws Exception {
        if (dim.CheckWithin(x, y)) {
            map[x][y] = 1;
        } else {
            throw new ArrayIndexOutOfBoundsException("SetBorder: Geçersiz korrdinat bilgileri.");
        }
    }

    @Override
    public void ClearBorder(int x, int y) throws Exception {
        if (dim.CheckWithin(x, y)) {
            map[x][y] = 0;
        } else {
            throw new ArrayIndexOutOfBoundsException("ClearBorder: Geçersiz korrdinat bilgileri.");
        }
    }

    @Override
    public boolean IsBorder(int x, int y) throws Exception {
       if (dim.CheckWithin(x, y)) {
            return map[x][y]==1?true:false;
        } else {
            throw new ArrayIndexOutOfBoundsException("IsBorder: Geçersiz korrdinat bilgileri");
        }
    }

    @Override
    public void Show() {
        for (int i = 0; i <dim.getWidth() ; i++) {
            for (int j = 0; j < dim.getHeight(); j++) {
                
                //System.out.print(map[i][j]);
                if (map[i][j]==1) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    @Override
    public int GetValueFromPos(int x, int y) {
        if(dim.CheckWithin(x, y)){
            return map[x][y];
        }else{
            return CoordinatesAreInvalid;
        }
    }

    @Override
    public void SetValue(int x, int y, int value) {
        if(dim.CheckWithin(x, y)){
            map[x][y]=value;
        }
    }
    
}
