import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    List<BaiHat> listBaiHat = new ArrayList<>();

    public List<BaiHat> getList(){
        return listBaiHat;
    }

    public void addBaiHat(BaiHat baiHat){
        validate(baiHat);
        listBaiHat.add(baiHat);
    }

    public  void validate(BaiHat baiHat){
        if (baiHat == null) {
            throw new IllegalArgumentException("Bai hat khong hop le");
        }
        if (
                baiHat.getMa() == null || baiHat.getMa().isBlank()
                || baiHat.getTen() == null || baiHat.getTen().isBlank()
                || baiHat.getTenCaSi() == null || baiHat.getTenCaSi().isBlank()
                || baiHat.getThoiLuong() == null
                || baiHat.getTheLoai() == null || baiHat.getTheLoai().isBlank()
        ) {
            throw new IllegalArgumentException("Bai hat khong hop le");
        }
        float seconds = baiHat.getThoiLuong();
        if (seconds < 120.0f || seconds > 359.0f) {
            throw new IllegalArgumentException("Thoi luong khong hop le (120s - 359s)");
        }
    }
}