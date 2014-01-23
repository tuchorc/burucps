class BootStrap {

    def init = { servletContext ->
		Locale.setDefault(new Locale("es"));
    }
    def destroy = {
    }
}
