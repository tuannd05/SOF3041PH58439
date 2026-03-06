import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.checkerframework.checker.units.qual.A;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaiHat {
//    BaiHat gồm các thuộc tính ma - String , ten - String ,
//    tenCaSi - String, thoiLuong - float, theLoai - String
    private String ma;
    private String ten;
    private String tenCaSi;
    private Float thoiLuong;
    private String theLoai;
}
