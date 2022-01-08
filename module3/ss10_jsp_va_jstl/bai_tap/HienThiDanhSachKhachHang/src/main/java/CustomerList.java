import java.util.LinkedList;
import java.util.List;

public class CustomerList {
    static List<Customer> customers = new LinkedList<>();

    static {
        customers.add(new Customer("Nguyen Van A", "23/5/1990", "23 Ton That Tu", "https://st.quantrimang.com/photos/image/2021/05/21/AVT-Doi17-1.jpg"));
        customers.add(new Customer("Nguyen Van B", "24/5/1990", "24 Ton That Tu", "https://vietup.net/files/846304c0f382c3b7757cc54c3772e0f2/b28554d34de6b772a2a8a32ea846c815/avt.jpg"));
        customers.add(new Customer("Nguyen Van C", "25/5/1990", "25 Ton That Tu", "https://phunugioi.com/anh-cap-avatar-doi/avt-doi-cute-nam/"));
        customers.add(new Customer("Nguyen Van D", "26/5/1990", "26 Ton That Tu", "https://truongtin.top/wp-content/uploads/2021/09/23/08/avatar-chibi-avatar-cute-anh-dai-dien-chibi-dep-1.jpg"));
        customers.add(new Customer("Nguyen Van E", "27/5/1990", "27 Ton That Tu", "https://i.ytimg.com/vi/t2OatjgNF9A/hqdefault.jpg"));
        customers.add(new Customer("Nguyen Van F", "28/5/1990", "28 Ton That Tu", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_nDSzXmWyRgauiLIODD7GelXNoDq5eI9WvqWGkZeh2eKnF1PQxk4gqzk55ukonPPUEEA&usqp=CAU"));
        customers.add(new Customer("Nguyen Van G", "29/5/1990", "29 Ton That Tu", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuWPkoD_BlrMnQbA3rx3OFD-xHD86fc3S3XA&usqp=CAU"));
        customers.add(new Customer("Nguyen Van H", "30/5/1990", "30 Ton That Tu", "https://employer.jobsgo.vn/uploads/media/img/202110/human_resource_5421424208_avatar.png"));
    }

    public List<Customer> getList() {
        return customers;
    }
}