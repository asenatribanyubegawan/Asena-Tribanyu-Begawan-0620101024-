class Alamat
{
    String AlmTinggal;
    String KabKota;
    String KodePos;
    String Provinsi;
    Alamat(String alm, String kab, String kode, String prov)
    {
        this.AlmTinggal=alm;
        this.KabKota = kab;
        this.KodePos = kode;
        this.Provinsi = prov;
    }
}
class Penduduk
{
    String NIK;
    String Nama;
    String Pekerjaan;
    Alamat almt;
    Penduduk(String NK, String Nm, String pk, Alamat al){
        this.NIK=NK;
        this.Nama=Nm;
        this.almt=al;
    }
}
public class Agregasi
{
    public static void main(String args[])
    {
        Alamat pkp = new Alamat("Jln. Jendral Sudirman","Bekasi","33117","Jawa Barat");
        Penduduk Bagus = new Penduduk("202021","Bagus Rama","Karyawan Swasta",pkp);

        System.out.println(" DATA PENDUDUK ");
        System.out.println("---------------");
        System.out.println(" NIK      : "+Bagus.NIK);
        System.out.println(" Nama     : "+Bagus.Nama);
        System.out.println(" Alamat   : "+Bagus.almt.AlmTinggal);
        System.out.println(" Kota     : "+Bagus.almt.KabKota);
        System.out.println(" Provinsi : "+Bagus.almt.Provinsi);
    }
}