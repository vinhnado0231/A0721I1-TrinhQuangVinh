package thi_cuoi_module;

public class NotFoundProductException extends Exception{
    public NotFoundProductException() {
        getMessage();
    }

    public String getMessage() {
        return "ID phone này không tồn tại";
    }
}
