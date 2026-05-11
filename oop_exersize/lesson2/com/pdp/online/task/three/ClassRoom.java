package oop_exersize.lesson2.com.pdp.online.task.three;
/**
 * <code>ClassRoom</code> Класс для создание комнаты
 */
public class ClassRoom {
    Teacher teacher;
    Student[] student;
    int roomNumber;
    int studentCount;

    public ClassRoom(Teacher teacher,Student[] srStudent,int roomNumber){
        this.teacher = teacher;
        this.student = srStudent;
        this.roomNumber = roomNumber;
        this.studentCount = srStudent.length;
    }
    /**
     * 
     * @return Возврашает номер комнаты
     */
    public int getRoomNumber() {
        return roomNumber;
    }
    public Student[] getStudent() {
        return student;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setStudent(Student[] student) {
        this.student = student;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}
