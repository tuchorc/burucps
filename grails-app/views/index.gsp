<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>BuruCPS</title>
<style type="text/css" media="screen">

.mlist ul{
    font-size: 0.9em;
	list-style-type: circle;
	margin-bottom: 0.6em;
	padding: 0;
 }

.mlist li{
    font-size: 0.9em;
	list-style-type: square;
	margin-left: 0.6em;
	margin-bottom: 0.8em;
	padding: 0;
 }
 
#status {
	background-color: #eee;
	border: .2em solid #fff;
	margin: 2em 2em 1em;
	padding: 1em;
	width: 12em;
	float: left;
	-moz-box-shadow: 0px 0px 1.25em #ccc;
	-webkit-box-shadow: 0px 0px 1.25em #ccc;
	box-shadow: 0px 0px 1.25em #ccc;
	-moz-border-radius: 0.6em;
	-webkit-border-radius: 0.6em;
	border-radius: 0.6em;
}

.ie6 #status {
	display: inline;
	/* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
}

#status ul {
	font-size: 0.9em;
	list-style-type: none;
	margin-bottom: 0.6em;
	padding: 0;
}

#status li {
	line-height: 1.3;
}

#status h1 {
	text-transform: uppercase;
	font-size: 1.1em;
	margin: 0 0 0.3em;
}

#page-body {
	margin: 2em 1em 1.25em 18em;
}

h2 {
	margin-top: 1em;
	margin-bottom: 0.3em;
	font-size: 1em;
}

p {
	line-height: 1.5;
	margin: 0.25em 0;
}

#controller-list ul {
	list-style-position: inside;
}

#controller-list li {
	line-height: 1.3;
	list-style-position: inside;
	margin: 0.25em 0;
}

@media screen and (max-width: 480px) {
	#status {
		display: none;
	}
	#page-body {
		margin: 0 1em 1em;
	}
	#page-body h1 {
		margin-top: 0;
	}
}
</style>

</head>
<body>
	<a href="#page-body" class="skip"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div id="status" role="complementary">
		<h1>Funciones del Software</h1>
		<ul class="mlist">
			<li>Gestión de zonas, puntos de venta, vendedores, coordinadores
				y subagentes.</li>
			<li>Definición de puntajes objetivos, premios, y otros valores.</li>
			<li>Carga y edición de operación mensual</li>
			<li>Definición de reglas para liquidación</li>
			<li>Generación de liquidaciones de comisiones</li>
			<li>Visualización del historial de liquidaciones</li>
			<li>Visualización de resúmenes de operación mensual</li>
		</ul>
	</div>
	<div id="page-body" role="main">
		<h1>Bienvenido a BuruCPS</h1>
		<p>La función principal de la herramienta es el cálculo de
			comisiones a empleados. La fortaleza de la misma es la flexibilidad,
			tanto en la definición de la información que se recibe sobre los
			mismos, así como también la especificación de las reglas de pago de
			comisiones y/o penalizaciones para cada uno de ellos.</p>

		<div id="controller-list" role="navigation">
			<h2>Comenzar creando:</h2>
			<ul>
				<g:each var="c"
					in="${grailsApplication.controllerClasses.sort { it.fullName } }">
					<g:if test="${c.getStaticPropertyValue('linkMe', Boolean)}">
						<li class="controller"><g:link
								controller="${c.logicalPropertyName}">
								${c.getStaticPropertyValue('btnName', String)}
							</g:link></li>
					</g:if>
				</g:each>
			</ul>
		</div>
	</div>
</body>
</html>