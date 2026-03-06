public class DTBService {
    public String xepLoai(Double diem) {
        if (diem >= 9.0) {
            return "Xuất sắc";
        } else if (diem >= 7.0) {
            return "Giỏi";
        } else if (diem >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
}
