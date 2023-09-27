package arrays.medium;

public class MajorityElementNBy2 {
    public static void main(String[] args) {
        int[] arr = {-261577017, 515025203, -261577017, -261577017, -261577017, -261577017, -261577017, -19416279, -261577017, 479481616, -261577017, 474392186, -37019625, -261577017, -261577017, -353085757, -261577017, -499579897, -261577017, -261577017, -261577017, 447420924, -261577017, -261577017, 673437366, -261577017, -261577017, 696161497, -261577017, -261577017, -270987852, -261577017, 255103674, -591989702, 790265405, -261577017, 680924514, -575432723, -261577017, 848698547, -261577017, -261577017, -585894347, -261577017, 565645236, -261577017, -261577017, -261577017, -83963576, 134277276, -261577017, -261577017, -261577017, -261577017, 854070935, -261577017, -261577017, -261577017, -261577017, -904260505, 777553483, -330420714, -261577017, -261577017, -261577017, 712157084, -261577017, -261577017, -261577017, 926991517, -261577017, 215942063, -261577017, -261577017, -261577017, -261577017, 874754565, 296570818, 600237477, -192642157, -261577017, -261577017, -357949016, -261577017, -261577017, -261577017, -261577017, -261577017, 604906458, -261577017, -261577017, 722131163, 435742766, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, 247489302, -261577017, -261577017, -712286223, 698365172, 5318585, -580692261, 205105908, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, 411834171, -261577017, -450294259, -261577017, -979115419, -261577017, -261577017, 307824626, -261577017, 776768895, -261577017, 421553471, -116725735, -220767903, -718707087, -261577017, -513042763, -261577017, -261577017, -261577017, 289056195, -906297968, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, 526607023, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, 792347711, -261577017, -261577017, -247148853, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, 136147737, -261577017, -57737203, -628407384, -261577017, -108407070, -261577017, -261577017, -104374854, -261577017, -261577017, 267711909, -261577017, -261577017, -796798641, -736867894, -261577017, -261577017, -261577017, 474369712, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, 182322409, 511069340, -261577017, -261577017, -730973991, -261577017, -261577017, -261577017, -261577017, -235844742, 75479906, -905011950, -984109701, 159880816, -261577017, -261577017, -261577017, -261577017, 450607738, -261577017, -261577017, -261577017, -689616869, -261577017, -261577017, -261577017, -265702112, -261577017, -261577017, -261577017, -261577017, 863119657, -261577017, -261577017, -261577017, 330118581, -261577017, 837376155, -261577017, -261577017, 833340444, 890943642, -261577017, -261577017, 56427588, -492427020, 506618694, -261577017, -903066625, -261577017, -672165956, -261577017, -261577017, -458101797, 281832437, 548806133, -261577017, -261577017, 110169335, -496409880, 538765488, -118866650, -261577017, 396891381, -261577017, -261577017, -261577017, -349061876, 525665084, -261577017, 515714299, 321886655, -261577017, -261577017, -261577017, -594006371, 989232750, -261577017, -261577017, -261577017, -261577017, -261577017, -261577017, -641917385, -556312284, -678396319, -261577017, -261577017, -126145421, -261577017, -261577017, -389438619, -261577017, -261577017, -733596171, 492442169, -261577017, -261577017, -261577017, 685740086, -261577017, -261577017, -943849473, 786478818, 847118884, 111379819, -261577017, -261577017, 657761370, -261577017, -261577017, 180979306, -261577017, -261577017, -261577017, -261577017, -261577017, 239398044, -43513816, 807562171, -887254831, 659505882, -992974705, -431304093, -261577017, -261577017, -261577017, 322687584, 59397764, -261577017, 279858829, -261577017, -261577017, 371188680, 398137127, -261577017, -261577017, 527080942, -261577017, 330867300, -261577017, -261577017, -261577017, -261577017, -691832389, -384584804, -261577017, -261577017, -261577017, -261577017, -593560971, -261577017, 341026980, -261577017, 896314444, -42930680, -261577017, -261577017, -261577017, -564959105, -261577017, 122337288, -59405001, -261577017, -58701944, -10865175, -261577017, -261577017, -261577017, -228318520, -261577017, -94520661, -261577017, -261577017, -261577017, -261577017, -817559337, -261577017, -261577017, 765942134, 30947157, -261577017, -261577017, 786579460, 747578191,};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] v) {
        //By using moore voting algorithm
        int ans = -1, count = 0;
        for (int i = 0; i < v.length; i++) {
            if (count == 0) {
                ans = v[i];
                count = 1;
            } else if (ans == v[i]) {
                count++;
            } else if (ans != v[i]) {
                count--;
            }
        }
        return ans;
    }
}