package model;

/**
 *
 * @author fetnat
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.sql.Blob;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @Column(name = "PROID")
    private int proID;

    @Column(name = "PNAME")
    private String pname;

    @Column(name = "PPRICE")
    private double pprice;

    @Column(nullable=true,name = "PWEIGHT")
    private Double pweight;

    @Column(nullable=true,name = "PSTOCK")
    private Integer pstock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATID", nullable = false, //
            foreignKey = @ForeignKey(name = "SYS_C007203"))

    private Category category;

    @Column(name = "PIMAGE")
    private Blob photo;

    
    
    
    
    public Product() {
    }
    
   
    

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPprice() {
        return pprice;
    }

    public void setPprice(double pprice) {
        this.pprice = pprice;
    }

    public Double getPweight() {
        return pweight;
    }

    public void setPweight(Double pweight) {
        this.pweight = pweight;
    }

    public Integer getPstock() {
        return pstock;
    }

    public void setPstock(Integer pstock) {
        this.pstock = pstock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }
    
    
    
    
    
    
    
    
    
    

}
