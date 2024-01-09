package paquete;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMXML {
	
	String rutaFichero;

	public DOMXML() {
		
	}
	
	public Document obtenerDocument(String rutaFichero) {
		
		Document doc = null;
		
		try {
			  File file = new File(rutaFichero);
			  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			  doc = dBuilder.parse(file);
			  
		} catch(Exception e) {
			  System.out.println(e.getMessage());
		
		} 
		
		return doc;
	}
	
	public Document obtenerDocument() {
		
		Document doc = null;
		
		try {
			  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			  doc = dBuilder.newDocument();
			  
		} catch(Exception e) {
			  System.out.println(e.getMessage());
		
		} 
		
		return doc;
	}
	
	public ArrayList<Reserva> leerDocument(Document doc) {
		
		ArrayList<Reserva> arrayListaReservas = new ArrayList<>();
		NodeList listaReservas = doc.getElementsByTagName("reserva");
		
		for (int i = 0; i < listaReservas.getLength(); i++) {
			
			Node nodoReserva = listaReservas.item(i);
			
			if(nodoReserva.getNodeType() == Node.ELEMENT_NODE) {
				Element elementoReserva = (Element) nodoReserva;
				arrayListaReservas.add(obtenerReserva(elementoReserva));
			}
		}
		
		return arrayListaReservas;
	}
	
	private Reserva obtenerReserva(Element elementoReserva) {
		
		Reserva reservaActual = new Reserva();
		
		reservaActual.setNombre(comprobarContenido("nombre", elementoReserva));
		reservaActual.setTelefono(comprobarContenido("telefono", elementoReserva));
		reservaActual.setFechaReserva(comprobarContenido("fechaEvento", elementoReserva));
		reservaActual.setTipoReserva(comprobarContenido("tipo", elementoReserva));
		reservaActual.setNumeroInvitados(comprobarContenido("asistentes", elementoReserva));
		reservaActual.setTipoCocina(comprobarContenido("tipoCocina", elementoReserva));
		
		if (reservaActual.getTipoReserva().equals("Congreso")) {
			reservaActual.setNumeroJornadas(comprobarContenido("numeroJornadas", elementoReserva));
			reservaActual.setRequiereHabitaciones(comprobarContenido("requiereHabitaciones", elementoReserva));
		} else if (reservaActual.getTipoReserva().equals("Banquete")) {
			reservaActual.setComensalesMesa(comprobarContenido("comensalesMesa", elementoReserva));
			reservaActual.setTipoMesa(comprobarContenido("tipoMesa", elementoReserva));
		}
		
		return reservaActual;
	}
	
	private String comprobarContenido(String tagName, Element reservaActual) {
		String contenido = "";
		
		if (reservaActual.getElementsByTagName(tagName).getLength() > 0) {
			contenido = reservaActual.getElementsByTagName(tagName).item(0).getTextContent();
		}
		return contenido;
	}
	
	public void escribirDocument(Document doc, ArrayList<Reserva> listaReservas) {
		
		Element elementoRaiz = doc.createElement("reservas");
		doc.appendChild(elementoRaiz);
		
		for (Reserva r: listaReservas) {
			escribirReserva(doc, r, elementoRaiz);
		}
	}
	
	private void escribirReserva(Document doc, Reserva reservaActual, Element elementoRaiz) {
		
		Element elementoReserva = doc.createElement("reserva");
		elementoRaiz.appendChild(elementoReserva);
		
		Element elementoNombre = doc.createElement("nombre");
		elementoNombre.appendChild(doc.createTextNode(reservaActual.getNombre()));
		elementoReserva.appendChild(elementoNombre);
		
		Element elementoTelefono = doc.createElement("telefono");
		elementoTelefono.appendChild(doc.createTextNode(reservaActual.getTelefono()));
		elementoReserva.appendChild(elementoTelefono);
		
		Element elementoFechaEvento = doc.createElement("fechaEvento");
		elementoFechaEvento.appendChild(doc.createTextNode(reservaActual.getFechaReserva()));
		elementoReserva.appendChild(elementoFechaEvento);
		
		Element elementoTipo = doc.createElement("tipo");
		elementoTipo.appendChild(doc.createTextNode(reservaActual.getTipoReserva()));
		elementoReserva.appendChild(elementoTipo);
		
		Element elementoAsistentes = doc.createElement("asistentes");
		elementoAsistentes.appendChild(doc.createTextNode(reservaActual.getNumeroInvitados()));
		elementoReserva.appendChild(elementoAsistentes);
		
		Element elementoTipoCocina = doc.createElement("tipoCocina");
		elementoTipoCocina.appendChild(doc.createTextNode(reservaActual.getTipoCocina()));
		elementoReserva.appendChild(elementoTipoCocina);
		
		if (reservaActual.getTipoReserva().equals("Congreso")) {
			
			Element elementoNumeroJornadas = doc.createElement("numeroJornadas");
			elementoNumeroJornadas.appendChild(doc.createTextNode(reservaActual.getNumeroJornadas()));
			elementoReserva.appendChild(elementoNumeroJornadas);
			
			Element elementoRequiereHabitaciones = doc.createElement("requiereHabitaciones");
			elementoRequiereHabitaciones.appendChild(doc.createTextNode(reservaActual.getRequiereHabitaciones()));
			elementoReserva.appendChild(elementoRequiereHabitaciones);
			
		} else if (reservaActual.getTipoReserva().equals("Banquete")) {
			
			Element elementoTipoMesa = doc.createElement("tipoMesa");
			elementoTipoMesa.appendChild(doc.createTextNode(reservaActual.getTipoMesa()));
			elementoReserva.appendChild(elementoTipoMesa);
			
			Element elementoComensalesMesa = doc.createElement("comensalesMesa");
			elementoComensalesMesa.appendChild(doc.createTextNode(reservaActual.getComensalesMesa()));
			elementoReserva.appendChild(elementoComensalesMesa);
		}
	}
	
	public void escribirArchivo(Document doc) {
		
		try {
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("reservas.xml"));

			transformer.transform(source, result);
			
			
		} catch(Exception e) {
			e.printStackTrace();
				
		}
	}
}
