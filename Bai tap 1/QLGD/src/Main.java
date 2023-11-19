
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Map<String, String> GD = new HashMap<>();
        Map<String, GiaoDich> GDMap = new HashMap<>();
        ArrayList<String> ngayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Them giao dich vang");
            System.out.println("2. Them giao dich tien te");
            System.out.println("3. Hien thi danh sach giao dich");
            System.out.println("4. Xem tong so luong giao dich");
            System.out.println("5. Hien thi danh sach giao dich theo ngay");
            System.out.println("6. Hien thi danh sach giao dich co chua ngay");
            System.out.println("7. Hien thi danh sach giao dich theo tu nam den nam");
            System.out.println("0. Thoat");
            System.out.print("Chon mot chuc nang (0-7): ");
            int n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1:
                    GiaoDich gd = new GiaoDich();
                    gd.nhapGiaoDich(sc, true);
                    GD.put(sdf.format(gd.getNgay()), gd.getID());
                    ngayList.add(sdf.format(gd.getNgay()));
                    GDMap.put(gd.getID(), gd);
                    break;
                case 2:
                    GiaoDich gdTT = new GiaoDich();
                    gdTT.nhapGiaoDich(sc, false);
                    GD.put(sdf.format(gdTT.getNgay()), gdTT.getID());
                    ngayList.add(sdf.format(gdTT.getNgay()));
                    GDMap.put(gdTT.getID(), gdTT);
                    break;
                case 3:
                    for (String ngay : ngayList) {
                        String ID = GD.get(ngay);
                        if (GDMap.containsKey(ID)) {
                            GiaoDich giaoDich = GDMap.get(ID);
                            if (giaoDich != null) {
                                System.out.println(giaoDich);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println(ngayList.size());
                    break;
                case 5:
                    ArrayList<String> tmp = new ArrayList<>(ngayList);
                    Collections.sort(tmp);
                    for (String ngay : tmp) {
                        String ID = GD.get(ngay);
                        if (GDMap.containsKey(ID)) {
                            GiaoDich giaoDich = GDMap.get(ID);
                            if (giaoDich != null) {
                                System.out.println(giaoDich);
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Moi ban nhap ngay dd/MM/yyyy:");
                    String ngayNhap = sc.nextLine();
                    for (String ngay : ngayList) {
                        if (ngay.equals(ngayNhap)) {
                            String ID = GD.get(ngay);
                            if (GDMap.containsKey(ID)) {
                                GiaoDich giaoDich = GDMap.get(ID);
                                if (giaoDich != null) {
                                    System.out.println(giaoDich);
                                }
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Moi ban nhap nam den nam:");
                    int startYear = sc.nextInt();
                    int endYear = sc.nextInt();
                    for (String ngay : ngayList) {
                        int nam = Integer.parseInt(ngay.substring(6));
                        if (nam >= startYear && nam <= endYear) {
                            String ID = GD.get(ngay);
                            if (GDMap.containsKey(ID)) {
                                GiaoDich giaoDich = GDMap.get(ID);
                                if (giaoDich != null) {
                                    System.out.println(giaoDich);
                                }
                            }
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}

class GiaoDich {

    private String ID;
    private Date ngay;
    private int donGia, soLuong;
    private double tiGia;
    private String loai;

    public GiaoDich() {
    }

    public String getID() {
        return ID;
    }

    public Date getNgay() {
        return ngay;
    }

    public void nhapGiaoDich(Scanner sc, boolean isVang) throws ParseException {
        System.out.print("Nhap ID: ");
        ID = sc.nextLine();
        System.out.print("Nhap ngay (dd/MM/yyyy): ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ngay = sdf.parse(sc.nextLine());
        System.out.print("Nhap don gia: ");
        donGia = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        if (isVang) {
            System.out.print("Nhap loai vang: ");
            loai = sc.nextLine();
        } else {
            System.out.print("Nhap ti gia: ");
            tiGia = Double.parseDouble(sc.nextLine());
            System.out.print("Nhap loai tien te (VN/Foreign): ");
            loai = sc.nextLine();
        }
    }

    public double getTongTien() {
        if (loai.equals("VN")) {
            return soLuong * donGia;
        } else {
            return (int) (soLuong * donGia * tiGia);
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String res = ID + " " + sdf.format(ngay) + " " + donGia + " " + soLuong + " ";
        if (loai.equals("VN")) {
            res += loai + " " + getTongTien();
        } else {
            res += tiGia + " " + loai + " " + String.format("%.2f", getTongTien());
        }
        return res;
    }
}
