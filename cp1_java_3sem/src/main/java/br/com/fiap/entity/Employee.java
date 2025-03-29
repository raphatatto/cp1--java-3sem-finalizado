package br.com.fiap.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TAB_FUNCIONARIO")

// Lombok
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name = "id_employee")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nm_employee")
    private String name;

    @Column(name = "worked_hours")
    private int workedHours;

    @Column(name = "vl_hour")
    private double valuePerHour;

    public double calcSalary() {
        return workedHours * valuePerHour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee: ").append(name).append("\n");
        if (id != null) sb.append("ID: ").append(id).append("\n");
        sb.append("Worked Hours: ").append(workedHours).append("\n");
        sb.append("Value per Hour: ").append(valuePerHour).append("\n");
        sb.append("Salary: ").append(calcSalary()).append("\n");
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
}
