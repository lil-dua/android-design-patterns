package tech.demoproject.android_design_patterns.creational_patterns.singleton_pattern;

/** Là một cách làm mang tính mở rộng hơn so với 2 cách làm trên và hoạt động
 *  tốt trong môi trường đơn luồng (single-thread).
 *
 *  Cách này đã khắc phục được nhược điểm của cách Eager initialization, chỉ khi
 *  nào getInstance() được gọi thì instance mới được khởi tạo. Tuy nhiên, cách này
 *  chỉ sử dụng tốt trong trường hợp đơn luồng (single-thread), trường hợp nếu có
 *  nhiều luồng (multi-thread) cùng chạy và cùng gọi hàm getInstance() tại cùng
 *  một thời điểm thì có thể có nhiều hơn 1 thể hiện của instance.
 *
 *  Để khắc phục nhược điểm này chúng ta sử dụng Thread Safe Singleton.*/
public class LazyInitialization {
    /** Chúng ta cũng định nghĩa Constructor là private để những Class khác không thể khởi tạo
     *  được instance mới của Class Singleton.*/
    private static LazyInitialization INSTANCE;

    private LazyInitialization(){
    }

    public static LazyInitialization getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyInitialization();
        }
        return INSTANCE;
    }

}
