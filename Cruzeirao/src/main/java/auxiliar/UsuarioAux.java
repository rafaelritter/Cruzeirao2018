package auxiliar;

import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class UsuarioAux {
	
	private ArrayList <Usuario> usuarios = Informacoes.Usuarios;

	public Usuario getUsuarioCPF(String cpfusuario) {
		
		for(int i=0; i< usuarios.size(); i++)
		{
			if(cpfusuario == usuarios.get(i).getCpf())
			{
				return usuarios.get(i);
			}
		}
		return null;
	}

	public void salvar(Usuario usuario)
	{
		usuarios.add(usuario);
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
}
