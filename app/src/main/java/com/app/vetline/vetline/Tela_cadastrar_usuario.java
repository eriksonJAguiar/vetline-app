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

import controller.CCadastrarVeterinario;
import model.Cliente;
import model.Veterinario;
import controller.CCadastrarCliente;

/**
 * Created by ProBook on 06/12/2016.
 */

public class Tela_cadastrar_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastrar_usuario);
        getSupportActionBar().hide();
        final View animatedView = (View) findViewById(R.id.layoutVerificaUsuario);
        final View teste1 = (View) findViewById(R.id.layoutVerificaVeterinario);

        final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) animatedView.getLayoutParams();
        final LinearLayout.LayoutParams params22 = (LinearLayout.LayoutParams) teste1.getLayoutParams();
        params22.height=0;

        final LinearLayout camposUsuario = (LinearLayout) findViewById(R.id.layoutVerificaUsuario);
        final LinearLayout camposVet = (LinearLayout) findViewById(R.id.layoutVerificaVeterinario);

        camposVet.setVisibility(View.INVISIBLE);
        final Switch mudarOP = (Switch) findViewById(R.id.campo_veterinario);
        mudarOP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(camposVet.getVisibility() == View.VISIBLE){
                        camposVet.setVisibility(View.INVISIBLE);

                    camposUsuario.setVisibility(View.VISIBLE);
                    params22.height=0;
                    params.height=params.WRAP_CONTENT;



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
                    params.height=0;
                    params22.height=params.WRAP_CONTENT;
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
        Button btn_cadastrar1 = (Button) findViewById(R.id.btn_cadastar);
        btn_cadastrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cliente user;
                Veterinario vet;
                EditText nome_completo = (EditText) findViewById(R.id.campo_nomeUsuario);
                String nome_completoStr = nome_completo.getText().toString();

                EditText email = (EditText)findViewById(R.id.campo_email);
                EditText cpf = (EditText) findViewById(R.id.campo_cpf);
                EditText endereco = (EditText)findViewById(R.id.campo_endereco);
                EditText bairro = (EditText)findViewById(R.id.campo_bairro);
                EditText num = (EditText)findViewById(R.id.campo_numero);
                EditText cidade = (EditText) findViewById(R.id.campo_cidade);
                EditText estado = (EditText)findViewById(R.id.campo_uf);
                EditText usuario = (EditText) findViewById(R.id.campo_nomeUsuario);
                EditText senha = (EditText) findViewById(R.id.campo_senha);
                EditText CRMV = (EditText)findViewById(R.id.campo_crmv);
                String especialidade = findViewById(R.id.campo_especialidade).toString();
                String banco = findViewById(R.id.campo_banco).toString();
                String operacao = findViewById(R.id.campo_operacao).toString();
                String agencia = findViewById(R.id.campo_agencia).toString();
                String numConta = findViewById(R.id.campo_numero_conta).toString();

                if(mudarOP.isChecked()){
                    try {
                //        crmv = findViewById(R.id.campo_crmv).toString();
                        vet = new Veterinario();
                        /*vet.setEmail(email);
                        if (vet.getEmail().isEmpty()) {
                            throw new Exception("Email vazio!");
                        }
                        vet.setNome(nome_completo);
                        if (vet.getNome().isEmpty()) {
                            throw new Exception("Nome Completo vazio!");
                        }
                        vet.setTelefone(telefone);
                        if (vet.getTelefone().isEmpty()) {
                            throw new Exception("Telefone vazio!");
                        }
                        vet.setLogin(usuario);
                        if (vet.getLogin().isEmpty()) {
                            throw new Exception("Usuario vazio!");
                        }
                        vet.setSenha(senha);
                        if (vet.getSenha().isEmpty()) {
                            throw new Exception("Senha vazia!");
                        }
                        vet.setCrmv(crmv);
                        if (vet.getCrmv().isEmpty()) {
                            throw new Exception("CRMV vazio!");
                        }
                        */
                        CCadastrarVeterinario CCadastrarVeterinario = new CCadastrarVeterinario();
                        if (CCadastrarVeterinario.cadastrarVeterinario(vet)) {
                            final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                            camposVet2.setVisibility(View.VISIBLE);
                            camposVet2.setBackgroundResource(R.drawable.screen_border_sucesso);
                            camposVet2.setMinimumHeight(210);
                            TextView msg = (TextView) findViewById(R.id.msg);
                            msg.setTextColor(Color.parseColor("#3c763d"));
                            msg.setText("SUCESSO: Veterinario cadastrado com sucesso");

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
                                throw new Exception("Nao e possivel cadastrar");
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
                        user.setEmail(email);
                        if (user.getEmail().isEmpty()) {
                            throw new Exception("Email vazio!");
                        }
                        user.setCpf(cpf);
                        if (user.getCpf().isEmpty()) {
                            throw new Exception("Cpf vazio!");
                        }
                        user.setEndereco(endereco);
                        if (user.getEndereco().isEmpty()) {
                            throw new Exception("Endereço vazio!");
                        }
                        user.setNum(Integer.parseInt(num));
                        if (user.getNum() == 0) {
                            throw new Exception("Numero vazio!");
                        }
                        user.setBairro(bairro);
                        if (user.getBairro().isEmpty()) {
                            throw new Exception("Bairro vazio!");
                        }
                        user.setCidade(cidade);
                        if (user.getCidade().isEmpty()) {
                            throw new Exception("Cidade vazio!");
                        }
                        user.setUf(estado);
                        if (user.getUf().isEmpty()) {
                            throw new Exception("Estado vazio!");
                        }
                        user.setLogin(usuario);
                        if (user.getLogin().isEmpty()) {
                            throw new Exception("usuario vazio!");
                        }
                        user.setSenha(senha);
                        if (user.getSenha().isEmpty()) {
                            throw new Exception("senha vazia!");
                        }

                        CCadastrarCliente CCadastrarCliente = new CCadastrarCliente();
                        if (CCadastrarCliente.cadastrarCliente(user)) {
                            final LinearLayout camposVet2 = (LinearLayout) findViewById(R.id.mensagens);
                            camposVet2.setVisibility(View.VISIBLE);
                            camposVet2.setBackgroundResource(R.drawable.screen_border_sucesso);
                            camposVet2.setMinimumHeight(210);
                            TextView msg = (TextView) findViewById(R.id.msg);
                            msg.setTextColor(Color.parseColor("#3c763d"));
                            msg.setText("SUCESSO: Cadastrado com sucesso");

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
                            throw new Exception("Nao e possivel cadastrar");
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
                }


            }
        });

    }
}
