package com.app.vetline.vetline;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import controller.CCadastrarCliente;
import controller.CCadastrarVeterinario;
import controller.CPesquisarVeterinario;
import model.Cliente;
import model.Usuario;
import model.Veterinario;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_editar_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_editar_usuario);
        getSupportActionBar().hide();
        final View animatedView = (View) findViewById(R.id.layoutVerificaUsuario);
        final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
        params.topMargin= -1073;
        final LinearLayout camposUsuario = (LinearLayout) findViewById(R.id.layoutVerificaUsuario);
        final LinearLayout camposVet = (LinearLayout) findViewById(R.id.layoutVerificaVeterinario);
        camposVet.setVisibility(View.INVISIBLE);
        final Switch mudarOP = (Switch) findViewById(R.id.campo_veterinario);

        Cliente cliente = new Cliente(); // recebe o cliente da tela passada
        Veterinario veterinario = new Veterinario(); // recebe o veterinario da tela passada
        final Usuario us = Usuario.getInstance();

        final CCadastrarCliente cCadastrarCliente = new CCadastrarCliente();
        final CPesquisarVeterinario cPesquisarVeterinario = new CPesquisarVeterinario();

        Cliente clienteEditar = cCadastrarCliente.buscarCliente(cliente);
        Veterinario veterinarioEditar = cPesquisarVeterinario.pesquisarVeterinario(veterinario);

        EditText nomeUsuario = (EditText) findViewById(R.id.campo_nomeUsuarioCompletoEditar);
        EditText emailUsuario = (EditText) findViewById(R.id.campo_emailEditar);
        EditText Crmv = (EditText) findViewById(R.id.campo_crmvEditar);
        EditText especialidade = (EditText) findViewById(R.id.campo_especialidadeEditar);
        EditText banco = (EditText) findViewById(R.id.campo_bancoEditar);
        EditText operacao = (EditText) findViewById(R.id.campo_operacaoEditar);
        EditText agencia = (EditText) findViewById(R.id.campo_agenciaEditar);
        EditText numConta = (EditText) findViewById(R.id.campo_numero_contaEditar);
        EditText cpf = (EditText) findViewById(R.id.campo_cpfEditar);
        EditText endereco = (EditText) findViewById(R.id.campo_enderecoEditar);
        EditText numero = (EditText) findViewById(R.id.campo_numeroEditar);
        EditText bairro = (EditText) findViewById(R.id.campo_bairroEditar);
        EditText cidade = (EditText) findViewById(R.id.campo_cidadeEditar);
        EditText estado = (EditText) findViewById(R.id.campo_ufEditar);
        EditText login = (EditText) findViewById(R.id.campo_nomeUsuarioEditar);
        EditText senha = (EditText) findViewById(R.id.campo_senhaEditar);

        //Carrega campos do Cliente
        if(veterinario.getNome().isEmpty()) {
            nomeUsuario.setText(clienteEditar.getNome());
            emailUsuario.setText(clienteEditar.getEmail());
            cpf.setText(clienteEditar.getCpf());
            endereco.setText(clienteEditar.getEndereco());
            numero.setText(clienteEditar.getNumero());
            bairro.setText(clienteEditar.getBairro());
            cidade.setText(clienteEditar.getCidade());
            estado.setText(clienteEditar.getUf());
            login.setText(clienteEditar.getLogin());
            senha.setText(clienteEditar.getSenha());
        }
        //Carrega campos do Veterinario
        else if (cliente.getNome().isEmpty()){
            nomeUsuario.setText(veterinarioEditar.getNome());
            emailUsuario.setText(veterinarioEditar.getEmail());
            Crmv.setText(veterinarioEditar.getCrmv());
            especialidade.setText(veterinarioEditar.getEspecialidade());
            banco.setText(veterinarioEditar.getBanco());
            operacao.setText(veterinarioEditar.getOperacao());
            agencia.setText(veterinarioEditar.getAgencia());
            numConta.setText(veterinarioEditar.getNumConta());
            login.setText(veterinarioEditar.getLogin());
            senha.setText(veterinarioEditar.getSenha());
        }

        mudarOP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(camposVet.getVisibility() == View.VISIBLE){
                    camposVet.setVisibility(View.INVISIBLE);
                    camposUsuario.setVisibility(View.VISIBLE);
                    final View animatedView = (View) findViewById(R.id.camposAutenticacao);
                    final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
                    ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator)
                        {
                            params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                            animatedView.requestLayout();
                        }
                    });
                    animator.setDuration(300);
                    animator.start();
                }else{
                    camposVet.setVisibility(View.VISIBLE);
                    camposUsuario.setVisibility(View.INVISIBLE);
                    final View animatedView = (View) findViewById(R.id.camposAutenticacao);
                    final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
                    ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator)
                        {
                            params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                            animatedView.requestLayout();
                        }
                    });
                    animator.setDuration(300);
                    animator.start();

                }
            }
        });
        Button btn_editar = (Button) findViewById(R.id.btn_editarUsuario);
        btn_editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Cliente user;
                Veterinario vet;

                EditText nomeUsuario = (EditText) findViewById(R.id.campo_nomeUsuarioCompletoEditar);
                EditText emailUsuario = (EditText) findViewById(R.id.campo_emailEditar);
                EditText Crmv = (EditText) findViewById(R.id.campo_crmvEditar);
                EditText especialidade = (EditText) findViewById(R.id.campo_especialidadeEditar);
                EditText banco = (EditText) findViewById(R.id.campo_bancoEditar);
                EditText operacao = (EditText) findViewById(R.id.campo_operacaoEditar);
                EditText agencia = (EditText) findViewById(R.id.campo_agenciaEditar);
                EditText numConta = (EditText) findViewById(R.id.campo_numero_contaEditar);
                EditText cpf = (EditText) findViewById(R.id.campo_cpfEditar);
                EditText endereco = (EditText) findViewById(R.id.campo_enderecoEditar);
                EditText numero = (EditText) findViewById(R.id.campo_numeroEditar);
                EditText bairro = (EditText) findViewById(R.id.campo_bairroEditar);
                EditText cidade = (EditText) findViewById(R.id.campo_cidadeEditar);
                EditText estado = (EditText) findViewById(R.id.campo_ufEditar);
                EditText login = (EditText) findViewById(R.id.campo_nomeUsuarioEditar);
                EditText senha = (EditText) findViewById(R.id.campo_senhaEditar);

                String nome_completoStr = nomeUsuario.getText().toString();
                String emailStr = emailUsuario.getText().toString();
                String cpfStr = cpf.getText().toString();
                String enderecoStr = endereco.getText().toString();
                String numeroStr = numero.getText().toString();
                String bairroStr = bairro.getText().toString();
                String cidadeStr = cidade.getText().toString();
                String estadoStr = estado.getText().toString();
                String usuarioStr = login.getText().toString();
                String senhaStr = senha.getText().toString();
                String crmvStr = Crmv.getText().toString();
                String especialidadeStr = especialidade.getText().toString();
                String bancoStr = banco.getText().toString();
                String operacaoStr = operacao.getText().toString();
                String agenciaStr = agencia.getText().toString();
                String numContaStr = numConta.getText().toString();

                if(mudarOP.isChecked()){
                    try {

                        vet = new Veterinario();
                        vet.setLogin(usuarioStr);
                        if (vet.getLogin().isEmpty()) {
                            throw new Exception("login vazio!");
                        }
                        vet.setSenha(senhaStr);
                        if (vet.getNome().isEmpty()) {
                            throw new Exception("senha vazio!");
                        }
                        vet.setNome(nome_completoStr);
                        if (vet.getNome().isEmpty()) {
                            throw new Exception("Nome vazio!");
                        }
                        vet.setAgencia(Integer.parseInt(agenciaStr));
                        if (vet.getAgencia() == 0 ) {
                            throw new Exception("Agencia vazio!");
                        }
                        vet.setCrmv(Integer.parseInt(crmvStr));
                        if (vet.getSenha().isEmpty()) {
                            throw new Exception("Crmv vazia!");
                        }
                        vet.setEspecialidade(especialidadeStr);
                        if (vet.getEspecialidade().isEmpty()) {
                            throw new Exception("especialidade vazio!");
                        }
                        vet.setNumConta(Integer.parseInt(numContaStr));
                        if (vet.getNumConta() == 0) {
                            throw new Exception("numero conta vazio!");
                        }
                        vet.setBanco(bancoStr);
                        if (vet.getBanco().isEmpty()) {
                            throw new Exception("banco vazio!");
                        }
                        vet.setOperacao(Integer.parseInt(operacaoStr));
                        if (vet.getOperacao() == 0) {
                            throw new Exception("operacao vazio!");
                        }
                        vet.setEmail(emailStr);
                        if (vet.getEmail().isEmpty()) {
                            throw new Exception("email vazio!");
                        }

                        CCadastrarVeterinario CCadastrarVeterinario = new CCadastrarVeterinario();
                        Veterinario antigo = new Veterinario();
                        antigo.setLogin(us.getLogin());
                        antigo.setSenha(us.getSenha());
                        if (CCadastrarVeterinario.atualizaVeterinario(antigo,vet)) {
                            final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                            camposVet2.setVisibility(View.VISIBLE);
                            camposVet2.setBackgroundResource(R.drawable.screen_border_sucesso);
                            camposVet2.setMinimumHeight(210);
                            TextView msg = (TextView) findViewById(R.id.msg);
                            msg.setTextColor(Color.parseColor("#3c763d"));
                            msg.setText("SUCESSO: Veterinario Atualizado com sucesso");

                            final View animatedView2 = (View) findViewById(R.id.btn_cadastar);
                            final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView2.getLayoutParams();
                            ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                            animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                                    animatedView2.requestLayout();
                                }
                            });
                            animator.setDuration(300);
                            animator.start();
                        } else {
                            throw new Exception("Nao e possivel Atualizar");
                        }
                    }catch (Exception e){
                        final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                        camposVet2.setVisibility(View.VISIBLE);
                        camposVet2.setBackgroundResource(R.drawable.screen_border_falha);
                        camposVet2.setMinimumHeight(210);
                        TextView msg = (TextView) findViewById(R.id.msg);
                        msg.setTextColor(Color.parseColor("#a94442"));
                        msg.setText("ERROR: "+e.getMessage());

                        final View animatedView2 = (View) findViewById(R.id.btn_cadastar);
                        final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView2.getLayoutParams();
                        ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                                animatedView2.requestLayout();
                            }
                        });
                        animator.setDuration(300);
                        animator.start();
                    }

                }else{
                    try {
                        user = new Cliente();

                        user.setNome(nome_completoStr);
                        if (user.getNome().isEmpty()) {
                            throw new Exception("Nome vazio!");
                        }
                        user.setEmail(emailStr);
                        if (user.getEmail().isEmpty()) {
                            throw new Exception("Email vazio!");
                        }
                        user.setCpf(cpfStr);
                        if (user.getCpf().isEmpty()) {
                            throw new Exception("Cpf vazio!");
                        }
                        user.setEndereco(enderecoStr);
                        if (user.getEndereco().isEmpty()) {
                            throw new Exception("Endereço vazio!");
                        }
                        user.setNumero(Integer.parseInt(numeroStr));
                        if (user.getNumero() == 0) {
                            throw new Exception("Numero vazio!");
                        }
                        user.setBairro(bairroStr);
                        if (user.getBairro().isEmpty()) {
                            throw new Exception("Bairro vazio!");
                        }
                        user.setCidade(cidadeStr);
                        if (user.getCidade().isEmpty()) {
                            throw new Exception("Cidade vazio!");
                        }
                        user.setUf(estadoStr);
                        if (user.getUf().isEmpty()) {
                            throw new Exception("Estado vazio!");
                        }
                        user.setLogin(usuarioStr);
                        if (user.getLogin().isEmpty()) {
                            throw new Exception("usuario vazio!");
                        }
                        user.setSenha(senhaStr);
                        if (user.getSenha().isEmpty()) {
                            throw new Exception("senha vazia!");
                        }

                        CCadastrarCliente CCadastrarCliente = new CCadastrarCliente();
                        if (CCadastrarCliente.atualizaCliente(user)) {
                            final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                            camposVet2.setVisibility(View.VISIBLE);
                            camposVet2.setBackgroundResource(R.drawable.screen_border_sucesso);
                            camposVet2.setMinimumHeight(210);
                            TextView msg = (TextView) findViewById(R.id.msg);
                            msg.setTextColor(Color.parseColor("#3c763d"));
                            msg.setText("SUCESSO: Atualizado com sucesso");

                            final View animatedView2 = (View) findViewById(R.id.btn_cadastar);
       //                     final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView2.getLayoutParams();
                            ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                            animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                                    animatedView2.requestLayout();
                                }
                            });
                            animator.setDuration(300);
                            animator.start();
                        } else {
                            throw new Exception("Mao e possivel Atualizar");
                        }

                    }catch (Exception e){
                        final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                        camposVet2.setVisibility(View.VISIBLE);
                        camposVet2.setBackgroundResource(R.drawable.screen_border_falha);
                        camposVet2.setMinimumHeight(210);
                        TextView msg = (TextView) findViewById(R.id.msg);
                        msg.setTextColor(Color.parseColor("#a94442"));
                        msg.setText("ERROR: "+e.getMessage());

                        final View animatedView2 = (View) findViewById(R.id.btn_cadastar);
        //                final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView2.getLayoutParams();
                        ValueAnimator animator = ValueAnimator.ofInt(params.topMargin, params.WRAP_CONTENT);
                        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                params.topMargin = (Integer) valueAnimator.getAnimatedValue();
                                animatedView2.requestLayout();
                            }
                        });
                        animator.setDuration(300);
                        animator.start();
                    }
                }


            }
        });

        Button btn_resetar = (Button) findViewById(R.id.btn_resetarEditar);
        btn_editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
                // recarrega a pagina
            }
        });

        Button btn_apagar = (Button) findViewById(R.id.btn_editarUsuario);
        btn_editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cliente cliente = new Cliente(); // recebe o cliente da ativo da tela
                Veterinario veterinario = new Veterinario(); // recebe o veterinario da ativo da tela

                CCadastrarCliente cCadastrarCliente1 = new CCadastrarCliente();
                CCadastrarVeterinario cCadastrarVeterinario1 = new CCadastrarVeterinario();

                if(cliente.getNome().isEmpty()) {
                    cCadastrarVeterinario1.excluiVeterinario(veterinario);
                }
                else if (veterinario.getNome().isEmpty()) {
                    cCadastrarCliente1.excluiCliente(cliente);
                }
            }
        });

    }
}