package com.app.vetline.vetline;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;

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
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        //FirebaseApp.initializeApp(this);
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
                EditText nome_completo = (EditText) findViewById(R.id.campo_nomeUsuarioCadastro);
                EditText email = (EditText)findViewById(R.id.campo_email);
                EditText cpf = (EditText) findViewById(R.id.campo_cpf);
                EditText endereco = (EditText)findViewById(R.id.campo_endereco);
                EditText bairro = (EditText)findViewById(R.id.campo_bairro);
                EditText num = (EditText)findViewById(R.id.campo_numero);
                EditText cidade = (EditText) findViewById(R.id.campo_cidade);
                EditText estado = (EditText)findViewById(R.id.campo_uf);
                EditText usuario = (EditText) findViewById(R.id.campo_nomeLogin);
                EditText senha = (EditText) findViewById(R.id.campo_senha);
                EditText CRMV = (EditText)findViewById(R.id.campo_crmv);
                EditText especialidade = (EditText)findViewById(R.id.campo_especialidade);
                EditText banco = (EditText)findViewById(R.id.campo_banco);
                EditText operacao = (EditText)findViewById(R.id.campo_operacao);
                EditText agencia = (EditText)findViewById(R.id.campo_agencia);
                EditText numConta = (EditText)findViewById(R.id.campo_numero_conta);

                String nome_completoStr = nome_completo.getText().toString();
                String emailStr = email.getText().toString();
                String cpfStr = cpf.getText().toString();
                String enderecoStr = endereco.getText().toString();
                String numeroStr = num.getText().toString();
                String bairroStr = bairro.getText().toString();
                String cidadeStr = cidade.getText().toString();
                String estadoStr = estado.getText().toString();
                String usuarioStr = usuario.getText().toString();
                String senhaStr = senha.getText().toString();
                String crmvStr = CRMV.getText().toString();
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
                        if (vet.getSenha().isEmpty()) {
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
                        if (vet.getCrmv()== 0) {
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
                        if (vet.getEmail().isEmpty()){
                            throw new Exception("email vazio!");
                        }

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
