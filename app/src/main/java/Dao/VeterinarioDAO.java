package Dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import model.Cliente;
import model.Veterinario;

/**
 * Created by UltronI7 on 06/12/2016.
 */

public class VeterinarioDAO implements GenericDao<Veterinario> {

    @Override
    public boolean inserir(Veterinario veterinario) {

        try{

            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference();

            myRef.child("Veterinarios").child(veterinario.getLogin()).child("nome").setValue(veterinario.getNome());
            myRef.child("Veterinarios").child(veterinario.getLogin()).child("agencia").setValue(veterinario.getAgencia());
            myRef.child("Veterinarios").child(veterinario.getLogin()).child("crmv").setValue(veterinario.getCrmv());
            myRef.child("Veterinarios").child(veterinario.getLogin()).child("email").setValue(veterinario.getEmail());
            myRef.child("Veterinarios").child(veterinario.getLogin()).child("banco").setValue(veterinario.getBanco());
            myRef.child("Veterinarios").child(veterinario.getLogin()).child("especialidade").setValue(veterinario.getEspecialidade());
            myRef.child("Veterinarios").child(veterinario.getLogin()).child("numero_conta").setValue(veterinario.getNumConta());
            myRef.child("Veterinarios").child(veterinario.getLogin()).child("senha").setValue(veterinario.getSenha());
            myRef.child("Veterinarios").child(veterinario.getLogin()).child("operacao").setValue(veterinario.getOperacao());
            return true;

        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean atualizar(Veterinario veterinario) {
        return false;
    }

    @Override
    public boolean excluir(Veterinario veterinario) {
        return false;
    }

    @Override
    public Veterinario buscar(Veterinario veterinario) {
        return null;
    }
}
