
package model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 *
 * @author suyas
 */
public class PetinfoModel {
    private int petId;
    private String name;
    private String species;
    private int age;
    private LocalDate birthday;
    private double lastWeight;
    private LocalDateTime lastWeightUpdate;
    private Double updatedWeight; 
    private String image; 

    // Constructors
    public PetinfoModel() {}

    public PetinfoModel(int petId, String name, String species,int age, LocalDate birthday, double lastWeight, 
               LocalDateTime lastWeightUpdate, String image) {
        this.petId = petId;
        this.name = name;
        this.species = species;
        this.age = age;
        this.birthday = birthday;
        this.lastWeight = lastWeight;
        this.lastWeightUpdate = lastWeightUpdate;
        this.image = image;
        calculateAge();
    }

    
    private void calculateAge() {
        if (birthday != null) {
            LocalDate now = LocalDate.now();
            this.age = (now.getYear() - birthday.getYear()) * 12 + 
                            (now.getMonthValue() - birthday.getMonthValue());
        }
    }

    
    public int getHumanEquivalentAge() {
        if (age <= 12) {
            return age; 
        } else {
            int years = age / 12;
            int remainingMonths = age % 12;
            return (years * 5) + (remainingMonths / 2); 
        }
    }

    
    public String getLastWeightUpdateDuration() {
        if (lastWeightUpdate == null) return "N/A";
        LocalDateTime now = LocalDateTime.now();
        long months = Period.between(lastWeightUpdate.toLocalDate(), now.toLocalDate()).getMonths();
        long days = Period.between(lastWeightUpdate.toLocalDate(), now.toLocalDate()).getDays() % 30;
        return String.format("%.1f months %d days", months + days / 30.0, days);
    }

    // Getters and Setters
    public int getPetId() { return petId; }
    public void setPetId(int petId) { this.petId = petId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public LocalDate getBirthday() { return birthday; }
    public void setBirthday(LocalDate birthday) { 
        this.birthday = birthday;
        calculateAge();
    }

    public double getLastWeight() { return lastWeight; }
    public void setLastWeight(double lastWeight) { 
        this.lastWeight = lastWeight;
        this.lastWeightUpdate = LocalDateTime.now();
    }

    public LocalDateTime getLastWeightUpdate() { return lastWeightUpdate; }
    public void setLastWeightUpdate(LocalDateTime lastWeightUpdate) { 
        this.lastWeightUpdate = lastWeightUpdate; 
    }

    public Double getUpdatedWeight() { return updatedWeight; }
    public void setUpdatedWeight(Double updatedWeight) { this.updatedWeight = updatedWeight; }

    private String getimage;
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Pet{" +
                "petId=" + petId +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", ageMonths=" + age +
                ", birthday=" + birthday +
                ", lastWeight=" + lastWeight +
                ", lastWeightUpdate=" + lastWeightUpdate +
                ", updatedWeight=" + updatedWeight +
                '}';
    }
}
    