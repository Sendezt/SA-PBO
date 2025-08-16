package pertemuan_4;

class Nested {
    void cetakLuar(){
        System.out.println("Ini adalah kelas luar");
    }
    class Tengah {
        void cetakTengah(){
            System.out.println("Ini adalah kelas tengah");
        }
        class Dalam {
            void cetakDalam(){
                System.out.println("Ini adalah kelas dalam");
            }
        }
    }
}
