package controller;

public class Servlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
    private DAO dao;

    public void init() {
        dao = new DAO();
    }

	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        String action = request.getServletPath();

			        try {
			            switch (action) {
			                case "/new":
			                    showNewForm(request, response);
			                    break;
			                case "/insert":
			                    insertUser(request, response);
			                    break;
			                case "/delete":
			                    deleteUser(request, response);
			                    break;
			                case "/edit":
			                    showEditForm(request, response);
			                    break;
			                case "/update":
			                    updateUser(request, response);
			                    break;
			                default:
			                    listUser(request, response);
			                    break;
			            }catch (SQLException ex) {
			                throw new ServletException(ex);
			            }

}
			        private void listaBanda(HttpServletRequest request, HttpServletResponse response)
			        	    throws SQLException, IOException, ServletException {
			        	        List < Banda > banda = dao.getAllBanda();
			        	        request.setAttribute("listaBanda"bandalistaBanda);
			        	        RequestDispatcher dispatcher = request.getRequestDispatcher(".jsp");
			        	        dispatcher.forward(request, response);
			        	    }
			        
			        private void adicionaBanda(HttpServletRequest request, HttpServletResponse response)
			        	    throws SQLException, IOException {
			        	        String name = request.getParameter("nome");
			        	        String email = request.getParameter("genero");
			        	        
			        	        Banda newBanda = new Banda(name, genero);
			        	        dao.saveBanda(newBanda);
			        	        response.sendRedirect("list");
			        	    }
			        
			        private void editarBanda(HttpServletRequest request, HttpServletResponse response)
			        	    throws SQLException, IOException {
			        	        int idbanda = Integer.parseInt(request.getParameter("idbanda"));
			        	        String nome = request.getParameter("nome");
			        	        String genero = request.getParameter("genero");
			        	        

			        	        Banda banda = new Banda(idbanda, nome, genero);
			        	        dao.updateUser(banda);
			        	        response.sendRedirect("list");
			        	    }

			        	    private void deleteBanda(HttpServletRequest request, HttpServletResponse response)
			        	    throws SQLException, IOException {
			        	        int idbanda = Integer.parseInt(request.getParameter("idbanda"));
			        	        dao.deleteUser(idbanda);
			        	        response.sendRedirect("list");
			        	    }
}

