package Dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import model.Animal;
import model.Cliente;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class AnimalDAO implements GenericDao<Animal> {

    @Override
    public boolean inserir(Animal animal) {
        try {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference();

            myRef.child("Clientes").child(animal.getNome()).child("nome").setValue(animal.getNome());
            myRef.child("Clientes").child(animal.getGenero()).child("genero").setValue(animal.getGenero());
            myRef.child("Clientes").child(animal.getRaca()).child("raca").setValue(animal.getRaca());
            myRef.child("Clientes").child(animal.getTamanho()).child("tamanho").setValue(animal.getTamanho());
            myRef.child("Clientes").child(String.valueOf(animal.getPedigree())).child("pedigree").setValue(animal.getPedigree());


            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean atualizar(Animal animal) {
        return false;
    }

    @Override
    public boolean excluir(Animal animal) {
        return false;
    }

    @Override
    public Animal buscar(Animal animal) {
        return null;
    }
}
