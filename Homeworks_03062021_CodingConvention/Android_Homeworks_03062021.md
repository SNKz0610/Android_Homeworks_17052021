Android Homework
(03/06/2021)

I> Coding convention của Kotlin
- Đối với những đoạn code viết rất dài và chúng bị quá số lượng kí tự trên một dòng code(thường là 100 kí tự). Để đánh dấu những dòng code chưa kết thúc, ở dòng tiếp theo chúng ta sẽ thụt lề đầu dòng 2 lần(2 lần tab).  Kotlin đã khuyến khích chúng ta chỉ sử dụng 1 lần thụt lề đầu dòng thay vì 2 như cũ.

- Dấu ngoặc nhọn không cần thiết sử dụng cho những nhánh của câu lệnh when và phần thân của câu lệnh if nếu không có nhánh else if/else nào khác hoặc là chúng có thể nằm trên 1 dòng
VD: if (string.isEmpty()) return

- Đối với những block trống hay block-like, cần phải tuân theo phong cách K&R
VD: val value = if (string.isEmpty()) 0 else 1

- Nếu một thân hàm biểu thức hoặc một bộ khởi tạo thuộc tính là một giá trị vô hướng hoặc kiểu trả về có thể được suy ra rõ ràng từ thân thì nó có thể được bỏ qua.
VD: override fun toString(): String = "Kotlin" 
        => override fun toString() = "Kotlin"

- Tên package đều là chữ thường, với các từ liên tiếp được ghép đơn giản với nhau (không có dấu gạch dưới).
VD: package com.snkz.appdefuse

- Còn lại, cách dặt tên biến và tên phương thức sẽ giống với Java đó là viết thường chữ cái đầu tiên.

II> Clean code (theo 5W1H)
- WHAT: clean code là gì
   => Là cách chúng ta tổ chức bố cục của các dòng code sao cho thoáng và đạt chuẩn         theo coding convention (tập hợp các quy tắc, cách tổ chức code sao cho khoa học)

- WHY: tại sao chúng ta nên biết đến clean code?
   => Clean code đồng nghĩa cách bố trí bố cục code sẽ rõ ràng, nhìn đã mắt và dễ soi 
        bug, thể hiện sự chuyên nghiệp cho lập trình viên

- WHO: Các lập trình viên có bắt buộc phải thể hiện được clean code trong phong cách               code của mình không?
   => Bất kể lập trình viên nào cũng cần phải biết các coding convention, trang bị cho           mình những kiến thức để tổ chức code sao cho clean, sao cho bắt mắt và dễ đọc nhấ..

- WHEN: tổ chức sử dụng clean code khi nào?
   => Ngay trước khi chúng ta đặt tay nhấn phím, hãy tưởng tượng dòng code hay đoạn          code  đấy sẽ được viết như thế nào cho khoa học, có dư thừa dữ kiện gì có thể               lược bỏ đi không....

- WHERE: clean code được thể hiện ở đâu?
   => Nó được thể hiện ngay trong cách chúng ta tổ chức các dòng code của project, bất 
      kể file/ class/ package nào cũng phải nhất quán theo 1 tiêu chí nào đấy chấp nhận       được.

- HOW: Áp dụng clean code như nào
   => Sử dụng các coding convention đã được đề ra ở trên để đưa vào thực tiễn và áp              dụng. Suy nghĩ cách tổ chức code trước khi đặt tay xuống code.

