package hasan_karasahin;

/**
 *
 * @author hasan_karasahin
 */
public class Main {

    public static void main(String[] args) throws Exception {
        
        
        MapInterface map = new Map();
        Dimension dim = new Dimension(10, 10);
        map.SetSize(dim);

        map.SetBorder(0, 5);
        map.SetBorder(1, 5);
        map.SetBorder(2, 5);
        map.SetBorder(3, 5);
        map.SetBorder(4, 5);
        map.SetBorder(5, 5);
        map.SetBorder(6, 5);
        map.SetBorder(7, 5);
        map.SetBorder(8, 5);
        map.SetBorder(9, 5);

        map.SetBorder(5, 0);
        map.SetBorder(5, 1);
        map.SetBorder(5, 2);
        map.SetBorder(5, 3);
        map.SetBorder(5, 4);
        map.SetBorder(5, 5);
        map.SetBorder(5, 6);
        map.SetBorder(5, 7);
        map.SetBorder(5, 8);
        map.SetBorder(5, 9);

        map.SetBorder(1, 7);
        map.SetBorder(2, 8);
        map.SetBorder(3, 9);

        map.SetBorder(1, 6);

        ZoneCounterInterface solution = new Solution();
        solution.Init(map);

        System.out.println();
        System.out.println();

        System.out.println("Harita da " + solution.Solve() + " adet alan bulunmaktadır.");

        System.out.println();
        System.out.println();
        System.out.println();

        map.Show();

        System.out.println();
        System.out.println();
        System.out.println();

    }
}
