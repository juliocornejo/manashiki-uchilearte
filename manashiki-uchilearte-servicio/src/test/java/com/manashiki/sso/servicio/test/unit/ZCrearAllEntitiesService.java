package com.manashiki.sso.servicio.test.unit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.ArchivoSolicitudDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ComunaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.FinalidadCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.RegionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;
import com.manashiki.uchilearte.servicio.FactoryServicio;

import vijnana.utilidades.component.utilidades.AppDate;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:servicio-context.xml")
public class ZCrearAllEntitiesService {

	private static final Log objLog = LogFactory.getLog(ZCrearAllEntitiesService.class);

	@Autowired
	FactoryServicio factoryServicioDAO;

	@Test
	public void llenarBaseDeDatos(){
		/*DATOS*/
		/*****************************/
		crearRegionTest();
		crearComunasTest();
		/*****************************/
		crearProgramaUniversidadServicioTest();
		crearProgramaUniversidadPostulacionServicioTest();

		crearFinalidadCertificadoServicioTest();
		crearTipoCertificadoServicioTest();
		crearTipoSolicitudServicioTest();
		/*RELACIONES*/
		crearArchivoSolicitudTest();
		crearSolicitudCertificadoTest();
		crearSolicitudAcademicaTest();
		crearSolicitudPostulacionTest();

	}

	public void crearRegionTest(){

		RegionDTO regionDTOA=new RegionDTO();
		RegionDTO regionDTOB=new RegionDTO();
		RegionDTO regionDTOC=new RegionDTO();
		RegionDTO regionDTOD=new RegionDTO();
		RegionDTO regionDTOE=new RegionDTO();
		RegionDTO regionDTOF=new RegionDTO();
		RegionDTO regionDTOG=new RegionDTO();
		RegionDTO regionDTOH=new RegionDTO();
		RegionDTO regionDTOI=new RegionDTO();
		RegionDTO regionDTOJ=new RegionDTO();
		RegionDTO regionDTOK=new RegionDTO();
		RegionDTO regionDTOL=new RegionDTO();
		RegionDTO regionDTOM=new RegionDTO();
		RegionDTO regionDTON=new RegionDTO();
		RegionDTO regionDTOO=new RegionDTO();
		RegionDTO regionDTOP=new RegionDTO();
		
		
		regionDTOA.setCodigoRegion("AP");
		regionDTOA.setNombreRegion("Región de Arica y Parinacota");
		regionDTOA.setNombreRegionLower(regionDTOA.getNombreRegion().toLowerCase());
		regionDTOA.setDescripcionRegion("decimoquinta region de Chile");
		
		regionDTOB.setCodigoRegion("TA");
		regionDTOB.setNombreRegion("Región de Tarapaca");
		regionDTOB.setNombreRegionLower(regionDTOB.getNombreRegion().toLowerCase());
		regionDTOB.setDescripcionRegion("primera region de Chile");

		regionDTOC.setCodigoRegion("AN");
		regionDTOC.setNombreRegion("Región de Antofagasta");
		regionDTOC.setNombreRegionLower(regionDTOC.getNombreRegion().toLowerCase());
		regionDTOC.setDescripcionRegion("segunda region de Chile");

		regionDTOD.setCodigoRegion("AT");
		regionDTOD.setNombreRegion("Región de Atacama");
		regionDTOD.setNombreRegionLower(regionDTOD.getNombreRegion().toLowerCase());
		regionDTOD.setDescripcionRegion("tercera region de Chile");

		regionDTOE.setCodigoRegion("CO");
		regionDTOE.setNombreRegion("Región de Coquimbo");
		regionDTOE.setNombreRegionLower(regionDTOE.getNombreRegion().toLowerCase());
		regionDTOE.setDescripcionRegion("cuarta region de Chile");

		regionDTOF.setCodigoRegion("VA");
		regionDTOF.setNombreRegion("Región de Valparaiso");
		regionDTOF.setNombreRegionLower(regionDTOF.getNombreRegion().toLowerCase());
		regionDTOF.setDescripcionRegion("quinta region de Chile");

		regionDTOG.setCodigoRegion("OH");
		regionDTOG.setNombreRegion("Región del Libertador Bernado Ohiggins");
		regionDTOG.setNombreRegionLower(regionDTOG.getNombreRegion().toLowerCase());
		regionDTOG.setDescripcionRegion("sexta region de Chile");

		regionDTOH.setCodigoRegion("MA");
		regionDTOH.setNombreRegion("Región del Maule");
		regionDTOH.setNombreRegionLower(regionDTOH.getNombreRegion().toLowerCase());
		regionDTOH.setDescripcionRegion("septima region de Chile");

		regionDTOI.setCodigoRegion("NB");
		regionDTOI.setNombreRegion("Región del Ñuble");
		regionDTOI.setNombreRegionLower(regionDTOI.getNombreRegion().toLowerCase());
		regionDTOI.setDescripcionRegion("Región del Ñuble");
		
		regionDTOJ.setCodigoRegion("BI");
		regionDTOJ.setNombreRegion("Región del Bio-Bio");
		regionDTOJ.setNombreRegionLower(regionDTOJ.getNombreRegion().toLowerCase());
		regionDTOJ.setDescripcionRegion("octava region de Chile");

		regionDTOK.setCodigoRegion("AR");
		regionDTOK.setNombreRegion("Región de La Araucania");
		regionDTOK.setNombreRegionLower(regionDTOK.getNombreRegion().toLowerCase());
		regionDTOK.setDescripcionRegion("novena region de Chile");
		
		regionDTOL.setCodigoRegion("LR");
		regionDTOL.setNombreRegion("Región de los Rios");
		regionDTOL.setNombreRegionLower(regionDTOL.getNombreRegion().toLowerCase());
		regionDTOL.setDescripcionRegion("decimocuarta region de Chile");
		
		regionDTOM.setCodigoRegion("LL");
		regionDTOM.setNombreRegion("Región de Los Lagos");
		regionDTOM.setNombreRegionLower(regionDTOM.getNombreRegion().toLowerCase());
		regionDTOM.setDescripcionRegion("decima region de Chile");

		regionDTON.setCodigoRegion("AI");
		regionDTON.setNombreRegion("Región de Aysen y del General Carlos Ibañez");
		regionDTON.setNombreRegionLower(regionDTON.getNombreRegion().toLowerCase());
		regionDTON.setDescripcionRegion("onceava region de Chile");

		regionDTOO.setCodigoRegion("MG");
		regionDTOO.setNombreRegion("Región de Magallanes");
		regionDTOO.setNombreRegionLower(regionDTOO.getNombreRegion().toLowerCase());
		regionDTOO.setDescripcionRegion("duodecima region de Chile");

		regionDTOP.setCodigoRegion("RM");
		regionDTOP.setNombreRegion("Región Metropolitana");
		regionDTOP.setNombreRegionLower(regionDTOP.getNombreRegion().toLowerCase());
		regionDTOP.setDescripcionRegion("region metropolitana de Santiago");

		regionDTOA = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOA);// 1
		regionDTOB = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOB);// 2
		regionDTOC = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOC);// 3
		regionDTOD = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOD);// 4
		regionDTOE = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOE);// 5
		regionDTOF = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOF);// 6
		regionDTOG = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOG);// 7
		regionDTOH = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOH);// 8
		regionDTOI = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOI);// 9
		regionDTOJ = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOJ);// 10
		regionDTOK = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOK);// 11
		regionDTOL = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOL);// 12
		regionDTOM = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOM);// 13
		regionDTON = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTON);// 14
		regionDTOO = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOO);// 15
		regionDTOP = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOP);// 16

	}

	public void crearComunasTest(){
		/*DATOS*/
		crearComunaRegionAricaTest();
		crearComunaRegionTarapacaTest();
		crearComunaRegionAntofagastaTest();
		crearComunaRegionAtacamaTest();
		crearComunaRegionCoquimboTest();
		crearComunaRegionValparaisoTest();
		crearComunaRegionOhigginsTest();
		crearComunaRegionMauleTest();
		crearComunaRegionNubleTest();
		crearComunaRegionBioBioTest(); //10
		crearComunaRegionAraucaniaTest();
		crearComunaRegionRiosTest();
		crearComunaRegionLosLagosTest();
		crearComunaRegionAysenTest();
		crearComunaRegionMagallanesTest();
		crearComunaRegionRMTest();
		
		
		/*DATOS*/
	}
	
	public void crearComunaRegionAricaTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();

		comunaDTOA.setCodigoComuna("XV-1");
		comunaDTOA.setNombreComuna("ARICA");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(1);

		comunaDTOB.setCodigoComuna("XV-2");
		comunaDTOB.setNombreComuna("CAMARONES");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(1);

		comunaDTOC.setCodigoComuna("XV-3");
		comunaDTOC.setNombreComuna("GENERAL LAGOS");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(1);

		comunaDTOD.setCodigoComuna("XV-4");
		comunaDTOD.setNombreComuna("PUTRE");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(1);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
	}
	
	public void crearComunaRegionTarapacaTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();

		comunaDTOA.setCodigoComuna("I-1");
		comunaDTOA.setNombreComuna("ALTO HOSPICIO");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(2);

		comunaDTOB.setCodigoComuna("I-2");
		comunaDTOB.setNombreComuna("CAMINA");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(2);

		comunaDTOC.setCodigoComuna("I-3");
		comunaDTOC.setNombreComuna("COLCHANE");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(2);

		comunaDTOD.setCodigoComuna("I-4");
		comunaDTOD.setNombreComuna("HUARA");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(2);

		comunaDTOE.setCodigoComuna("I-5");
		comunaDTOE.setNombreComuna("IQUIQUE");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(2);

		comunaDTOF.setCodigoComuna("I-6");
		comunaDTOF.setNombreComuna("PICA");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(2);

		comunaDTOG.setCodigoComuna("I-7");
		comunaDTOG.setNombreComuna("POZO ALMONTE");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(2);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
	}

	public void crearComunaRegionAntofagastaTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();

		comunaDTOA.setCodigoComuna("II-1");
		comunaDTOA.setNombreComuna("ANTOFAGASTA");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(3);

		comunaDTOB.setCodigoComuna("II-2");
		comunaDTOB.setNombreComuna("CALAMA");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(3);

		comunaDTOC.setCodigoComuna("II-3");
		comunaDTOC.setNombreComuna("MARIA ELENA");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(3);

		comunaDTOD.setCodigoComuna("II-4");
		comunaDTOD.setNombreComuna("MEJILLONES");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(3);

		comunaDTOE.setCodigoComuna("II-5");
		comunaDTOE.setNombreComuna("OLLAGUE");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(3);

		comunaDTOF.setCodigoComuna("II-6");
		comunaDTOF.setNombreComuna("SAN PEDRO DE ATACAMA");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(3);

		comunaDTOG.setCodigoComuna("II-7");
		comunaDTOG.setNombreComuna("SIERRA GORDA");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(3);

		comunaDTOH.setCodigoComuna("II-8");
		comunaDTOH.setNombreComuna("TALTAL");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(3);

		comunaDTOI.setCodigoComuna("II-9");
		comunaDTOI.setNombreComuna("TOCOPILLA");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(3);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
	}
	public void crearComunaRegionAtacamaTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();

		comunaDTOA.setCodigoComuna("III-1");
		comunaDTOA.setNombreComuna("ALTO DEL CARMEN");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(4);

		comunaDTOB.setCodigoComuna("III-2");
		comunaDTOB.setNombreComuna("CALDERA");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(4);

		comunaDTOC.setCodigoComuna("III-3");
		comunaDTOC.setNombreComuna("CHAÑARAL");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(4);

		comunaDTOD.setCodigoComuna("III-4");
		comunaDTOD.setNombreComuna("COPIAPO");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(4);

		comunaDTOE.setCodigoComuna("III-5");
		comunaDTOE.setNombreComuna("DIEGO DE ALMAGRO");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(4);

		comunaDTOF.setCodigoComuna("III-6");
		comunaDTOF.setNombreComuna("FREIRINA");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(4);

		comunaDTOG.setCodigoComuna("III-7");
		comunaDTOG.setNombreComuna("HUASCO");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(4);

		comunaDTOH.setCodigoComuna("III-8");
		comunaDTOH.setNombreComuna("TIERRA AMARILLA");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(4);

		comunaDTOI.setCodigoComuna("III-9");
		comunaDTOI.setNombreComuna("VALLENAR");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(4);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
	}
	public void crearComunaRegionCoquimboTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO();
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();

		comunaDTOA.setCodigoComuna("IV-1");
		comunaDTOA.setNombreComuna("ANDACOLLO");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(5);

		comunaDTOB.setCodigoComuna("IV-2");
		comunaDTOB.setNombreComuna("CANELA");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(5);

		comunaDTOC.setCodigoComuna("IV-3");
		comunaDTOC.setNombreComuna("COMBARBALA");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(5);

		comunaDTOD.setCodigoComuna("IV-4");
		comunaDTOD.setNombreComuna("COQUIMBO");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(5);

		comunaDTOE.setCodigoComuna("IV-5");
		comunaDTOE.setNombreComuna("ILLAPEL");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(5);

		comunaDTOF.setCodigoComuna("IV-6");
		comunaDTOF.setNombreComuna("LA HIGUERA");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(5);

		comunaDTOG.setCodigoComuna("IV-7");
		comunaDTOG.setNombreComuna("LA SERENA");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(5);

		comunaDTOH.setCodigoComuna("IV-8");
		comunaDTOH.setNombreComuna("LOS VILOS");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(5);

		comunaDTOI.setCodigoComuna("IV-9");
		comunaDTOI.setNombreComuna("MONTE PATRIA");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(5);

		comunaDTOJ.setCodigoComuna("IV-10");
		comunaDTOJ.setNombreComuna("OVALLE");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(5);

		comunaDTOK.setCodigoComuna("IV-11");
		comunaDTOK.setNombreComuna("PAIHUANO");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(5);

		comunaDTOL.setCodigoComuna("IV-12");
		comunaDTOL.setNombreComuna("PUNITAQUI");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(5);

		comunaDTOM.setCodigoComuna("IV-13");
		comunaDTOM.setNombreComuna("RIO HURTADO");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(5);

		comunaDTON.setCodigoComuna("IV-14");
		comunaDTON.setNombreComuna("SALAMANCA");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(5);

		comunaDTOO.setCodigoComuna("IV-15");
		comunaDTOO.setNombreComuna("VICUÑA");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(5);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
	}

	public void crearComunaRegionValparaisoTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO();
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO();
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO();
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOBB=new ComunaDTO();
		ComunaDTO comunaDTOCC=new ComunaDTO();
		ComunaDTO comunaDTODD=new ComunaDTO();
		ComunaDTO comunaDTOEE=new ComunaDTO();
		ComunaDTO comunaDTOFF=new ComunaDTO();
		ComunaDTO comunaDTOGG=new ComunaDTO();
		ComunaDTO comunaDTOHH=new ComunaDTO();
		ComunaDTO comunaDTOII=new ComunaDTO();
		ComunaDTO comunaDTOJJ=new ComunaDTO();
		ComunaDTO comunaDTOKK=new ComunaDTO();
		ComunaDTO comunaDTOLL=new ComunaDTO();

		comunaDTOA.setCodigoComuna("V-1");
		comunaDTOA.setNombreComuna("ALGARROBO");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(6);

		comunaDTOB.setCodigoComuna("V-2");
		comunaDTOB.setNombreComuna("CABILDO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(6);

		comunaDTOC.setCodigoComuna("V-3");
		comunaDTOC.setNombreComuna("CALLE LARGA");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(6);

		comunaDTOD.setCodigoComuna("V-4");
		comunaDTOD.setNombreComuna("CARTAGENA");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(6);

		comunaDTOE.setCodigoComuna("V-5");
		comunaDTOE.setNombreComuna("CASABLANCA");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(6);

		comunaDTOF.setCodigoComuna("V-6");
		comunaDTOF.setNombreComuna("CATEMU");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(6);

		comunaDTOG.setCodigoComuna("V-7");
		comunaDTOG.setNombreComuna("CONCON");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(6);

		comunaDTOH.setCodigoComuna("V-8");
		comunaDTOH.setNombreComuna("EL QUISCO");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(6);

		comunaDTOI.setCodigoComuna("V-9");
		comunaDTOI.setNombreComuna("EL TABO");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(6);

		comunaDTOJ.setCodigoComuna("V-10");
		comunaDTOJ.setNombreComuna("HIJUELAS");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(6);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("V-11");
		comunaDTOK.setNombreComuna("ISLA DE PASCUA");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(6);

		comunaDTOL.setCodigoComuna("V-12");
		comunaDTOL.setNombreComuna("JUAN FERNANDEZ");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(6);

		comunaDTOM.setCodigoComuna("V-13");
		comunaDTOM.setNombreComuna("LA CALERA");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(6);

		comunaDTON.setCodigoComuna("V-14");
		comunaDTON.setNombreComuna("LA CRUZ");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(6);

		comunaDTOO.setCodigoComuna("V-15");
		comunaDTOO.setNombreComuna("LA LIGUA");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(6);

		comunaDTOP.setCodigoComuna("V-16");
		comunaDTOP.setNombreComuna("LIMACHE");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(6);

		comunaDTOQ.setCodigoComuna("V-17");
		comunaDTOQ.setNombreComuna("LLAY LLAY");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(6);

		comunaDTOR.setCodigoComuna("V-18");
		comunaDTOR.setNombreComuna("LOS ANDES");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(6);

		comunaDTOS.setCodigoComuna("V-19");
		comunaDTOS.setNombreComuna("NOGALES");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(6);

		comunaDTOT.setCodigoComuna("V-20");
		comunaDTOT.setNombreComuna("OLMUE");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(6);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("V-21");
		comunaDTOU.setNombreComuna("PANQUEHUE");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(6);

		comunaDTOV.setCodigoComuna("V-22");
		comunaDTOV.setNombreComuna("PAPUDO");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(6);

		comunaDTOW.setCodigoComuna("V-23");
		comunaDTOW.setNombreComuna("PETORCA");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(6);

		comunaDTOX.setCodigoComuna("V-24");
		comunaDTOX.setNombreComuna("PUCHUNCAVI");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(6);

		comunaDTOY.setCodigoComuna("V-25");
		comunaDTOY.setNombreComuna("PUTAENDO");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(6); //25

		comunaDTOZ.setCodigoComuna("V-26");
		comunaDTOZ.setNombreComuna("QUILLOTA");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(6); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("V-27");
		comunaDTOAA.setNombreComuna("QUILPUE");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(6);

		comunaDTOBB.setCodigoComuna("V-28");
		comunaDTOBB.setNombreComuna("QUINTERO");
		comunaDTOBB.setNombreComunaLower(comunaDTOBB.getNombreComuna().toLowerCase());
		comunaDTOBB.setIdRegion(6);

		comunaDTOCC.setCodigoComuna("V-29");
		comunaDTOCC.setNombreComuna("RINCONADA");
		comunaDTOCC.setNombreComunaLower(comunaDTOCC.getNombreComuna().toLowerCase());
		comunaDTOCC.setIdRegion(6);

		comunaDTODD.setCodigoComuna("V-30");
		comunaDTODD.setNombreComuna("SAN ANTONIO");
		comunaDTODD.setNombreComunaLower(comunaDTODD.getNombreComuna().toLowerCase());
		comunaDTODD.setIdRegion(6);
		/*********OK OK***************************/
		comunaDTOEE.setCodigoComuna("V-31");
		comunaDTOEE.setNombreComuna("SAN ESTEBAN");
		comunaDTOEE.setNombreComunaLower(comunaDTOEE.getNombreComuna().toLowerCase());
		comunaDTOEE.setIdRegion(6);

		comunaDTOFF.setCodigoComuna("V-32");
		comunaDTOFF.setNombreComuna("SAN FELIPE");
		comunaDTOFF.setNombreComunaLower(comunaDTOFF.getNombreComuna().toLowerCase());
		comunaDTOFF.setIdRegion(6);

		comunaDTOGG.setCodigoComuna("V-33");
		comunaDTOGG.setNombreComuna("SANTA MARIA");
		comunaDTOGG.setNombreComunaLower(comunaDTOGG.getNombreComuna().toLowerCase());
		comunaDTOGG.setIdRegion(6);

		comunaDTOHH.setCodigoComuna("V-34");
		comunaDTOHH.setNombreComuna("SANTO DOMINGO");
		comunaDTOHH.setNombreComunaLower(comunaDTOHH.getNombreComuna().toLowerCase());
		comunaDTOHH.setIdRegion(6);

		comunaDTOII.setCodigoComuna("V-35");
		comunaDTOII.setNombreComuna("VALPARAISO");
		comunaDTOII.setNombreComunaLower(comunaDTOII.getNombreComuna().toLowerCase());
		comunaDTOII.setIdRegion(6);

		comunaDTOJJ.setCodigoComuna("V-36");
		comunaDTOJJ.setNombreComuna("VILLA ALEMANA");
		comunaDTOJJ.setNombreComunaLower(comunaDTOJJ.getNombreComuna().toLowerCase());
		comunaDTOJJ.setIdRegion(6);

		comunaDTOKK.setCodigoComuna("V-37");
		comunaDTOKK.setNombreComuna("VIÑA DEL MAR");
		comunaDTOKK.setNombreComunaLower(comunaDTOKK.getNombreComuna().toLowerCase());
		comunaDTOKK.setIdRegion(6);

		comunaDTOLL.setCodigoComuna("V-38");
		comunaDTOLL.setNombreComuna("ZAPALLAR");
		comunaDTOLL.setNombreComunaLower(comunaDTOLL.getNombreComuna().toLowerCase());
		comunaDTOLL.setIdRegion(6);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOBB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOCC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTODD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOEE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOFF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOGG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOHH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOII);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJJ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOKK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOLL); //38
	}
	public void crearComunaRegionOhigginsTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO();
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOBB=new ComunaDTO();
		ComunaDTO comunaDTOCC=new ComunaDTO();
		ComunaDTO comunaDTODD=new ComunaDTO(); //30
		ComunaDTO comunaDTOEE=new ComunaDTO();
		ComunaDTO comunaDTOFF=new ComunaDTO();
		ComunaDTO comunaDTOGG=new ComunaDTO(); //33

		comunaDTOA.setCodigoComuna("VI-1");
		comunaDTOA.setNombreComuna("CHEPICA");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(7);

		comunaDTOB.setCodigoComuna("VI-2");
		comunaDTOB.setNombreComuna("CHIMBARONGO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(7);

		comunaDTOC.setCodigoComuna("VI-3");
		comunaDTOC.setNombreComuna("CODEGUA");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(7);

		comunaDTOD.setCodigoComuna("VI-4");
		comunaDTOD.setNombreComuna("COINCO");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(7);

		comunaDTOE.setCodigoComuna("VI-5");
		comunaDTOE.setNombreComuna("COLTAUCO");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(7);

		comunaDTOF.setCodigoComuna("VI-6");
		comunaDTOF.setNombreComuna("DOÑIHUE");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(7);

		comunaDTOG.setCodigoComuna("VI-7");
		comunaDTOG.setNombreComuna("GRANEROS");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(7);

		comunaDTOH.setCodigoComuna("VI-8");
		comunaDTOH.setNombreComuna("LA ESTRELLA");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(7);

		comunaDTOI.setCodigoComuna("VI-9");
		comunaDTOI.setNombreComuna("LAS CABRAS");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(7);

		comunaDTOJ.setCodigoComuna("VI-10");
		comunaDTOJ.setNombreComuna("LITUECHE");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(7);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("VI-11");
		comunaDTOK.setNombreComuna("LOLOL");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(7);

		comunaDTOL.setCodigoComuna("VI-12");
		comunaDTOL.setNombreComuna("MACHALI");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(7);

		comunaDTOM.setCodigoComuna("VI-13");
		comunaDTOM.setNombreComuna("MALLOA");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(7);

		comunaDTON.setCodigoComuna("VI-14");
		comunaDTON.setNombreComuna("MARCHIGUE");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(7);

		comunaDTOO.setCodigoComuna("VI-15");
		comunaDTOO.setNombreComuna("NANCAGUA");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(7);

		comunaDTOP.setCodigoComuna("VI-16");
		comunaDTOP.setNombreComuna("NAVIDAD");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(7);

		comunaDTOQ.setCodigoComuna("VI-17");
		comunaDTOQ.setNombreComuna("OLIVAR");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(7);

		comunaDTOR.setCodigoComuna("VI-18");
		comunaDTOR.setNombreComuna("PALMILLA");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(7);

		comunaDTOS.setCodigoComuna("VI-19");
		comunaDTOS.setNombreComuna("PAREDONES");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(7);

		comunaDTOT.setCodigoComuna("VI-20");
		comunaDTOT.setNombreComuna("PERALILLO");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(7);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("VI-21");
		comunaDTOU.setNombreComuna("PEUMO");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(7);

		comunaDTOV.setCodigoComuna("VI-22");
		comunaDTOV.setNombreComuna("PICHIDEGUA");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(7);

		comunaDTOW.setCodigoComuna("VI-23");
		comunaDTOW.setNombreComuna("PICHILEMU");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(7);

		comunaDTOX.setCodigoComuna("VI-24");
		comunaDTOX.setNombreComuna("PLACILLA");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(7);

		comunaDTOY.setCodigoComuna("VI-25");
		comunaDTOY.setNombreComuna("PUMANQUE");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(7); //25

		comunaDTOZ.setCodigoComuna("VI-26");
		comunaDTOZ.setNombreComuna("QUINTA DE TILCOCO");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(7); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("VI-27");
		comunaDTOAA.setNombreComuna("RANCAGUA");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(7);

		comunaDTOBB.setCodigoComuna("VI-28");
		comunaDTOBB.setNombreComuna("RENGO");
		comunaDTOBB.setNombreComunaLower(comunaDTOBB.getNombreComuna().toLowerCase());
		comunaDTOBB.setIdRegion(7);

		comunaDTOCC.setCodigoComuna("VI-29");
		comunaDTOCC.setNombreComuna("REQUINOA");
		comunaDTOCC.setNombreComunaLower(comunaDTOCC.getNombreComuna().toLowerCase());
		comunaDTOCC.setIdRegion(7);

		comunaDTODD.setCodigoComuna("VI-30");
		comunaDTODD.setNombreComuna("SAN FERNANDO");
		comunaDTODD.setNombreComunaLower(comunaDTODD.getNombreComuna().toLowerCase());
		comunaDTODD.setIdRegion(7);
		/*********OK OK***************************/
		comunaDTOEE.setCodigoComuna("VI-31");
		comunaDTOEE.setNombreComuna("SAN FRANCISCO DE MOSTAZAL");
		comunaDTOEE.setNombreComunaLower(comunaDTOEE.getNombreComuna().toLowerCase());
		comunaDTOEE.setIdRegion(7);

		comunaDTOFF.setCodigoComuna("VI-32");
		comunaDTOFF.setNombreComuna("SAN VICENTE");
		comunaDTOFF.setNombreComunaLower(comunaDTOFF.getNombreComuna().toLowerCase());
		comunaDTOFF.setIdRegion(7);

		comunaDTOGG.setCodigoComuna("VI-33");
		comunaDTOGG.setNombreComuna("SANTA CRUZ");
		comunaDTOGG.setNombreComunaLower(comunaDTOGG.getNombreComuna().toLowerCase());
		comunaDTOGG.setIdRegion(7);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOBB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOCC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTODD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOEE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOFF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOGG); //33

	}
	public void crearComunaRegionMauleTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO();
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOBB=new ComunaDTO();
		ComunaDTO comunaDTOCC=new ComunaDTO();
		ComunaDTO comunaDTODD=new ComunaDTO(); //30

		comunaDTOA.setCodigoComuna("VII-1");
		comunaDTOA.setNombreComuna("CAUQUENES");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(8);

		comunaDTOB.setCodigoComuna("VII-2");
		comunaDTOB.setNombreComuna("CHANCO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(8);

		comunaDTOC.setCodigoComuna("VII-3");
		comunaDTOC.setNombreComuna("COLBUN");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(8);

		comunaDTOD.setCodigoComuna("VII-4");
		comunaDTOD.setNombreComuna("CONSTITUCION");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(8);

		comunaDTOE.setCodigoComuna("VII-5");
		comunaDTOE.setNombreComuna("CUREPTO");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(8);

		comunaDTOF.setCodigoComuna("VII-6");
		comunaDTOF.setNombreComuna("CURICO");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(8);

		comunaDTOG.setCodigoComuna("VII-7");
		comunaDTOG.setNombreComuna("EMPEDRADO");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(8);

		comunaDTOH.setCodigoComuna("VII-8");
		comunaDTOH.setNombreComuna("HUALAÑE");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(8);

		comunaDTOI.setCodigoComuna("VII-9");
		comunaDTOI.setNombreComuna("LICANTEN");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(8);

		comunaDTOJ.setCodigoComuna("VII-10");
		comunaDTOJ.setNombreComuna("LINARES");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(8);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("VII-11");
		comunaDTOK.setNombreComuna("LONGAVI");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(8);

		comunaDTOL.setCodigoComuna("VII-12");
		comunaDTOL.setNombreComuna("MAULE");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(8);

		comunaDTOM.setCodigoComuna("VII-13");
		comunaDTOM.setNombreComuna("MOLINA");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(8);

		comunaDTON.setCodigoComuna("VII-14");
		comunaDTON.setNombreComuna("PARRAL");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(8);

		comunaDTOO.setCodigoComuna("VII-15");
		comunaDTOO.setNombreComuna("PELARCO");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(8);

		comunaDTOP.setCodigoComuna("VII-16");
		comunaDTOP.setNombreComuna("PELLUHUE");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(8);

		comunaDTOQ.setCodigoComuna("VII-17");
		comunaDTOQ.setNombreComuna("PENCAHUE");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(8);

		comunaDTOR.setCodigoComuna("VII-18");
		comunaDTOR.setNombreComuna("RAUCO");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(8);

		comunaDTOS.setCodigoComuna("VII-19");
		comunaDTOS.setNombreComuna("RETIRO");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(8);

		comunaDTOT.setCodigoComuna("VII-20");
		comunaDTOT.setNombreComuna("RIO CLARO");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(8);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("VII-21");
		comunaDTOU.setNombreComuna("ROMERAL");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(8);

		comunaDTOV.setCodigoComuna("VII-22");
		comunaDTOV.setNombreComuna("SAGRADA FAMILIA");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(8);

		comunaDTOW.setCodigoComuna("VII-23");
		comunaDTOW.setNombreComuna("SAN CLEMENTE");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(8);

		comunaDTOX.setCodigoComuna("VII-24");
		comunaDTOX.setNombreComuna("SAN JAVIER");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(8);

		comunaDTOY.setCodigoComuna("VII-25");
		comunaDTOY.setNombreComuna("SAN RAFAEL");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(8); //25

		comunaDTOZ.setCodigoComuna("VII-26");
		comunaDTOZ.setNombreComuna("TALCA");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(8); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("VII-27");
		comunaDTOAA.setNombreComuna("TENO");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(8);

		comunaDTOBB.setCodigoComuna("VII-28");
		comunaDTOBB.setNombreComuna("VICHUQUEN");
		comunaDTOBB.setNombreComunaLower(comunaDTOBB.getNombreComuna().toLowerCase());
		comunaDTOBB.setIdRegion(8);

		comunaDTOCC.setCodigoComuna("VII-29");
		comunaDTOCC.setNombreComuna("VILLA ALEGRE");
		comunaDTOCC.setNombreComunaLower(comunaDTOCC.getNombreComuna().toLowerCase());
		comunaDTOCC.setIdRegion(8);

		comunaDTODD.setCodigoComuna("VII-30");
		comunaDTODD.setNombreComuna("YERBAS BUENAS");
		comunaDTODD.setNombreComunaLower(comunaDTODD.getNombreComuna().toLowerCase());
		comunaDTODD.setIdRegion(8);
		/*********OK OK***************************/

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOBB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOCC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTODD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 

	}
	
	
	public void crearComunaRegionNubleTest(){
		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO(); 
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO(); 
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO(); 
		ComunaDTO comunaDTOS=new ComunaDTO(); 
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO(); 
		
		
		comunaDTOA.setCodigoComuna("VIII-9");
		comunaDTOA.setNombreComuna("COBQUECURA");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(9);
		
		comunaDTOB.setCodigoComuna("VIII-10");
		comunaDTOB.setNombreComuna("COELEMU");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(9);
		
		comunaDTOC.setCodigoComuna("VIII-27");
		comunaDTOC.setNombreComuna("NINHUE");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(9);
		
		comunaDTOD.setCodigoComuna("VIII-31");
		comunaDTOD.setNombreComuna("PORTEZUELO");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(9);
		
		comunaDTOE.setCodigoComuna("VIII-35");
		comunaDTOE.setNombreComuna("QUIRIHUE");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(9);
		
		comunaDTOF.setCodigoComuna("VIII-36");
		comunaDTOF.setNombreComuna("RANQUIL");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(9);
		
		comunaDTOG.setCodigoComuna("VIII-49");
		comunaDTOG.setNombreComuna("TREHUACO");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(9);
		
		comunaDTOH.setCodigoComuna("VIII-3");
		comunaDTOH.setNombreComuna("BULNES");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(9);
		
		comunaDTOI.setCodigoComuna("VIII-7");
		comunaDTOI.setNombreComuna("CHILLAN");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(9);

		comunaDTOJ.setCodigoComuna("VIII-8");
		comunaDTOJ.setNombreComuna("CHILLAN VIEJO");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(9);
		
		comunaDTOK.setCodigoComuna("VIII-16");
		comunaDTOK.setNombreComuna("EL CARMEN");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(9);
		
		comunaDTOL.setCodigoComuna("VIII-28");
		comunaDTOL.setNombreComuna("PEMUCO");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(9);
		
		comunaDTOM.setCodigoComuna("VIII-30");
		comunaDTOM.setNombreComuna("PINTO");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(9);
		
		comunaDTON.setCodigoComuna("VIII-34");
		comunaDTON.setNombreComuna("QUILLON");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(9);
		
		comunaDTOO.setCodigoComuna("VIII-40");
		comunaDTOO.setNombreComuna("SAN IGNACIO");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(9);
		
		comunaDTOP.setCodigoComuna("VIII-52");
		comunaDTOP.setNombreComuna("YUNGAY");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(9); //26 no hay ñ
		
		comunaDTOQ.setCodigoComuna("VIII-11");
		comunaDTOQ.setNombreComuna("COIHUECO");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(9);

		comunaDTOR.setCodigoComuna("VIII-39");
		comunaDTOR.setNombreComuna("SAN GREGORIO DE ÑIQUEN");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(9);

		comunaDTOS.setCodigoComuna("VIII-37");
		comunaDTOS.setNombreComuna("SAN CARLOS");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(9);

		comunaDTOT.setCodigoComuna("VIII-38");
		comunaDTOT.setNombreComuna("SAN FABIAN");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(9);

		comunaDTOU.setCodigoComuna("VIII-41");
		comunaDTOU.setNombreComuna("SAN NICOLAS");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(9);
		
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
	}
	
	public void crearComunaRegionBioBioTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO(); //26
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOAB=new ComunaDTO();
		ComunaDTO comunaDTOAC=new ComunaDTO();
		ComunaDTO comunaDTOAD=new ComunaDTO(); //30
		ComunaDTO comunaDTOAE=new ComunaDTO();
		ComunaDTO comunaDTOAF=new ComunaDTO();
		ComunaDTO comunaDTOAG=new ComunaDTO();

		comunaDTOA.setCodigoComuna("VIII-2");
		comunaDTOA.setNombreComuna("ARAUCO");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(10);
		
		comunaDTOB.setCodigoComuna("VIII-5");
		comunaDTOB.setNombreComuna("CAÑETE");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(10);
		
		comunaDTOC.setCodigoComuna("VIII-13");
		comunaDTOC.setNombreComuna("CONTULMO");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(10);
		
		comunaDTOD.setCodigoComuna("VIII-15");
		comunaDTOD.setNombreComuna("CURANILAHUE");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(10);
			
		comunaDTOE.setCodigoComuna("VIII-20");
		comunaDTOE.setNombreComuna("LEBU");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(10);
		
		comunaDTOF.setCodigoComuna("VIII-21");
		comunaDTOF.setNombreComuna("LOS ALAMOS");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(10);
		
		comunaDTOG.setCodigoComuna("VIII-47");
		comunaDTOG.setNombreComuna("TIRUA");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(10);
		
		
		comunaDTOH.setCodigoComuna("VIII-1");
		comunaDTOH.setNombreComuna("ALTO BIOBIO");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(10);
		
		comunaDTOI.setCodigoComuna("VIII-1");
		comunaDTOI.setNombreComuna("ANTUCO");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(10);
		
		comunaDTOJ.setCodigoComuna("VIII-4");
		comunaDTOJ.setNombreComuna("CABRERO");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(10);
		
		comunaDTOK.setCodigoComuna("VIII-19");
		comunaDTOK.setNombreComuna("LAJA");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(10);

		comunaDTOL.setCodigoComuna("VIII-22");
		comunaDTOL.setNombreComuna("LOS ANGELES");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(10);
		
		comunaDTOM.setCodigoComuna("VIII-24");
		comunaDTOM.setNombreComuna("MULCHEN");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(10);

		comunaDTON.setCodigoComuna("VIII-25");
		comunaDTON.setNombreComuna("NACIMIENTO");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(10); //25

		comunaDTOO.setCodigoComuna("VIII-26");
		comunaDTOO.setNombreComuna("NEGRETE");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(10); //26 no hay ñ
		
		comunaDTOP.setCodigoComuna("VIII-32");
		comunaDTOP.setNombreComuna("QUILACO");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(10);

		comunaDTOQ.setCodigoComuna("VIII-33");
		comunaDTOQ.setNombreComuna("QUILLECO");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(10);
	
		comunaDTOR.setCodigoComuna("VIII-43");
		comunaDTOR.setNombreComuna("SAN ROSENDO");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(10);

		comunaDTOS.setCodigoComuna("VIII-44");
		comunaDTOS.setNombreComuna("SANTA BARBARA");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(10);
		
		comunaDTOT.setCodigoComuna("VIII-50");
		comunaDTOT.setNombreComuna("TUCAPEL");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(10);

		comunaDTOU.setCodigoComuna("VIII-51");
		comunaDTOU.setNombreComuna("YUMBEL");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(10); //25
		
		comunaDTOV.setCodigoComuna("VIII-6");
		comunaDTOV.setNombreComuna("CHIGUAYANTE");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(10);

		comunaDTOW.setCodigoComuna("VIII-12");
		comunaDTOW.setNombreComuna("CONCEPCION");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(10);
		
		comunaDTOX.setCodigoComuna("VIII-14");
		comunaDTOX.setNombreComuna("CORONEL");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(10);
		
		comunaDTOY.setCodigoComuna("VIII-17");
		comunaDTOY.setNombreComuna("FLORIDA");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(10);

		comunaDTOZ.setCodigoComuna("VIII-18");
		comunaDTOZ.setNombreComuna("HUALPEN");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(10);
		
		comunaDTOAA.setCodigoComuna("VIII-19");
		comunaDTOAA.setNombreComuna("HUALQUI");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(10);
		
		comunaDTOAB.setCodigoComuna("VIII-23");
		comunaDTOAB.setNombreComuna("LOTA");
		comunaDTOAB.setNombreComunaLower(comunaDTOAB.getNombreComuna().toLowerCase());
		comunaDTOAB.setIdRegion(10);

		comunaDTOAC.setCodigoComuna("VIII-29");
		comunaDTOAC.setNombreComuna("PENCO");
		comunaDTOAC.setNombreComunaLower(comunaDTOAC.getNombreComuna().toLowerCase());
		comunaDTOAC.setIdRegion(10);
		
		comunaDTOAD.setCodigoComuna("VIII-42");
		comunaDTOAD.setNombreComuna("SAN PEDRO DE LA PAZ");
		comunaDTOAD.setNombreComunaLower(comunaDTOAD.getNombreComuna().toLowerCase());
		comunaDTOAD.setIdRegion(10);

		comunaDTOAE.setCodigoComuna("VIII-45");
		comunaDTOAE.setNombreComuna("SANTA JUANA");
		comunaDTOAE.setNombreComunaLower(comunaDTOAE.getNombreComuna().toLowerCase());
		comunaDTOAE.setIdRegion(10);

		comunaDTOAF.setCodigoComuna("VIII-46");
		comunaDTOAF.setNombreComuna("TALCAHUANO");
		comunaDTOAF.setNombreComunaLower(comunaDTOAF.getNombreComuna().toLowerCase());
		comunaDTOAF.setIdRegion(10);

		comunaDTOAG.setCodigoComuna("VIII-48");
		comunaDTOAG.setNombreComuna("TOME");
		comunaDTOAG.setNombreComunaLower(comunaDTOAG.getNombreComuna().toLowerCase());
		comunaDTOAG.setIdRegion(10);


		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAG);

	}
	public void crearComunaRegionAraucaniaTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO();
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOAB=new ComunaDTO();
		ComunaDTO comunaDTOAC=new ComunaDTO();
		ComunaDTO comunaDTOAD=new ComunaDTO(); //30
		ComunaDTO comunaDTOAE=new ComunaDTO();
		ComunaDTO comunaDTOAF=new ComunaDTO();
		
		comunaDTOA.setCodigoComuna("IX-2");
		comunaDTOA.setNombreComuna("CARAHUE");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(11);
		
		comunaDTOB.setCodigoComuna("IX-2");
		comunaDTOB.setNombreComuna("CHOLCHOL");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(11);
		
		comunaDTOC.setCodigoComuna("IX-4");
		comunaDTOC.setNombreComuna("CUNCO");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(11);
		
		comunaDTOD.setCodigoComuna("IX-6");
		comunaDTOD.setNombreComuna("CURARREHUE");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(11);
		
		comunaDTOE.setCodigoComuna("IX-8");
		comunaDTOE.setNombreComuna("FREIRE");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(11);
		
		comunaDTOF.setCodigoComuna("IX-8");
		comunaDTOF.setNombreComuna("GALVARINO");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(11);

		comunaDTOG.setCodigoComuna("IX-9");
		comunaDTOG.setNombreComuna("GORBEA");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(11);

		comunaDTOH.setCodigoComuna("IX-10");
		comunaDTOH.setNombreComuna("LAUTARO");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(11);
		
		comunaDTOI.setCodigoComuna("IX-11");
		comunaDTOI.setNombreComuna("LONCOCHE");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(11);
		
		comunaDTOJ.setCodigoComuna("IX-11");
		comunaDTOJ.setNombreComuna("MELIPEUCO");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(11);
		
		comunaDTOK.setCodigoComuna("IX-16");
		comunaDTOK.setNombreComuna("NUEVA IMPERIAL");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(11);

		comunaDTOL.setCodigoComuna("IX-17");
		comunaDTOL.setNombreComuna("PADRE LAS CASAS");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(11);
		
		comunaDTOM.setCodigoComuna("IX-18");
		comunaDTOM.setNombreComuna("PERQUENCO");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(11);

		comunaDTON.setCodigoComuna("IX-19");
		comunaDTON.setNombreComuna("PITRUFQUEN");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(11);
		
		comunaDTOO.setCodigoComuna("IX-20");
		comunaDTOO.setNombreComuna("PUCON");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(11);
		
		comunaDTOP.setCodigoComuna("IX-21");
		comunaDTOP.setNombreComuna("PUERTO SAAVEDRA");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(11);
		
		comunaDTOQ.setCodigoComuna("IX-25");
		comunaDTOQ.setNombreComuna("TEMUCO");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(11); //25

		comunaDTOR.setCodigoComuna("IX-26");
		comunaDTOR.setNombreComuna("TEODORO SCHMIDT");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(11); //26 no hay ñ

		comunaDTOS.setCodigoComuna("IX-27");
		comunaDTOS.setNombreComuna("TOLTEN");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(11);

		comunaDTOT.setCodigoComuna("IX-30");
		comunaDTOT.setNombreComuna("VILCUN");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(11);
		/*********OK OK***************************/
		comunaDTOU.setCodigoComuna("IX-31");
		comunaDTOU.setNombreComuna("VILLARICA");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(11);
		
		comunaDTOV.setCodigoComuna("IX-1");
		comunaDTOV.setNombreComuna("ANGOL");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(11);

		comunaDTOW.setCodigoComuna("IX-3");
		comunaDTOW.setNombreComuna("COLLIPULLI");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(11);
		
		comunaDTOX.setCodigoComuna("IX-5");
		comunaDTOX.setNombreComuna("CURACAUTIN");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(11);

		comunaDTOY.setCodigoComuna("IX-7");
		comunaDTOY.setNombreComuna("ERCILLA");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(11);

		comunaDTOZ.setCodigoComuna("IX-12");
		comunaDTOZ.setNombreComuna("LONQUIMAY");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(11);

		comunaDTOAA.setCodigoComuna("IX-13");
		comunaDTOAA.setNombreComuna("LOS SAUCES");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(11);

		comunaDTOAB.setCodigoComuna("IX-14");
		comunaDTOAB.setNombreComuna("LUMACO");
		comunaDTOAB.setNombreComunaLower(comunaDTOAB.getNombreComuna().toLowerCase());
		comunaDTOAB.setIdRegion(11);

		comunaDTOAC.setCodigoComuna("IX-22");
		comunaDTOAC.setNombreComuna("PUREN");
		comunaDTOAC.setNombreComunaLower(comunaDTOAC.getNombreComuna().toLowerCase());
		comunaDTOAC.setIdRegion(11);

		comunaDTOAD.setCodigoComuna("IX-23");
		comunaDTOAD.setNombreComuna("RENAICO");
		comunaDTOAD.setNombreComunaLower(comunaDTOAD.getNombreComuna().toLowerCase());
		comunaDTOAD.setIdRegion(11);

		comunaDTOAE.setCodigoComuna("IX-28");
		comunaDTOAE.setNombreComuna("TRAIGUEN");
		comunaDTOAE.setNombreComunaLower(comunaDTOAE.getNombreComuna().toLowerCase());
		comunaDTOAE.setIdRegion(11);

		comunaDTOAF.setCodigoComuna("IX-29");
		comunaDTOAF.setNombreComuna("VICTORIA");
		comunaDTOAF.setNombreComunaLower(comunaDTOAF.getNombreComuna().toLowerCase());
		comunaDTOAF.setIdRegion(11);


		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAF);
	}
	
	public void crearComunaRegionRiosTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO();
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();

		comunaDTOA.setCodigoComuna("XIV-1");
		comunaDTOA.setNombreComuna("CORRAL");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(12);

		comunaDTOB.setCodigoComuna("XIV-2");
		comunaDTOB.setNombreComuna("FUTRONO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(12);

		comunaDTOC.setCodigoComuna("XIV-3");
		comunaDTOC.setNombreComuna("LA UNION");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(12);

		comunaDTOD.setCodigoComuna("XIV-4");
		comunaDTOD.setNombreComuna("LAGO RANCO");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(12);

		comunaDTOE.setCodigoComuna("XIV-5");
		comunaDTOE.setNombreComuna("LANCO");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(12);

		comunaDTOF.setCodigoComuna("XIV-6");
		comunaDTOF.setNombreComuna("LOS LAGOS");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(12);

		comunaDTOG.setCodigoComuna("XIV-7");
		comunaDTOG.setNombreComuna("MAFIL");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(12);

		comunaDTOH.setCodigoComuna("XIV-8");
		comunaDTOH.setNombreComuna("MARIQUINA");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(12);

		comunaDTOI.setCodigoComuna("XIV-9");
		comunaDTOI.setNombreComuna("VALDIVIA");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(12);

		comunaDTOJ.setCodigoComuna("XIV-10");
		comunaDTOJ.setNombreComuna("PANGUIPULLI");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(12);

		comunaDTOK.setCodigoComuna("XIV-11");
		comunaDTOK.setNombreComuna("PAILLACO");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(12);

		comunaDTOL.setCodigoComuna("XIV-12");
		comunaDTOL.setNombreComuna("RIO BUENO");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(12);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
	}
	
	public void crearComunaRegionLosLagosTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO();
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOAB=new ComunaDTO();
		ComunaDTO comunaDTOAC=new ComunaDTO();
		ComunaDTO comunaDTOAD=new ComunaDTO(); //30

		comunaDTOA.setCodigoComuna("X-1");
		comunaDTOA.setNombreComuna("ANCUD");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(13);

		comunaDTOB.setCodigoComuna("X-2");
		comunaDTOB.setNombreComuna("CALBUCO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(13);

		comunaDTOC.setCodigoComuna("X-3");
		comunaDTOC.setNombreComuna("CASTRO");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(13);

		comunaDTOD.setCodigoComuna("X-4");
		comunaDTOD.setNombreComuna("CHAITEN");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(13);

		comunaDTOE.setCodigoComuna("X-5");
		comunaDTOE.setNombreComuna("CHONCHI");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(13);

		comunaDTOF.setCodigoComuna("X-6");
		comunaDTOF.setNombreComuna("COCHAMO");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(13);

		comunaDTOG.setCodigoComuna("X-7");
		comunaDTOG.setNombreComuna("CURACO DE VELEZ");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(13);

		comunaDTOH.setCodigoComuna("X-8");
		comunaDTOH.setNombreComuna("DALCAHUE");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(13);

		comunaDTOI.setCodigoComuna("X-9");
		comunaDTOI.setNombreComuna("FRESIA");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(13);

		comunaDTOJ.setCodigoComuna("X-10");
		comunaDTOJ.setNombreComuna("FRUTILLAR");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(13);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("X-11");
		comunaDTOK.setNombreComuna("FUTALEUFU");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(13);

		comunaDTOL.setCodigoComuna("X-12");
		comunaDTOL.setNombreComuna("HUALAIHUE");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(13);

		comunaDTOM.setCodigoComuna("X-13");
		comunaDTOM.setNombreComuna("LLANQUIHUE");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(13);

		comunaDTON.setCodigoComuna("X-14");
		comunaDTON.setNombreComuna("LOS MUERMOS");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(13);

		comunaDTOO.setCodigoComuna("X-15");
		comunaDTOO.setNombreComuna("MAULLIN");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(13);

		comunaDTOP.setCodigoComuna("X-16");
		comunaDTOP.setNombreComuna("OSORNO");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(13);

		comunaDTOQ.setCodigoComuna("X-17");
		comunaDTOQ.setNombreComuna("PALENA");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(13);

		comunaDTOR.setCodigoComuna("X-18");
		comunaDTOR.setNombreComuna("PUERTO MONTT");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(13);

		comunaDTOS.setCodigoComuna("X-19");
		comunaDTOS.setNombreComuna("PUERTO OCTAY");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(13);

		comunaDTOT.setCodigoComuna("X-20");
		comunaDTOT.setNombreComuna("PUERTO VARAS");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(13);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("X-21");
		comunaDTOU.setNombreComuna("PUQUELDON");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(13);

		comunaDTOV.setCodigoComuna("X-22");
		comunaDTOV.setNombreComuna("PURRANQUE");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(13);

		comunaDTOW.setCodigoComuna("X-23");
		comunaDTOW.setNombreComuna("PUYEHUE");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(13);

		comunaDTOX.setCodigoComuna("X-24");
		comunaDTOX.setNombreComuna("QUEILEN");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(13);

		comunaDTOY.setCodigoComuna("X-25");
		comunaDTOY.setNombreComuna("QUELLON");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(13); //25

		comunaDTOZ.setCodigoComuna("X-26");
		comunaDTOZ.setNombreComuna("QUEMCHI");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(13); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("X-27");
		comunaDTOAA.setNombreComuna("QUINCHAO");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(13);

		comunaDTOAB.setCodigoComuna("X-28");
		comunaDTOAB.setNombreComuna("RIO NEGRO");
		comunaDTOAB.setNombreComunaLower(comunaDTOAB.getNombreComuna().toLowerCase());
		comunaDTOAB.setIdRegion(13);

		comunaDTOAC.setCodigoComuna("X-29");
		comunaDTOAC.setNombreComuna("SAN JUAN DE LA COSTA");
		comunaDTOAC.setNombreComunaLower(comunaDTOAC.getNombreComuna().toLowerCase());
		comunaDTOAC.setIdRegion(13);

		comunaDTOAD.setCodigoComuna("X-30");
		comunaDTOAD.setNombreComuna("SAN PABLO");
		comunaDTOAD.setNombreComunaLower(comunaDTOAD.getNombreComuna().toLowerCase());
		comunaDTOAD.setIdRegion(13);
		/*********OK OK***************************/
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 
	}
	public void crearComunaRegionAysenTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO();

		comunaDTOA.setCodigoComuna("XI-1");
		comunaDTOA.setNombreComuna("AYSEN");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(14);

		comunaDTOB.setCodigoComuna("XI-2");
		comunaDTOB.setNombreComuna("CHILE CHICO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(14);

		comunaDTOC.setCodigoComuna("XI-3");
		comunaDTOC.setNombreComuna("CISNES");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(14);

		comunaDTOD.setCodigoComuna("XI-4");
		comunaDTOD.setNombreComuna("COCHRANE");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(14);

		comunaDTOE.setCodigoComuna("XI-5");
		comunaDTOE.setNombreComuna("COYHAIQUE");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(14);

		comunaDTOF.setCodigoComuna("XI-6");
		comunaDTOF.setNombreComuna("GUAITECAS");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(14);

		comunaDTOG.setCodigoComuna("XI-7");
		comunaDTOG.setNombreComuna("LAGO VERDE");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(14);

		comunaDTOH.setCodigoComuna("XI-8");
		comunaDTOH.setNombreComuna("OHIGGINS");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(14);

		comunaDTOI.setCodigoComuna("XI-9");
		comunaDTOI.setNombreComuna("RIO IBAÑEZ");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(14);

		comunaDTOJ.setCodigoComuna("XI-10");
		comunaDTOJ.setNombreComuna("TORTEL");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(14);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
	}
	public void crearComunaRegionMagallanesTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO();
		ComunaDTO comunaDTOK=new ComunaDTO();
		
		comunaDTOA.setCodigoComuna("MG-11");
		comunaDTOA.setNombreComuna("ANTARTICA");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(15);
		
		comunaDTOB.setCodigoComuna("MG-11");
		comunaDTOB.setNombreComuna("CABO DE HORNOS");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(15);
		
		comunaDTOC.setCodigoComuna("MG-1");
		comunaDTOC.setNombreComuna("LAGUNA BLANCA");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(15);
		
		comunaDTOD.setCodigoComuna("MG-6");
		comunaDTOD.setNombreComuna("PUNTA ARENAS");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(15);	
		
		comunaDTOE.setCodigoComuna("MG-7");
		comunaDTOE.setNombreComuna("RIO VERDE");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(15);
		
		comunaDTOF.setCodigoComuna("MG-8");
		comunaDTOF.setNombreComuna("SAN GREGORIO");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(15);
		
		comunaDTOG.setCodigoComuna("MG-3");
		comunaDTOG.setNombreComuna("PORVENIR");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(15);

		comunaDTOH.setCodigoComuna("MG-4");
		comunaDTOH.setNombreComuna("PRIMAVERA");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(15);
		
		comunaDTOI.setCodigoComuna("MG-9");
		comunaDTOI.setNombreComuna("TIMAUKEL");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(15);
		
		comunaDTOJ.setCodigoComuna("MG-5");
		comunaDTOJ.setNombreComuna("NATALES");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(15);

		comunaDTOK.setCodigoComuna("MG-10");
		comunaDTOK.setNombreComuna("TORRES DEL PAINE");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(15);
		
		

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
	}
	public void crearComunaRegionRMTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO(); //26
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOBB=new ComunaDTO();
		ComunaDTO comunaDTOCC=new ComunaDTO();
		ComunaDTO comunaDTODD=new ComunaDTO(); //30
		ComunaDTO comunaDTOEE=new ComunaDTO();
		ComunaDTO comunaDTOFF=new ComunaDTO();
		ComunaDTO comunaDTOGG=new ComunaDTO();
		ComunaDTO comunaDTOHH=new ComunaDTO();
		ComunaDTO comunaDTOII=new ComunaDTO();
		ComunaDTO comunaDTOJJ=new ComunaDTO();
		ComunaDTO comunaDTOKK=new ComunaDTO();
		ComunaDTO comunaDTOLL=new ComunaDTO();
		ComunaDTO comunaDTOMM=new ComunaDTO();
		ComunaDTO comunaDTONN=new ComunaDTO(); //40
		ComunaDTO comunaDTOOO=new ComunaDTO();
		ComunaDTO comunaDTOPP=new ComunaDTO();
		ComunaDTO comunaDTOQQ=new ComunaDTO();
		ComunaDTO comunaDTORR=new ComunaDTO();
		ComunaDTO comunaDTOSS=new ComunaDTO();
		ComunaDTO comunaDTOTT=new ComunaDTO();
		ComunaDTO comunaDTOUU=new ComunaDTO();
		ComunaDTO comunaDTOVV=new ComunaDTO();
		ComunaDTO comunaDTOWW=new ComunaDTO(); 
		ComunaDTO comunaDTOXX=new ComunaDTO();// 50
		ComunaDTO comunaDTOYY=new ComunaDTO();
		ComunaDTO comunaDTOZZ=new ComunaDTO(); 

		comunaDTOA.setCodigoComuna("RM-1");
		comunaDTOA.setNombreComuna("ALHUE");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(16);

		comunaDTOB.setCodigoComuna("RM-2");
		comunaDTOB.setNombreComuna("BUIN");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(16);

		comunaDTOC.setCodigoComuna("RM-3");
		comunaDTOC.setNombreComuna("CALERA DE TANGO");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(16);

		comunaDTOD.setCodigoComuna("RM-4");
		comunaDTOD.setNombreComuna("CERRILLOS");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(16);

		comunaDTOE.setCodigoComuna("RM-5");
		comunaDTOE.setNombreComuna("CERRO NAVIA");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(16);

		comunaDTOF.setCodigoComuna("RM-6");
		comunaDTOF.setNombreComuna("COLINA");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(16);

		comunaDTOG.setCodigoComuna("RM-7");
		comunaDTOG.setNombreComuna("CONCHALI");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(16);

		comunaDTOH.setCodigoComuna("RM-8");
		comunaDTOH.setNombreComuna("CURACAVI");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(16);

		comunaDTOI.setCodigoComuna("RM-9");
		comunaDTOI.setNombreComuna("EL BOSQUE");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(16);

		comunaDTOJ.setCodigoComuna("RM-10");
		comunaDTOJ.setNombreComuna("EL MONTE");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(16);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("RM-11");
		comunaDTOK.setNombreComuna("ESTACION CENTRAL");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(16);

		comunaDTOL.setCodigoComuna("RM-12");
		comunaDTOL.setNombreComuna("HUECHURABA");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(16);

		comunaDTOM.setCodigoComuna("RM-13");
		comunaDTOM.setNombreComuna("INDEPENDENCIA");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(16);

		comunaDTON.setCodigoComuna("RM-14");
		comunaDTON.setNombreComuna("ISLA DE MAIPO");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(16);

		comunaDTOO.setCodigoComuna("RM-15");
		comunaDTOO.setNombreComuna("LA CISTERNA");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(16);

		comunaDTOP.setCodigoComuna("RM-16");
		comunaDTOP.setNombreComuna("LA FLORIDA");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(16);

		comunaDTOQ.setCodigoComuna("RM-17");
		comunaDTOQ.setNombreComuna("LA GRANJA");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(16);

		comunaDTOR.setCodigoComuna("RM-18");
		comunaDTOR.setNombreComuna("LA PINTANA");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(16);

		comunaDTOS.setCodigoComuna("RM-19");
		comunaDTOS.setNombreComuna("LA REINA");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(16);

		comunaDTOT.setCodigoComuna("RM-20");
		comunaDTOT.setNombreComuna("LAMPA");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(16);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("RM-21");
		comunaDTOU.setNombreComuna("LAS CONDES");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(16);

		comunaDTOV.setCodigoComuna("RM-22");
		comunaDTOV.setNombreComuna("LO BARNECHEA");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(16);

		comunaDTOW.setCodigoComuna("RM-23");
		comunaDTOW.setNombreComuna("LO ESPEJO");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(16);

		comunaDTOX.setCodigoComuna("RM-24");
		comunaDTOX.setNombreComuna("LO PRADO");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(16);

		comunaDTOY.setCodigoComuna("RM-25");
		comunaDTOY.setNombreComuna("MACUL");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(16); //25

		comunaDTOZ.setCodigoComuna("RM-26");
		comunaDTOZ.setNombreComuna("MAIPU");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(16); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("RM-27");
		comunaDTOAA.setNombreComuna("MARIA PINTO");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(16);

		comunaDTOBB.setCodigoComuna("RM-28");
		comunaDTOBB.setNombreComuna("MELIPILLA");
		comunaDTOBB.setNombreComunaLower(comunaDTOBB.getNombreComuna().toLowerCase());
		comunaDTOBB.setIdRegion(16);

		comunaDTOCC.setCodigoComuna("RM-29");
		comunaDTOCC.setNombreComuna("ÑUÑOA");
		comunaDTOCC.setNombreComunaLower(comunaDTOCC.getNombreComuna().toLowerCase());
		comunaDTOCC.setIdRegion(16);

		comunaDTODD.setCodigoComuna("RM-30");
		comunaDTODD.setNombreComuna("PADRE HURTADO");
		comunaDTODD.setNombreComunaLower(comunaDTODD.getNombreComuna().toLowerCase());
		comunaDTODD.setIdRegion(16);
		/*********OK OK***************************/
		comunaDTOEE.setCodigoComuna("RM-31");
		comunaDTOEE.setNombreComuna("PAINE");
		comunaDTOEE.setNombreComunaLower(comunaDTOEE.getNombreComuna().toLowerCase());
		comunaDTOEE.setIdRegion(16);

		comunaDTOFF.setCodigoComuna("RM-32");
		comunaDTOFF.setNombreComuna("PEDRO AGUIRRE CERDA");
		comunaDTOFF.setNombreComunaLower(comunaDTOFF.getNombreComuna().toLowerCase());
		comunaDTOFF.setIdRegion(16);

		comunaDTOGG.setCodigoComuna("RM-33");
		comunaDTOGG.setNombreComuna("PEÑAFLOR");
		comunaDTOGG.setNombreComunaLower(comunaDTOGG.getNombreComuna().toLowerCase());
		comunaDTOGG.setIdRegion(16);

		comunaDTOHH.setCodigoComuna("RM-34");
		comunaDTOHH.setNombreComuna("PEÑALOLEN");
		comunaDTOHH.setNombreComunaLower(comunaDTOHH.getNombreComuna().toLowerCase());
		comunaDTOHH.setIdRegion(16);

		comunaDTOII.setCodigoComuna("RM-35");
		comunaDTOII.setNombreComuna("PIRQUE");
		comunaDTOII.setNombreComunaLower(comunaDTOII.getNombreComuna().toLowerCase());
		comunaDTOII.setIdRegion(16);

		comunaDTOJJ.setCodigoComuna("RM-36");
		comunaDTOJJ.setNombreComuna("PROVIDENCIA");
		comunaDTOJJ.setNombreComunaLower(comunaDTOJJ.getNombreComuna().toLowerCase());
		comunaDTOJJ.setIdRegion(16);

		comunaDTOKK.setCodigoComuna("RM-37");
		comunaDTOKK.setNombreComuna("PUDAHUEL");
		comunaDTOKK.setNombreComunaLower(comunaDTOKK.getNombreComuna().toLowerCase());
		comunaDTOKK.setIdRegion(16);

		comunaDTOLL.setCodigoComuna("RM-38");
		comunaDTOLL.setNombreComuna("PUENTE ALTO");
		comunaDTOLL.setNombreComunaLower(comunaDTOLL.getNombreComuna().toLowerCase());
		comunaDTOLL.setIdRegion(16);

		comunaDTOMM.setCodigoComuna("RM-39");
		comunaDTOMM.setNombreComuna("QUILICURA");
		comunaDTOMM.setNombreComunaLower(comunaDTOMM.getNombreComuna().toLowerCase());
		comunaDTOMM.setIdRegion(16);

		comunaDTONN.setCodigoComuna("RM-40");
		comunaDTONN.setNombreComuna("QUINTA NORMAL");
		comunaDTONN.setNombreComunaLower(comunaDTONN.getNombreComuna().toLowerCase());
		comunaDTONN.setIdRegion(16);
		/*********OK OK***************************/
		comunaDTOOO.setCodigoComuna("RM-41");
		comunaDTOOO.setNombreComuna("RECOLETA");
		comunaDTOOO.setNombreComunaLower(comunaDTOOO.getNombreComuna().toLowerCase());
		comunaDTOOO.setIdRegion(16);

		comunaDTOPP.setCodigoComuna("RM-42");
		comunaDTOPP.setNombreComuna("RENCA");
		comunaDTOPP.setNombreComunaLower(comunaDTOPP.getNombreComuna().toLowerCase());
		comunaDTOPP.setIdRegion(16);

		comunaDTOQQ.setCodigoComuna("RM-43");
		comunaDTOQQ.setNombreComuna("SAN BERNARDO");
		comunaDTOQQ.setNombreComunaLower(comunaDTOQQ.getNombreComuna().toLowerCase());
		comunaDTOQQ.setIdRegion(16);

		comunaDTORR.setCodigoComuna("RM-44");
		comunaDTORR.setNombreComuna("SAN JOAQUIN");
		comunaDTORR.setNombreComunaLower(comunaDTORR.getNombreComuna().toLowerCase());
		comunaDTORR.setIdRegion(16);

		comunaDTOSS.setCodigoComuna("RM-45");
		comunaDTOSS.setNombreComuna("SAN JOSE DE MAIPO");
		comunaDTOSS.setNombreComunaLower(comunaDTOSS.getNombreComuna().toLowerCase());
		comunaDTOSS.setIdRegion(16);

		comunaDTOTT.setCodigoComuna("RM-46");
		comunaDTOTT.setNombreComuna("SAN MIGUEL");
		comunaDTOTT.setNombreComunaLower(comunaDTOTT.getNombreComuna().toLowerCase());
		comunaDTOTT.setIdRegion(16);

		comunaDTOUU.setCodigoComuna("RM-47");
		comunaDTOUU.setNombreComuna("SAN PEDRO");
		comunaDTOUU.setNombreComunaLower(comunaDTOUU.getNombreComuna().toLowerCase());
		comunaDTOUU.setIdRegion(16);

		comunaDTOVV.setCodigoComuna("RM-48");
		comunaDTOVV.setNombreComuna("SAN RAMON");
		comunaDTOVV.setNombreComunaLower(comunaDTOVV.getNombreComuna().toLowerCase());
		comunaDTOVV.setIdRegion(16);

		comunaDTOWW.setCodigoComuna("RM-49");
		comunaDTOWW.setNombreComuna("SANTIAGO CENTRO");
		comunaDTOWW.setNombreComunaLower(comunaDTOWW.getNombreComuna().toLowerCase());
		comunaDTOWW.setIdRegion(16);

		comunaDTOXX.setCodigoComuna("RM-50");
		comunaDTOXX.setNombreComuna("TALAGANTE");
		comunaDTOXX.setNombreComunaLower(comunaDTOXX.getNombreComuna().toLowerCase());
		comunaDTOXX.setIdRegion(16);
		/***********OK OK**********************************/
		comunaDTOYY.setCodigoComuna("RM-51");
		comunaDTOYY.setNombreComuna("TIL-TIL");
		comunaDTOYY.setNombreComunaLower(comunaDTOYY.getNombreComuna().toLowerCase());
		comunaDTOYY.setIdRegion(16); //25

		comunaDTOZZ.setCodigoComuna("RM-52");
		comunaDTOZZ.setNombreComuna("VITACURA");
		comunaDTOZZ.setNombreComunaLower(comunaDTOZZ.getNombreComuna().toLowerCase());
		comunaDTOZZ.setIdRegion(16); //

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOBB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOCC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTODD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOEE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOFF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOGG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOHH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOII);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJJ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOKK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOLL); //38
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOMM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTONN);
		// 40 // 40 // 40 // 40 // 40 // 40 // 40 // 40 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOPP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTORR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOSS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOTT);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOUU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOVV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOWW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOXX);
		// 50 // 50 // 50 // 50 // 50 // 50 // 50 // 50  
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOYY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZZ); //52
	}
	
	



	//	public void crearAplicacionServicioTest(){
	//		objLog.info("crearAplicacionServicioTest");
	//		//Solo Una Aplicación
	//		AplicacionDTO aplicacionDTO=new AplicacionDTO();
	//		aplicacionDTO.setNombreAplicacion("Solicitudes Facultad de Artes Universidad de Chile"); //Nombre a Mostrar
	//		aplicacionDTO.setNombreAplicacionLower(aplicacionDTO.getNombreAplicacion().toLowerCase()); //Nombre a Mostrar en minuscula
	//		aplicacionDTO.setDescripcionAplicacion("");
	//		aplicacionDTO.setEstadoAplicacion(1);
	//
	//		factoryServicioDAO.getAplicacionServicio().crearAplicacionDTO(aplicacionDTO);
	//	}

	//	public void crearVersionSemestralTest(){
	//		objLog.info("crearAplicacionServicioTest");
	//		//Solo Una Aplicación
	//		VersionSemestralDTO versionSemestralDTOA=new VersionSemestralDTO();
	//		versionSemestralDTOA.setTituloVersionSemestral("Primer Semestre del 2017"); //Nombre a Mostrar
	//		VersionSemestralDTO versionSemestralDTOB=new VersionSemestralDTO();
	//		versionSemestralDTOB.setTituloVersionSemestral("Segundo Semestre del 2017"); //Nombre a Mostrar
	//		VersionSemestralDTO versionSemestralDTOC=new VersionSemestralDTO();
	//		versionSemestralDTOC.setTituloVersionSemestral("Primer Semestre del 2018"); //Nombre a Mostrar
	//		
	//		factoryServicioDAO.getVersionSemestralServicio().crearVersionSemestralDTO(versionSemestralDTOA);
	//		factoryServicioDAO.getVersionSemestralServicio().crearVersionSemestralDTO(versionSemestralDTOB);
	//		factoryServicioDAO.getVersionSemestralServicio().crearVersionSemestralDTO(versionSemestralDTOC);
	//	}



	public void crearProgramaUniversidadServicioTest(){
		objLog.info("crearProgramaUniversidadServicioTest");
		ProgramaUniversidadDTO programaUniversidadDTOA=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOB=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOC=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOD=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOE=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOF=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOG=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOH=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOI=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOJ=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOK=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOL=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOM=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTON=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOO=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOP=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOQ=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOR=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOS=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOT=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOU=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOV=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOW=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOX=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOY=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOZ=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOAA=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOAB=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOAC=new ProgramaUniversidadDTO();

		programaUniversidadDTOA.setCodigoProgramaUniversidad("DOC_FmETA"); programaUniversidadDTOA.setCostoProgramaUniversidad("$60.000"); programaUniversidadDTOA.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOA.setClasificacionPrograma(1); programaUniversidadDTOA.setEstadoProgramaUniversidad(true); programaUniversidadDTOA.setPrioridadProgramaUniversidad(1);
		programaUniversidadDTOB.setCodigoProgramaUniversidad("MAG_AAV"); programaUniversidadDTOB.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOB.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOB.setClasificacionPrograma(2); programaUniversidadDTOB.setEstadoProgramaUniversidad(true); programaUniversidadDTOB.setPrioridadProgramaUniversidad(1);
		programaUniversidadDTOC.setCodigoProgramaUniversidad("MAG_ADT"); programaUniversidadDTOC.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOC.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOC.setClasificacionPrograma(2); programaUniversidadDTOC.setEstadoProgramaUniversidad(true); programaUniversidadDTOC.setPrioridadProgramaUniversidad(2);
		programaUniversidadDTOD.setCodigoProgramaUniversidad("MAG_AmM"); programaUniversidadDTOD.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOD.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOD.setClasificacionPrograma(2); programaUniversidadDTOD.setEstadoProgramaUniversidad(true); programaUniversidadDTOD.setPrioridadProgramaUniversidad(3);
		programaUniversidadDTOE.setCodigoProgramaUniversidad("MAG_E"); 	programaUniversidadDTOE.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOE.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOE.setClasificacionPrograma(2); programaUniversidadDTOE.setEstadoProgramaUniversidad(true); programaUniversidadDTOE.setPrioridadProgramaUniversidad(4);
		programaUniversidadDTOF.setCodigoProgramaUniversidad("MAG_AmTHA"); programaUniversidadDTOF.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOF.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOF.setClasificacionPrograma(2); programaUniversidadDTOF.setEstadoProgramaUniversidad(true); programaUniversidadDTOF.setPrioridadProgramaUniversidad(5);
		programaUniversidadDTOG.setCodigoProgramaUniversidad("MAG_GC"); 	programaUniversidadDTOG.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOG.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOG.setClasificacionPrograma(2); programaUniversidadDTOG.setEstadoProgramaUniversidad(true); programaUniversidadDTOG.setPrioridadProgramaUniversidad(6);
		programaUniversidadDTOH.setCodigoProgramaUniversidad("MAG_AM"); 	programaUniversidadDTOH.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOH.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOH.setClasificacionPrograma(2); programaUniversidadDTOH.setEstadoProgramaUniversidad(true); programaUniversidadDTOH.setPrioridadProgramaUniversidad(7);
		programaUniversidadDTOI.setCodigoProgramaUniversidad("MAG_IM"); 	programaUniversidadDTOI.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOI.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOI.setClasificacionPrograma(2); programaUniversidadDTOI.setEstadoProgramaUniversidad(true); programaUniversidadDTOI.setPrioridadProgramaUniversidad(8);
		programaUniversidadDTOJ.setCodigoProgramaUniversidad("POS_CM"); 	programaUniversidadDTOJ.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOJ.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOJ.setClasificacionPrograma(3); programaUniversidadDTOJ.setEstadoProgramaUniversidad(true); programaUniversidadDTOJ.setPrioridadProgramaUniversidad(1);

		programaUniversidadDTOK.setCodigoProgramaUniversidad("POS_ME"); 	programaUniversidadDTOK.setCostoProgramaUniversidad("-"); 	programaUniversidadDTOK.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOK.setClasificacionPrograma(3); programaUniversidadDTOK.setEstadoProgramaUniversidad(false); programaUniversidadDTOK.setPrioridadProgramaUniversidad(3);
		programaUniversidadDTOL.setCodigoProgramaUniversidad("POS_RPCM"); programaUniversidadDTOL.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOL.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOL.setClasificacionPrograma(3); programaUniversidadDTOL.setEstadoProgramaUniversidad(true); programaUniversidadDTOL.setPrioridadProgramaUniversidad(4);
		programaUniversidadDTOM.setCodigoProgramaUniversidad("POS_TAmAT"); programaUniversidadDTOM.setCostoProgramaUniversidad("-"); 	programaUniversidadDTOM.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOM.setClasificacionPrograma(3); programaUniversidadDTOM.setEstadoProgramaUniversidad(false); programaUniversidadDTOM.setPrioridadProgramaUniversidad(5);
		programaUniversidadDTON.setCodigoProgramaUniversidad("POS_TAmM"); programaUniversidadDTON.setCostoProgramaUniversidad("-"); 	programaUniversidadDTON.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTON.setClasificacionPrograma(3); programaUniversidadDTON.setEstadoProgramaUniversidad(false); programaUniversidadDTON.setPrioridadProgramaUniversidad(6);
		programaUniversidadDTOO.setCodigoProgramaUniversidad("DIPP_AS"); programaUniversidadDTOO.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOO.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOO.setClasificacionPrograma(4); programaUniversidadDTOO.setEstadoProgramaUniversidad(true); programaUniversidadDTOO.setPrioridadProgramaUniversidad(1);
		programaUniversidadDTOP.setCodigoProgramaUniversidad("DIPP_D"); 	programaUniversidadDTOP.setCostoProgramaUniversidad("-"); 	programaUniversidadDTOP.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOP.setClasificacionPrograma(4); programaUniversidadDTOP.setEstadoProgramaUniversidad(false); programaUniversidadDTOP.setPrioridadProgramaUniversidad(2);
		programaUniversidadDTOQ.setCodigoProgramaUniversidad("DIPP_GC"); programaUniversidadDTOQ.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOQ.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOQ.setClasificacionPrograma(4); programaUniversidadDTOQ.setEstadoProgramaUniversidad(true); programaUniversidadDTOQ.setPrioridadProgramaUniversidad(3);
		programaUniversidadDTOR.setCodigoProgramaUniversidad("DIPP_Pgvf"); programaUniversidadDTOR.setCostoProgramaUniversidad("-"); 	programaUniversidadDTOR.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOR.setClasificacionPrograma(4); programaUniversidadDTOR.setEstadoProgramaUniversidad(false); programaUniversidadDTOR.setPrioridadProgramaUniversidad(4);
		programaUniversidadDTOS.setCodigoProgramaUniversidad("DIPE_C"); 	programaUniversidadDTOS.setCostoProgramaUniversidad("-"); 	programaUniversidadDTOS.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOS.setClasificacionPrograma(5);  programaUniversidadDTOS.setEstadoProgramaUniversidad(false); programaUniversidadDTOS.setPrioridadProgramaUniversidad(1); 
		programaUniversidadDTOT.setCodigoProgramaUniversidad("DIPE_EAari"); programaUniversidadDTOT.setCostoProgramaUniversidad("$35.000"); programaUniversidadDTOT.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOT.setClasificacionPrograma(5); programaUniversidadDTOT.setEstadoProgramaUniversidad(true); programaUniversidadDTOT.setPrioridadProgramaUniversidad(2);

		programaUniversidadDTOU.setCodigoProgramaUniversidad("DIPE_EApm"); programaUniversidadDTOU.setCostoProgramaUniversidad("$35.000"); programaUniversidadDTOU.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOU.setClasificacionPrograma(5); programaUniversidadDTOU.setEstadoProgramaUniversidad(true); programaUniversidadDTOU.setPrioridadProgramaUniversidad(3);
		programaUniversidadDTOV.setCodigoProgramaUniversidad("DIPE_VGC"); programaUniversidadDTOV.setCostoProgramaUniversidad("$35.000"); programaUniversidadDTOV.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOV.setClasificacionPrograma(5); programaUniversidadDTOV.setEstadoProgramaUniversidad(true); programaUniversidadDTOV.setPrioridadProgramaUniversidad(4);
		programaUniversidadDTOW.setCodigoProgramaUniversidad("DIPE_PA"); programaUniversidadDTOW.setCostoProgramaUniversidad("$35.000"); programaUniversidadDTOW.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOW.setClasificacionPrograma(5); programaUniversidadDTOW.setEstadoProgramaUniversidad(true); programaUniversidadDTOW.setPrioridadProgramaUniversidad(5);
		programaUniversidadDTOX.setCodigoProgramaUniversidad("DIPE_GI"); programaUniversidadDTOX.setCostoProgramaUniversidad("$35.000"); programaUniversidadDTOX.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOX.setClasificacionPrograma(5); programaUniversidadDTOX.setEstadoProgramaUniversidad(true); programaUniversidadDTOX.setPrioridadProgramaUniversidad(6);
		programaUniversidadDTOY.setCodigoProgramaUniversidad("DIPE_GP"); programaUniversidadDTOY.setCostoProgramaUniversidad("$33.000"); programaUniversidadDTOY.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOY.setClasificacionPrograma(5); programaUniversidadDTOY.setEstadoProgramaUniversidad(true); programaUniversidadDTOY.setPrioridadProgramaUniversidad(7);
		programaUniversidadDTOZ.setCodigoProgramaUniversidad("DIPE_EP"); programaUniversidadDTOZ.setCostoProgramaUniversidad("$33.000"); programaUniversidadDTOZ.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOZ.setClasificacionPrograma(5); programaUniversidadDTOZ.setEstadoProgramaUniversidad(true); programaUniversidadDTOZ.setPrioridadProgramaUniversidad(8);
		programaUniversidadDTOAA.setCodigoProgramaUniversidad("MAG_IM_2018_MALO"); programaUniversidadDTOAA.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOAA.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOAA.setClasificacionPrograma(2); programaUniversidadDTOAA.setEstadoProgramaUniversidad(false); programaUniversidadDTOAA.setPrioridadProgramaUniversidad(1);
		programaUniversidadDTOAB.setCodigoProgramaUniversidad("MAG_IM_2018"); programaUniversidadDTOAB.setCostoProgramaUniversidad("$50.000"); programaUniversidadDTOAB.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOAB.setClasificacionPrograma(2); programaUniversidadDTOAB.setEstadoProgramaUniversidad(true); programaUniversidadDTOAB.setPrioridadProgramaUniversidad(9);
		programaUniversidadDTOAC.setCodigoProgramaUniversidad("OTRO");  programaUniversidadDTOAC.setCostoProgramaUniversidad("$1"); programaUniversidadDTOAC.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOAC.setClasificacionPrograma(6);  programaUniversidadDTOAC.setEstadoProgramaUniversidad(true); programaUniversidadDTOAC.setPrioridadProgramaUniversidad(1);

		programaUniversidadDTOA.setNombreProgramaUniversidad("Doctorado en Filosofía, Mención en Estética y Teoría de Arte");
		programaUniversidadDTOB.setNombreProgramaUniversidad("Magíster en Artes, mención Artes Visuales");
		programaUniversidadDTOC.setNombreProgramaUniversidad("Magíster en Artes, mención Dirección Teatral");
		programaUniversidadDTOD.setNombreProgramaUniversidad("Magíster en Artes, mención Composición Musical");
		programaUniversidadDTOE.setNombreProgramaUniversidad("Magíster en Artes, mención Musicología");
		programaUniversidadDTOF.setNombreProgramaUniversidad("Magíster en Artes, mención Teoría e Historia de Arte");
		programaUniversidadDTOG.setNombreProgramaUniversidad("Magíster en Gestión Cultural");
		programaUniversidadDTOH.setNombreProgramaUniversidad("Magíster en Artes Mediales");
		programaUniversidadDTOI.setNombreProgramaUniversidad("Magíster en Interpretación Musical");
		programaUniversidadDTOJ.setNombreProgramaUniversidad("Curso de especialización de Postítulo en Composición Musical");
		programaUniversidadDTOK.setNombreProgramaUniversidad("Curso de especialización de Postítulo en Música Electrónica");
		programaUniversidadDTOL.setNombreProgramaUniversidad("Curso de especialización de Postítulo en Restauración del Patrimonio Cultural Mueble");
		programaUniversidadDTOM.setNombreProgramaUniversidad("Curso de especialización de Postítulo en Terapias de Arte, mención Arte Terapia");
		programaUniversidadDTON.setNombreProgramaUniversidad("Curso de especialización de Postítulo en Terapias de Arte, mención Musicoterapia");
		programaUniversidadDTOO.setNombreProgramaUniversidad("Diploma de Postitulo en Arte sonoro");
		programaUniversidadDTOP.setNombreProgramaUniversidad("Diploma de Postitulo en Dramaterapia");
		programaUniversidadDTOQ.setNombreProgramaUniversidad("Diploma de Postitulo en Gestión cultural (sede Puerto Montt)");
		programaUniversidadDTOR.setNombreProgramaUniversidad("Diploma de Postitulo en Producción gráfica, video y fotografía");
		programaUniversidadDTOS.setNombreProgramaUniversidad("Diploma de Extensión en Curaduría");
		programaUniversidadDTOT.setNombreProgramaUniversidad("Diploma de Extensión en Educación Artística - Arica y Parinacota");
		programaUniversidadDTOU.setNombreProgramaUniversidad("Diploma de Extensión en Educación Artística - Puerto Montt");
		programaUniversidadDTOV.setNombreProgramaUniversidad("Diploma de Extensión en Virtual en Gestión Cultural");
		programaUniversidadDTOW.setNombreProgramaUniversidad("Diploma de Extensión en Producción Artística");
		programaUniversidadDTOX.setNombreProgramaUniversidad("Diploma Virtual de Extensión en Gestión de Instituciones Culturales");
		programaUniversidadDTOY.setNombreProgramaUniversidad("Diploma Virtual de Postítulo en Gestión del Patrimonio");
		programaUniversidadDTOZ.setNombreProgramaUniversidad("Diploma Virtual de Postítulo en Educación del Patrimonio Artístico");
		programaUniversidadDTOAA.setNombreProgramaUniversidad("Crear pero no mostrat");
		programaUniversidadDTOAB.setNombreProgramaUniversidad("Magíster en Interpretación Musical, primer semestre 2018");
		programaUniversidadDTOAC.setNombreProgramaUniversidad("OTROS");

		programaUniversidadDTOA = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOA);
		programaUniversidadDTOB = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOB);
		programaUniversidadDTOC = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOC);
		programaUniversidadDTOD = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOD);
		programaUniversidadDTOE = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOE);
		programaUniversidadDTOF = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOF);
		programaUniversidadDTOG = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOG);
		programaUniversidadDTOH = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOH);
		programaUniversidadDTOI = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOI);
		programaUniversidadDTOJ = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOJ);
		programaUniversidadDTOK = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOK);
		programaUniversidadDTOL = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOL);
		programaUniversidadDTOM = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOM);
		programaUniversidadDTON = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTON);
		programaUniversidadDTOO = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOO);
		programaUniversidadDTOP = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOP);
		programaUniversidadDTOQ = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOQ);
		programaUniversidadDTOR = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOR);
		programaUniversidadDTOS = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOS);
		programaUniversidadDTOT = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOT);
		programaUniversidadDTOU = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOU);
		programaUniversidadDTOV = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOV);
		programaUniversidadDTOW = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOW);
		programaUniversidadDTOX = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOX);
		programaUniversidadDTOY = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOY);
		programaUniversidadDTOZ = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOZ);
		programaUniversidadDTOAA = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOAA);
		programaUniversidadDTOAB = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOAB);
		programaUniversidadDTOAC = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOAC);


	}


	public void crearProgramaUniversidadPostulacionServicioTest(){
		objLog.info("crearProgramaUniversidadPostulacionServicioTest");
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOA=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOB=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOC=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOD=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOE=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOF=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOG=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOH=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOI=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOJ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOK=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOL=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOM=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTON=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOO=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOP=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOQ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOR=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOS=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOT=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOU=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOV=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOW=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOX=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOY=new ProgramaUniversidadPostulacionDTO();
		/*26*/	ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOZ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAA=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAB=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAC=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAD=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAE=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAF=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAG=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAH=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAI=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAJ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAK=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAL=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAM=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAN=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAO=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAP=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAQ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAR=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAS=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAT=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAU=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAV=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAW=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAX=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAY=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAZ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBA=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBB=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBC=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBD=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBE=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBF=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBG=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBH=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBI=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBJ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBK=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBL=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBM=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBN=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBO=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBP=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBQ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBR=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOBS=new ProgramaUniversidadPostulacionDTO();

		programaUniversidadPostulacionDTOA.setCodigoProgramaUniversidadPostulacion("DOC_FmETA"); programaUniversidadPostulacionDTOA.setCostoProgramaUniversidadPostulacion("$60.000"); programaUniversidadPostulacionDTOA.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOA.setClasificacionProgramaPostulacion(1);  programaUniversidadPostulacionDTOA.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOB.setCodigoProgramaUniversidadPostulacion("MAG_AAV"); programaUniversidadPostulacionDTOB.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOB.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOB.setClasificacionProgramaPostulacion(2);   programaUniversidadPostulacionDTOB.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOC.setCodigoProgramaUniversidadPostulacion("MAG_ADT"); programaUniversidadPostulacionDTOC.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOC.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOC.setClasificacionProgramaPostulacion(2);   programaUniversidadPostulacionDTOC.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOD.setCodigoProgramaUniversidadPostulacion("MAG_AmM"); programaUniversidadPostulacionDTOD.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOD.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOD.setClasificacionProgramaPostulacion(2);   programaUniversidadPostulacionDTOD.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOE.setCodigoProgramaUniversidadPostulacion("MAG_E"); 	programaUniversidadPostulacionDTOE.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOE.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOE.setClasificacionProgramaPostulacion(2);  programaUniversidadPostulacionDTOE.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOF.setCodigoProgramaUniversidadPostulacion("MAG_AmTHA"); programaUniversidadPostulacionDTOF.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOF.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOF.setClasificacionProgramaPostulacion(2); programaUniversidadPostulacionDTOF.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOG.setCodigoProgramaUniversidadPostulacion("MAG_GC"); 	programaUniversidadPostulacionDTOG.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOG.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOG.setClasificacionProgramaPostulacion(2); programaUniversidadPostulacionDTOG.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOH.setCodigoProgramaUniversidadPostulacion("MAG_AM"); 	programaUniversidadPostulacionDTOH.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOH.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOH.setClasificacionProgramaPostulacion(2); programaUniversidadPostulacionDTOH.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOI.setCodigoProgramaUniversidadPostulacion("MAG_IM"); 	programaUniversidadPostulacionDTOI.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOI.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOI.setClasificacionProgramaPostulacion(2); programaUniversidadPostulacionDTOI.setEstadoProgramaUniversidadPostulacion(false); 
		/**10*/ programaUniversidadPostulacionDTOJ.setCodigoProgramaUniversidadPostulacion("POS_CM"); 	programaUniversidadPostulacionDTOJ.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOJ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOJ.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTOJ.setEstadoProgramaUniversidadPostulacion(false); 

		programaUniversidadPostulacionDTOK.setCodigoProgramaUniversidadPostulacion("POS_ME"); 	programaUniversidadPostulacionDTOK.setCostoProgramaUniversidadPostulacion("-"); 	programaUniversidadPostulacionDTOK.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOK.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTOK.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOL.setCodigoProgramaUniversidadPostulacion("POS_RPCM"); programaUniversidadPostulacionDTOL.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOL.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOL.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTOL.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOM.setCodigoProgramaUniversidadPostulacion("POS_TAmAT"); programaUniversidadPostulacionDTOM.setCostoProgramaUniversidadPostulacion("-"); 	programaUniversidadPostulacionDTOM.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOM.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTOM.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTON.setCodigoProgramaUniversidadPostulacion("POS_TAmM"); programaUniversidadPostulacionDTON.setCostoProgramaUniversidadPostulacion("-"); 	programaUniversidadPostulacionDTON.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTON.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTON.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOO.setCodigoProgramaUniversidadPostulacion("DIPP_AS"); programaUniversidadPostulacionDTOO.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOO.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOO.setClasificacionProgramaPostulacion(4); programaUniversidadPostulacionDTOO.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOP.setCodigoProgramaUniversidadPostulacion("DIPP_D"); 	programaUniversidadPostulacionDTOP.setCostoProgramaUniversidadPostulacion("-"); 	programaUniversidadPostulacionDTOP.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOP.setClasificacionProgramaPostulacion(4); programaUniversidadPostulacionDTOP.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOQ.setCodigoProgramaUniversidadPostulacion("DIPP_GC"); programaUniversidadPostulacionDTOQ.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOQ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOQ.setClasificacionProgramaPostulacion(4); programaUniversidadPostulacionDTOQ.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOR.setCodigoProgramaUniversidadPostulacion("DIPP_Pgvf"); programaUniversidadPostulacionDTOR.setCostoProgramaUniversidadPostulacion("-"); 	programaUniversidadPostulacionDTOR.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOR.setClasificacionProgramaPostulacion(4);   programaUniversidadPostulacionDTOR.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOS.setCodigoProgramaUniversidadPostulacion("DIPE_C"); 	programaUniversidadPostulacionDTOS.setCostoProgramaUniversidadPostulacion("-"); 	programaUniversidadPostulacionDTOS.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOS.setClasificacionProgramaPostulacion(5);   programaUniversidadPostulacionDTOS.setEstadoProgramaUniversidadPostulacion(false); 
		/**20*/	programaUniversidadPostulacionDTOT.setCodigoProgramaUniversidadPostulacion("DIPE_EAari"); programaUniversidadPostulacionDTOT.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOT.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOT.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOT.setEstadoProgramaUniversidadPostulacion(false);

		/**21*/	programaUniversidadPostulacionDTOU.setCodigoProgramaUniversidadPostulacion("DIPE_EApm"); programaUniversidadPostulacionDTOU.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOU.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOU.setClasificacionProgramaPostulacion(5);  programaUniversidadPostulacionDTOU.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOV.setCodigoProgramaUniversidadPostulacion("DIPE_VGC"); 	programaUniversidadPostulacionDTOV.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOV.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOV.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOV.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOW.setCodigoProgramaUniversidadPostulacion("DIPE_PA"); 	programaUniversidadPostulacionDTOW.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOW.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOW.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOW.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOX.setCodigoProgramaUniversidadPostulacion("DIPE_GI"); 	programaUniversidadPostulacionDTOX.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOX.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOX.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOX.setEstadoProgramaUniversidadPostulacion(false); 
		/**25*/ programaUniversidadPostulacionDTOY.setCodigoProgramaUniversidadPostulacion("DIPE_GP"); 	programaUniversidadPostulacionDTOY.setCostoProgramaUniversidadPostulacion("$33.000"); programaUniversidadPostulacionDTOY.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOY.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOY.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOZ.setCodigoProgramaUniversidadPostulacion("DIPE_EP"); 	programaUniversidadPostulacionDTOZ.setCostoProgramaUniversidadPostulacion("$33.000"); programaUniversidadPostulacionDTOZ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOZ.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOZ.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOAA.setCodigoProgramaUniversidadPostulacion("DIPE_VGC_2018"); programaUniversidadPostulacionDTOAA.setCostoProgramaUniversidadPostulacion("-"); programaUniversidadPostulacionDTOAA.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAA.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOAA.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOAB.setCodigoProgramaUniversidadPostulacion("DIPE_PA_2018"); programaUniversidadPostulacionDTOAB.setCostoProgramaUniversidadPostulacion("-"); programaUniversidadPostulacionDTOAB.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAB.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOAB.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOAC.setCodigoProgramaUniversidadPostulacion("DIPE_GI_2018"); programaUniversidadPostulacionDTOAC.setCostoProgramaUniversidadPostulacion("-"); programaUniversidadPostulacionDTOAC.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAC.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOAC.setEstadoProgramaUniversidadPostulacion(false); 
		/**30*/	programaUniversidadPostulacionDTOAD.setCodigoProgramaUniversidadPostulacion("DIPE_GP_2018"); programaUniversidadPostulacionDTOAD.setCostoProgramaUniversidadPostulacion("-"); programaUniversidadPostulacionDTOAD.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAD.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOAD.setEstadoProgramaUniversidadPostulacion(false); 

		/**31*/	programaUniversidadPostulacionDTOAE.setCodigoProgramaUniversidadPostulacion("DIPE_EP_2018"); programaUniversidadPostulacionDTOAE.setCostoProgramaUniversidadPostulacion("-"); programaUniversidadPostulacionDTOAE.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAE.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOAE.setEstadoProgramaUniversidadPostulacion(false); 
		/*32*/  programaUniversidadPostulacionDTOAF.setCodigoProgramaUniversidadPostulacion("MAG_AV_2018_2"); programaUniversidadPostulacionDTOAF.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOAF.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAF.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOAF.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOAG.setCodigoProgramaUniversidadPostulacion("MAG_AM_2018_2"); programaUniversidadPostulacionDTOAG.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOAG.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAG.setClasificacionProgramaPostulacion(2); programaUniversidadPostulacionDTOAG.setEstadoProgramaUniversidadPostulacion(false); 
		/*34*/	programaUniversidadPostulacionDTOAH.setCodigoProgramaUniversidadPostulacion("MAG_IM_2018_2"); programaUniversidadPostulacionDTOAH.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOAH.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAH.setClasificacionProgramaPostulacion(2);  programaUniversidadPostulacionDTOAH.setEstadoProgramaUniversidadPostulacion(false); 
		/*35*/	programaUniversidadPostulacionDTOAI.setCodigoProgramaUniversidadPostulacion("CE_Pos_TAmAT_2018_2"); programaUniversidadPostulacionDTOAI.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOAI.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAI.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTOAI.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOAJ.setCodigoProgramaUniversidadPostulacion("CE_Pos_TAmM_2018_2"); programaUniversidadPostulacionDTOAJ.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOAJ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAJ.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTOAJ.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOAK.setCodigoProgramaUniversidadPostulacion("CE_Pos_RPCM_2018_2"); programaUniversidadPostulacionDTOAK.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOAK.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAK.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTOAK.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOAL.setCodigoProgramaUniversidadPostulacion("DIPPv_EPAC_2018_2"); 	programaUniversidadPostulacionDTOAL.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOAL.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAL.setClasificacionProgramaPostulacion(4); programaUniversidadPostulacionDTOAL.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOAM.setCodigoProgramaUniversidadPostulacion("DIPP_GC_SANTIAGO_2018_2"); programaUniversidadPostulacionDTOAM.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOAM.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAM.setClasificacionProgramaPostulacion(4); programaUniversidadPostulacionDTOAM.setEstadoProgramaUniversidadPostulacion(false);
		/*40*/	programaUniversidadPostulacionDTOAN.setCodigoProgramaUniversidadPostulacion("DIPPv_GPC_2018_2"); 	programaUniversidadPostulacionDTOAN.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOAN.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAN.setClasificacionProgramaPostulacion(4); programaUniversidadPostulacionDTOAN.setEstadoProgramaUniversidadPostulacion(false);

		programaUniversidadPostulacionDTOAO.setCodigoProgramaUniversidadPostulacion("DIPDpv_GC_2018_2"); 	programaUniversidadPostulacionDTOAO.setCostoProgramaUniversidadPostulacion("$33.000"); programaUniversidadPostulacionDTOAO.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAO.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOAO.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOAP.setCodigoProgramaUniversidadPostulacion("DIPDpv_GIC_2018_2"); 	programaUniversidadPostulacionDTOAP.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOAP.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAP.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOAP.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOAQ.setCodigoProgramaUniversidadPostulacion("DIPDp_PROD_2018_2"); 	programaUniversidadPostulacionDTOAQ.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOAQ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAQ.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOAQ.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOAR.setCodigoProgramaUniversidadPostulacion("DIPdpv_GIC_2018_2"); 	programaUniversidadPostulacionDTOAR.setCostoProgramaUniversidadPostulacion("$35.000"); 	programaUniversidadPostulacionDTOAR.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAR.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOAR.setEstadoProgramaUniversidadPostulacion(false);
		/*45*/	programaUniversidadPostulacionDTOAS.setCodigoProgramaUniversidadPostulacion("DIPdp_P_2018_2"); programaUniversidadPostulacionDTOAS.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOAS.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAS.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOAS.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOAT.setCodigoProgramaUniversidadPostulacion("DOC_FmETA_2019"); programaUniversidadPostulacionDTOAT.setCostoProgramaUniversidadPostulacion("$60.000"); 	programaUniversidadPostulacionDTOAT.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAT.setClasificacionProgramaPostulacion(1); programaUniversidadPostulacionDTOAT.setEstadoProgramaUniversidadPostulacion(true);
		programaUniversidadPostulacionDTOAU.setCodigoProgramaUniversidadPostulacion("MAG_AAV_2019"); programaUniversidadPostulacionDTOAU.setCostoProgramaUniversidadPostulacion("$50.000"); 	programaUniversidadPostulacionDTOAU.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAU.setClasificacionProgramaPostulacion(2); programaUniversidadPostulacionDTOAU.setEstadoProgramaUniversidadPostulacion(true);
		programaUniversidadPostulacionDTOAV.setCodigoProgramaUniversidadPostulacion("MAG_AmM_2019"); programaUniversidadPostulacionDTOAV.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOAV.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAV.setClasificacionProgramaPostulacion(2); programaUniversidadPostulacionDTOAV.setEstadoProgramaUniversidadPostulacion(true); 
		programaUniversidadPostulacionDTOAW.setCodigoProgramaUniversidadPostulacion("MAG_AmTHA_2019"); 	programaUniversidadPostulacionDTOAW.setCostoProgramaUniversidadPostulacion("$50.000"); 	programaUniversidadPostulacionDTOAW.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAW.setClasificacionProgramaPostulacion(2); programaUniversidadPostulacionDTOAW.setEstadoProgramaUniversidadPostulacion(true);
		/*50*/	programaUniversidadPostulacionDTOAX.setCodigoProgramaUniversidadPostulacion("MAG_IM_2019"); programaUniversidadPostulacionDTOAX.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOAX.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAX.setClasificacionProgramaPostulacion(2); programaUniversidadPostulacionDTOAX.setEstadoProgramaUniversidadPostulacion(true); 

		programaUniversidadPostulacionDTOAY.setCodigoProgramaUniversidadPostulacion("MAG_GC_2019"); programaUniversidadPostulacionDTOAY.setCostoProgramaUniversidadPostulacion("$50.000"); 	programaUniversidadPostulacionDTOAY.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAY.setClasificacionProgramaPostulacion(2);   programaUniversidadPostulacionDTOAY.setEstadoProgramaUniversidadPostulacion(true); 
		programaUniversidadPostulacionDTOAZ.setCodigoProgramaUniversidadPostulacion("MAG_AM_2019"); 	programaUniversidadPostulacionDTOAZ.setCostoProgramaUniversidadPostulacion("$50.000"); 	programaUniversidadPostulacionDTOAZ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAZ.setClasificacionProgramaPostulacion(2);   programaUniversidadPostulacionDTOAZ.setEstadoProgramaUniversidadPostulacion(true); 
		/*52*/	programaUniversidadPostulacionDTOBA.setCodigoProgramaUniversidadPostulacion("Ce_POS_CM_2019"); programaUniversidadPostulacionDTOBA.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBA.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBA.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTOBA.setEstadoProgramaUniversidadPostulacion(true);
		/*53*/	programaUniversidadPostulacionDTOBB.setCodigoProgramaUniversidadPostulacion("Ce_POS_RPCM_2019"); programaUniversidadPostulacionDTOBB.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBB.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBB.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTOBB.setEstadoProgramaUniversidadPostulacion(true);
		/*54*/	programaUniversidadPostulacionDTOBC.setCodigoProgramaUniversidadPostulacion("Ce_POS_TAmAT_2019"); programaUniversidadPostulacionDTOBC.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBC.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBC.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTOBC.setEstadoProgramaUniversidadPostulacion(true);
		/*55*/	programaUniversidadPostulacionDTOBD.setCodigoProgramaUniversidadPostulacion("Ce_POS_TAmT_2019"); programaUniversidadPostulacionDTOBD.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBD.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBD.setClasificacionProgramaPostulacion(3); programaUniversidadPostulacionDTOBD.setEstadoProgramaUniversidadPostulacion(true);
		/*56*/	programaUniversidadPostulacionDTOBE.setCodigoProgramaUniversidadPostulacion("POS_TAmM_2019"); programaUniversidadPostulacionDTOBE.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOBE.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBE.setClasificacionProgramaPostulacion(4); programaUniversidadPostulacionDTOBE.setEstadoProgramaUniversidadPostulacion(true);
		/*57*/	programaUniversidadPostulacionDTOBF.setCodigoProgramaUniversidadPostulacion("DIPP_AS_2019"); programaUniversidadPostulacionDTOBF.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOBF.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBF.setClasificacionProgramaPostulacion(4); programaUniversidadPostulacionDTOBF.setEstadoProgramaUniversidadPostulacion(true); 
		/*58*/	programaUniversidadPostulacionDTOBG.setCodigoProgramaUniversidadPostulacion("DIPP_GC_sPM_2019"); programaUniversidadPostulacionDTOBG.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOBG.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBG.setClasificacionProgramaPostulacion(4); programaUniversidadPostulacionDTOBG.setEstadoProgramaUniversidadPostulacion(true);
		/*60*/	programaUniversidadPostulacionDTOBH.setCodigoProgramaUniversidadPostulacion("DIPPv_GPC_2019"); programaUniversidadPostulacionDTOBH.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOBH.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBH.setClasificacionProgramaPostulacion(4);  programaUniversidadPostulacionDTOBH.setEstadoProgramaUniversidadPostulacion(true);

		programaUniversidadPostulacionDTOBI.setCodigoProgramaUniversidadPostulacion("DIPP_GC_sStgo_2018"); programaUniversidadPostulacionDTOBI.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOBI.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBI.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOBI.setEstadoProgramaUniversidadPostulacion(true);
		programaUniversidadPostulacionDTOBJ.setCodigoProgramaUniversidadPostulacion("DIPP_GC_sStgo_2019"); programaUniversidadPostulacionDTOBJ.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBJ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBJ.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOBJ.setEstadoProgramaUniversidadPostulacion(true);
		programaUniversidadPostulacionDTOBK.setCodigoProgramaUniversidadPostulacion("DIPdP_EA_sAP_2019"); programaUniversidadPostulacionDTOBK.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBK.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBK.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOBK.setEstadoProgramaUniversidadPostulacion(true);
		programaUniversidadPostulacionDTOBL.setCodigoProgramaUniversidadPostulacion("DIPdP_EA_sPM_2019"); 	programaUniversidadPostulacionDTOBL.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBL.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBL.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOBL.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOBM.setCodigoProgramaUniversidadPostulacion("DIPev_GC_(2019)"); programaUniversidadPostulacionDTOBM.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBM.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBM.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOBM.setEstadoProgramaUniversidadPostulacion(false); 
		programaUniversidadPostulacionDTOBN.setCodigoProgramaUniversidadPostulacion("DIPve_GIC_(2019))"); 	programaUniversidadPostulacionDTOBN.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBN.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBN.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOBN.setEstadoProgramaUniversidadPostulacion(false);
		programaUniversidadPostulacionDTOBO.setCodigoProgramaUniversidadPostulacion("MAG_AmMus_2019"); 	programaUniversidadPostulacionDTOBO.setCostoProgramaUniversidadPostulacion("$50.000"); programaUniversidadPostulacionDTOBO.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBO.setClasificacionProgramaPostulacion(2); programaUniversidadPostulacionDTOBO.setEstadoProgramaUniversidadPostulacion(false);
		
		programaUniversidadPostulacionDTOBP.setCodigoProgramaUniversidadPostulacion("DIPAd_AP_sStgo2019"); 	programaUniversidadPostulacionDTOBP.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBP.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBP.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOBP.setEstadoProgramaUniversidadPostulacion(true);
		programaUniversidadPostulacionDTOBQ.setCodigoProgramaUniversidadPostulacion("DIP_GC_v_2019"); programaUniversidadPostulacionDTOBQ.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBQ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBQ.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOBQ.setEstadoProgramaUniversidadPostulacion(true); 
		/*70*/programaUniversidadPostulacionDTOBR.setCodigoProgramaUniversidadPostulacion("DIP_GC_y_dess_pub_sArica_2019"); 	programaUniversidadPostulacionDTOBR.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBR.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBR.setClasificacionProgramaPostulacion(5); programaUniversidadPostulacionDTOBR.setEstadoProgramaUniversidadPostulacion(true);
		programaUniversidadPostulacionDTOBS.setCodigoProgramaUniversidadPostulacion("DIP_GI_cult_2019"); 	programaUniversidadPostulacionDTOBS.setCostoProgramaUniversidadPostulacion("$35.000"); programaUniversidadPostulacionDTOBS.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOBS.setClasificacionProgramaPostulacion(2); programaUniversidadPostulacionDTOBS.setEstadoProgramaUniversidadPostulacion(true);
		
		programaUniversidadPostulacionDTOA.setPrioridadProgramaUniversidadPostulacion(1); 
		programaUniversidadPostulacionDTOB.setPrioridadProgramaUniversidadPostulacion(2);
		programaUniversidadPostulacionDTOC.setPrioridadProgramaUniversidadPostulacion(3);
		programaUniversidadPostulacionDTOD.setPrioridadProgramaUniversidadPostulacion(4); 
		programaUniversidadPostulacionDTOE.setPrioridadProgramaUniversidadPostulacion(2);
		programaUniversidadPostulacionDTOF.setPrioridadProgramaUniversidadPostulacion(1); 
		programaUniversidadPostulacionDTOG.setPrioridadProgramaUniversidadPostulacion(10);
		programaUniversidadPostulacionDTOH.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOI.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOJ.setPrioridadProgramaUniversidadPostulacion(0);

		programaUniversidadPostulacionDTOK.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOL.setPrioridadProgramaUniversidadPostulacion(11);
		programaUniversidadPostulacionDTOM.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTON.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOO.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOP.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOQ.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOR.setPrioridadProgramaUniversidadPostulacion(12);
		programaUniversidadPostulacionDTOS.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOT.setPrioridadProgramaUniversidadPostulacion(0);

		programaUniversidadPostulacionDTOU.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOV.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOW.setPrioridadProgramaUniversidadPostulacion(13);
		programaUniversidadPostulacionDTOX.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOY.setPrioridadProgramaUniversidadPostulacion(0);
		/**26*/	programaUniversidadPostulacionDTOZ.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAA.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAB.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAC.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAD.setPrioridadProgramaUniversidadPostulacion(0);

		programaUniversidadPostulacionDTOAE.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAF.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAG.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAH.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAI.setPrioridadProgramaUniversidadPostulacion(14);
		programaUniversidadPostulacionDTOAJ.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAK.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAL.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAM.setPrioridadProgramaUniversidadPostulacion(0);
		/**40*/	programaUniversidadPostulacionDTOAN.setPrioridadProgramaUniversidadPostulacion(0);

		programaUniversidadPostulacionDTOAO.setPrioridadProgramaUniversidadPostulacion(1);
		programaUniversidadPostulacionDTOAP.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAQ.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAR.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAS.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOAT.setPrioridadProgramaUniversidadPostulacion(1);
		programaUniversidadPostulacionDTOAU.setPrioridadProgramaUniversidadPostulacion(2);
		programaUniversidadPostulacionDTOAV.setPrioridadProgramaUniversidadPostulacion(3);
		programaUniversidadPostulacionDTOAW.setPrioridadProgramaUniversidadPostulacion(4);
		/**50*/	programaUniversidadPostulacionDTOAX.setPrioridadProgramaUniversidadPostulacion(5);

		programaUniversidadPostulacionDTOAY.setPrioridadProgramaUniversidadPostulacion(6);
		/*52*/	programaUniversidadPostulacionDTOAZ.setPrioridadProgramaUniversidadPostulacion(7);
		programaUniversidadPostulacionDTOBA.setPrioridadProgramaUniversidadPostulacion(8);
		programaUniversidadPostulacionDTOBB.setPrioridadProgramaUniversidadPostulacion(9);
		programaUniversidadPostulacionDTOBC.setPrioridadProgramaUniversidadPostulacion(10);
		programaUniversidadPostulacionDTOBD.setPrioridadProgramaUniversidadPostulacion(11);
		programaUniversidadPostulacionDTOBE.setPrioridadProgramaUniversidadPostulacion(12);
		programaUniversidadPostulacionDTOBF.setPrioridadProgramaUniversidadPostulacion(13);
		programaUniversidadPostulacionDTOBG.setPrioridadProgramaUniversidadPostulacion(14);
		programaUniversidadPostulacionDTOBH.setPrioridadProgramaUniversidadPostulacion(15);

		programaUniversidadPostulacionDTOBI.setPrioridadProgramaUniversidadPostulacion(16);
		programaUniversidadPostulacionDTOBJ.setPrioridadProgramaUniversidadPostulacion(17);
		programaUniversidadPostulacionDTOBK.setPrioridadProgramaUniversidadPostulacion(18);
		programaUniversidadPostulacionDTOBL.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOBM.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOBN.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOBO.setPrioridadProgramaUniversidadPostulacion(0);
		programaUniversidadPostulacionDTOBP.setPrioridadProgramaUniversidadPostulacion(33);
		programaUniversidadPostulacionDTOBQ.setPrioridadProgramaUniversidadPostulacion(33);
		programaUniversidadPostulacionDTOBR.setPrioridadProgramaUniversidadPostulacion(33);
		programaUniversidadPostulacionDTOBS.setPrioridadProgramaUniversidadPostulacion(33);

		programaUniversidadPostulacionDTOA.setNombreProgramaUniversidadPostulacion("Doctorado en Filosofía, Mención en Estética y Teoría de Arte");
		programaUniversidadPostulacionDTOB.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Artes Visuales");
		programaUniversidadPostulacionDTOC.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Dirección Teatral");
		programaUniversidadPostulacionDTOD.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Composición Musical");
		programaUniversidadPostulacionDTOE.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Musicología");
		programaUniversidadPostulacionDTOF.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Teoría e Historia de Arte");
		programaUniversidadPostulacionDTOG.setNombreProgramaUniversidadPostulacion("Magíster en Gestión Cultural");
		programaUniversidadPostulacionDTOH.setNombreProgramaUniversidadPostulacion("Magíster en Artes Mediales");
		programaUniversidadPostulacionDTOI.setNombreProgramaUniversidadPostulacion("Magíster en Interpretación Musical");
		/*10*/  programaUniversidadPostulacionDTOJ.setNombreProgramaUniversidadPostulacion("Curso de especialización de Postítulo en Composición Musical");

		programaUniversidadPostulacionDTOK.setNombreProgramaUniversidadPostulacion("Curso de especialización de Postítulo en Música Electrónica");
		programaUniversidadPostulacionDTOL.setNombreProgramaUniversidadPostulacion("Curso de especialización de Postítulo en Restauración del Patrimonio Cultural Mueble");
		programaUniversidadPostulacionDTOM.setNombreProgramaUniversidadPostulacion("Curso de especialización de Postítulo en Terapias de Arte, mención Arte Terapia");
		programaUniversidadPostulacionDTON.setNombreProgramaUniversidadPostulacion("Curso de especialización de Postítulo en Terapias de Arte, mención Musicoterapia");
		programaUniversidadPostulacionDTOO.setNombreProgramaUniversidadPostulacion("Diploma de Postitulo en Arte sonoro");
		programaUniversidadPostulacionDTOP.setNombreProgramaUniversidadPostulacion("Diploma de Postitulo en Dramaterapia");
		programaUniversidadPostulacionDTOQ.setNombreProgramaUniversidadPostulacion("Diploma de Postitulo en Gestión cultural (sede Puerto Montt)");
		programaUniversidadPostulacionDTOR.setNombreProgramaUniversidadPostulacion("Diploma de Postitulo en Producción gráfica, video y fotografía");
		programaUniversidadPostulacionDTOS.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Curaduría");
		/*20*/	programaUniversidadPostulacionDTOT.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Educación Artística - Arica y Parinacota");

		programaUniversidadPostulacionDTOU.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Educación Artística - Puerto Montt");
		programaUniversidadPostulacionDTOV.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Virtual en Gestión Cultural");
		programaUniversidadPostulacionDTOW.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Producción Artística");
		programaUniversidadPostulacionDTOX.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Extensión en Gestión de Instituciones Culturales");
		programaUniversidadPostulacionDTOY.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Postítulo en Gestión del Patrimonio");
		programaUniversidadPostulacionDTOZ.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Postítulo en Educación del Patrimonio Artístico");
		programaUniversidadPostulacionDTOAA.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Virtual en Gestión Cultural, primer semestre 2018");
		programaUniversidadPostulacionDTOAB.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Producción Artística, primer semestre 2018");
		programaUniversidadPostulacionDTOAC.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Extensión en Gestión de Instituciones Culturales, primer semestre 2018");
		/*30*/	programaUniversidadPostulacionDTOAD.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Postítulo en Gestión del Patrimonio, primer semestre 2018");

		programaUniversidadPostulacionDTOAE.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Postítulo en Educación del Patrimonio Artístico, primer semestre 2018");
		programaUniversidadPostulacionDTOAF.setNombreProgramaUniversidadPostulacion("Magister en Artes Visuales (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAG.setNombreProgramaUniversidadPostulacion("Magister en Artes Mediales (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAH.setNombreProgramaUniversidadPostulacion("Magister en Interpretación Musical (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAI.setNombreProgramaUniversidadPostulacion("Curso de especialización de postítulo en Terapias del Arte mención Arte Terapia (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAJ.setNombreProgramaUniversidadPostulacion("Curso de especialización de postítulo en Terapias del Arte mención Músicoterapia (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAK.setNombreProgramaUniversidadPostulacion("Curso de especialización en postítulo en Restauración del Patrimonio Cultural Mueble (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAL.setNombreProgramaUniversidadPostulacion("Diploma de Postítulo Virtual en Educación del patrimonio artístico y cultural (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAM.setNombreProgramaUniversidadPostulacion("Diploma de Postítulo en Gestión Cultural Sede Santiago (Segundo Semestre 2018)");
		/*40*/	programaUniversidadPostulacionDTOAN.setNombreProgramaUniversidadPostulacion("Diploma de Postítulo Virtual Gestión del patrimonio cultural (Segundo Semestre 2018)");

		programaUniversidadPostulacionDTOAO.setNombreProgramaUniversidadPostulacion("Diploma de Desarrollo Profesional Virtual en Gestión Cultural (Segundo Semestre 2018)"); 
		programaUniversidadPostulacionDTOAP.setNombreProgramaUniversidadPostulacion("Diploma de Desarrollo Profesional Virtual en Gestión de Instituciones Culturales (Segundo Semestre 2018)"); 
		programaUniversidadPostulacionDTOAQ.setNombreProgramaUniversidadPostulacion("Diploma de Desarrollo Profesional en Producción (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAR.setNombreProgramaUniversidadPostulacion("Diploma de Desarrollo Profesional Virtual en Gestión de Instituciones Culturales (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAS.setNombreProgramaUniversidadPostulacion("Diploma de Desarrollo Profesional en Producción (Segundo Semestre 2018) ");
		programaUniversidadPostulacionDTOAT.setNombreProgramaUniversidadPostulacion("Doctorado en Filosofía, mención Estética y Teoría del Arte (2019)");
		programaUniversidadPostulacionDTOAU.setNombreProgramaUniversidadPostulacion("Magister en Artes, mención Artes Visuales (2019)");
		programaUniversidadPostulacionDTOAV.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Composición Musical  (2019)");
		programaUniversidadPostulacionDTOAW.setNombreProgramaUniversidadPostulacion("Magíster en Teoría e Historia del Arte (2019)");
		programaUniversidadPostulacionDTOAX.setNombreProgramaUniversidadPostulacion("Magister en Interpretación Musical (2019)");

		programaUniversidadPostulacionDTOAY.setNombreProgramaUniversidadPostulacion("Magister en Gestión Cultural (2019)");
		/*52*/	programaUniversidadPostulacionDTOAZ.setNombreProgramaUniversidadPostulacion("Magister en Artes Mediales  (2019)");
		programaUniversidadPostulacionDTOBA.setNombreProgramaUniversidadPostulacion("Curso de Especialización de Postítulo en Composición Musical (2019)");
		programaUniversidadPostulacionDTOBB.setNombreProgramaUniversidadPostulacion("Curso de Especialización de Postítulo en Restauración del Patrimonio Cultural Mueble (2019)");
		programaUniversidadPostulacionDTOBC.setNombreProgramaUniversidadPostulacion("Curso de Especialización de Postítulo en Terapias del Arte, mención Arte Terapia  (2019)");
		programaUniversidadPostulacionDTOBD.setNombreProgramaUniversidadPostulacion("Curso de Especialización de Postítulo en Terapias del Arte, mención Músicoterapia (2019)");
		programaUniversidadPostulacionDTOBE.setNombreProgramaUniversidadPostulacion("Diploma de Postítulo en Arte Sonoro (2019)");
		programaUniversidadPostulacionDTOBF.setNombreProgramaUniversidadPostulacion("Diploma Postítulo Virtual en Educación del Patrimonio Artístico y Cultural (2019)");
		programaUniversidadPostulacionDTOBG.setNombreProgramaUniversidadPostulacion("Diploma de Postítulo en Gestión Cultural, sede Puerto Montt (2019)");
		/*60*/	programaUniversidadPostulacionDTOBH.setNombreProgramaUniversidadPostulacion("Diploma Postítulo Virtual en Gestión del Patrimonio Cultural(2019)");

		programaUniversidadPostulacionDTOBI.setNombreProgramaUniversidadPostulacion("Diploma de Postítulo en Gestión Cultural, sede Santiago (2018)");
		programaUniversidadPostulacionDTOBJ.setNombreProgramaUniversidadPostulacion("Diploma de Postítulo en Gestión Cultural, sede Santiago (2019)");
		programaUniversidadPostulacionDTOBK.setNombreProgramaUniversidadPostulacion("Diploma de Desarrollo Profesional en Educación Artística  Arica y Parinacota (2019)");
		programaUniversidadPostulacionDTOBL.setNombreProgramaUniversidadPostulacion("Diploma de Desarrollo Profesional en Educación Artística  Puerto Montt (2019)");
		programaUniversidadPostulacionDTOBM.setNombreProgramaUniversidadPostulacion("Diploma de Extensión Virtual en Gestión Cultural (2019)");
		programaUniversidadPostulacionDTOBN.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Extensión en Gestión de Instituciones Culturales (2019)");
		programaUniversidadPostulacionDTOBO.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Musicología (2019)");
		programaUniversidadPostulacionDTOBL.setNombreProgramaUniversidadPostulacion("Diploma en Administración de archivos públicos (Semipresencial Santiago) (2019)");
		programaUniversidadPostulacionDTOBM.setNombreProgramaUniversidadPostulacion("Diploma en Gestión cultural (Virtual) (2019)");
		programaUniversidadPostulacionDTOBN.setNombreProgramaUniversidadPostulacion("Diploma en Gestión cultural y desarrollo de púbicos (Arica - Parinacota) (2019)");
		programaUniversidadPostulacionDTOBO.setNombreProgramaUniversidadPostulacion("Diploma en Gestión de instituciones culturales (Virtual) (2019)");


		programaUniversidadPostulacionDTOA = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOA);
		programaUniversidadPostulacionDTOB = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOB);
		programaUniversidadPostulacionDTOC = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOC);
		programaUniversidadPostulacionDTOD = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOD);
		programaUniversidadPostulacionDTOE = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOE);
		programaUniversidadPostulacionDTOF = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOF);
		programaUniversidadPostulacionDTOG = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOG);
		programaUniversidadPostulacionDTOH = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOH);
		programaUniversidadPostulacionDTOI = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOI);
		programaUniversidadPostulacionDTOJ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOJ);

		programaUniversidadPostulacionDTOK = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOK);
		programaUniversidadPostulacionDTOL = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOL);
		programaUniversidadPostulacionDTOM = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOM);
		programaUniversidadPostulacionDTON = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTON);
		programaUniversidadPostulacionDTOO = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOO);
		programaUniversidadPostulacionDTOP = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOP);
		programaUniversidadPostulacionDTOQ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOQ);
		programaUniversidadPostulacionDTOR = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOR);
		programaUniversidadPostulacionDTOS = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOS);
		programaUniversidadPostulacionDTOT = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOT);

		programaUniversidadPostulacionDTOU = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOU);
		programaUniversidadPostulacionDTOV = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOV);
		programaUniversidadPostulacionDTOW = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOW);
		programaUniversidadPostulacionDTOX = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOX);
		programaUniversidadPostulacionDTOY = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOY);
		programaUniversidadPostulacionDTOZ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOZ);
		programaUniversidadPostulacionDTOAA = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAA);
		programaUniversidadPostulacionDTOAB = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAB);
		programaUniversidadPostulacionDTOAC = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAC);
		programaUniversidadPostulacionDTOAD = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAD);

		programaUniversidadPostulacionDTOAE = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAE);
		programaUniversidadPostulacionDTOAF = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAF);
		programaUniversidadPostulacionDTOAG = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAG);
		programaUniversidadPostulacionDTOAH = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAH);
		programaUniversidadPostulacionDTOAI = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAI);
		programaUniversidadPostulacionDTOAJ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAJ);
		programaUniversidadPostulacionDTOAK = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAK);
		programaUniversidadPostulacionDTOAL = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAL);
		programaUniversidadPostulacionDTOAM = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAM);
		programaUniversidadPostulacionDTOAN = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAN);

		programaUniversidadPostulacionDTOAO = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAO);
		programaUniversidadPostulacionDTOAP = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAP);
		programaUniversidadPostulacionDTOAQ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAQ);
		programaUniversidadPostulacionDTOAR = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAR);
		programaUniversidadPostulacionDTOAS = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAS);
		programaUniversidadPostulacionDTOAT = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAT);
		programaUniversidadPostulacionDTOAU = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAU);
		programaUniversidadPostulacionDTOAV = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAV);
		programaUniversidadPostulacionDTOAW = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAW);
		programaUniversidadPostulacionDTOAX = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAX);

		programaUniversidadPostulacionDTOAY = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAY);
		programaUniversidadPostulacionDTOAZ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAZ);
		programaUniversidadPostulacionDTOBA = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBA);
		programaUniversidadPostulacionDTOBB = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBB);
		programaUniversidadPostulacionDTOBC = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBC);
		programaUniversidadPostulacionDTOBD = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBD);
		programaUniversidadPostulacionDTOBE = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBE);
		programaUniversidadPostulacionDTOBF = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBF);
		programaUniversidadPostulacionDTOBG = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBG);
		programaUniversidadPostulacionDTOBH = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBH);

		programaUniversidadPostulacionDTOBI = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBI);
		programaUniversidadPostulacionDTOBJ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBJ);
		programaUniversidadPostulacionDTOBK = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBK);
		programaUniversidadPostulacionDTOBL = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBL);
		programaUniversidadPostulacionDTOBM = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBM);
		programaUniversidadPostulacionDTOBN = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBN);
		programaUniversidadPostulacionDTOBO = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBO);
		programaUniversidadPostulacionDTOBP = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBP);
		programaUniversidadPostulacionDTOBQ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBQ);
		programaUniversidadPostulacionDTOBR = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBR);
		programaUniversidadPostulacionDTOBS = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOBS);

	}


	public void crearFinalidadCertificadoServicioTest(){
		objLog.info("crearFinalidadCertificadoServicioTest");
		FinalidadCertificadoDTO finalidadCertificadoDTOA=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOB=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOC=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOD=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOE=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOF=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOG=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOH=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOI=new FinalidadCertificadoDTO();

		finalidadCertificadoDTOA.setCodigoFinalidadCertificado("A");
		finalidadCertificadoDTOB.setCodigoFinalidadCertificado("B");
		finalidadCertificadoDTOC.setCodigoFinalidadCertificado("C");
		finalidadCertificadoDTOD.setCodigoFinalidadCertificado("D");
		finalidadCertificadoDTOE.setCodigoFinalidadCertificado("E");
		finalidadCertificadoDTOF.setCodigoFinalidadCertificado("F");
		finalidadCertificadoDTOG.setCodigoFinalidadCertificado("G");
		finalidadCertificadoDTOH.setCodigoFinalidadCertificado("H");
		finalidadCertificadoDTOI.setCodigoFinalidadCertificado("I");

		finalidadCertificadoDTOA.setNombreFinalidadCertificado("Asignación Familiar ($0.-)"); finalidadCertificadoDTOA.setEstadoFinalidadCertificado(true); finalidadCertificadoDTOA.setPrioridadFinalidadCertificado(1);
		finalidadCertificadoDTOB.setNombreFinalidadCertificado("Beca Interna ($0.-)"); finalidadCertificadoDTOB.setEstadoFinalidadCertificado(true); finalidadCertificadoDTOB.setPrioridadFinalidadCertificado(2);
		finalidadCertificadoDTOC.setNombreFinalidadCertificado("Uso Interno Universidad ($0.-)"); finalidadCertificadoDTOC.setEstadoFinalidadCertificado(true); finalidadCertificadoDTOC.setPrioridadFinalidadCertificado(3);
		finalidadCertificadoDTOD.setNombreFinalidadCertificado("Extranjero ($6.000)"); finalidadCertificadoDTOD.setEstadoFinalidadCertificado(true); finalidadCertificadoDTOD.setPrioridadFinalidadCertificado(4);
		finalidadCertificadoDTOE.setNombreFinalidadCertificado("Horas Cursadas en el Programa de Postgrado ($6.000)"); finalidadCertificadoDTOE.setEstadoFinalidadCertificado(true); finalidadCertificadoDTOE.setPrioridadFinalidadCertificado(5);
		finalidadCertificadoDTOF.setNombreFinalidadCertificado("Fondo Solidario para otras universidades ($0.-)"); finalidadCertificadoDTOF.setEstadoFinalidadCertificado(true); finalidadCertificadoDTOF.setPrioridadFinalidadCertificado(6);
		finalidadCertificadoDTOG.setNombreFinalidadCertificado("Beca Externa (Fondart, Conicyt, Fundación Volcán Calbuco u otra) ($6.000.-)"); finalidadCertificadoDTOG.setEstadoFinalidadCertificado(true); finalidadCertificadoDTOG.setPrioridadFinalidadCertificado(7);
		finalidadCertificadoDTOH.setNombreFinalidadCertificado("Caja de Compensación(CCAF) ($0.-)"); finalidadCertificadoDTOH.setEstadoFinalidadCertificado(true); finalidadCertificadoDTOH.setPrioridadFinalidadCertificado(8);
		finalidadCertificadoDTOI.setNombreFinalidadCertificado("Otros Fines que estime conveniente ($6.000)"); finalidadCertificadoDTOI.setEstadoFinalidadCertificado(true); finalidadCertificadoDTOI.setPrioridadFinalidadCertificado(5);

		finalidadCertificadoDTOA = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOA);
		finalidadCertificadoDTOB = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOB);
		finalidadCertificadoDTOC = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOC);
		finalidadCertificadoDTOD = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOD);
		finalidadCertificadoDTOE = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOE);
		finalidadCertificadoDTOF = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOF);
		finalidadCertificadoDTOG = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOG);
		finalidadCertificadoDTOH = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOH);
		finalidadCertificadoDTOI = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOI);

	}

	public void crearTipoCertificadoServicioTest(){
		objLog.info("crearTipoCertificadoServicioTest");
		TipoCertificadoDTO tipoCertificadoDTOA=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOB=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOC=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOD=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOE=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOF=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOG=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOH=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOI=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOJ=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOK=new TipoCertificadoDTO();

		tipoCertificadoDTOA.setCodigoTipoCertificado("UCH");
		tipoCertificadoDTOB.setCodigoTipoCertificado("UCH");
		tipoCertificadoDTOC.setCodigoTipoCertificado("UCH");
		tipoCertificadoDTOD.setCodigoTipoCertificado("UCH");
		tipoCertificadoDTOE.setCodigoTipoCertificado("UCH");
		tipoCertificadoDTOF.setCodigoTipoCertificado("UCH");
		tipoCertificadoDTOG.setCodigoTipoCertificado("UCH");
		tipoCertificadoDTOH.setCodigoTipoCertificado("UCH");
		tipoCertificadoDTOI.setCodigoTipoCertificado("UCH");
		tipoCertificadoDTOJ.setCodigoTipoCertificado("UCH");
		tipoCertificadoDTOK.setCodigoTipoCertificado("UCH");

		tipoCertificadoDTOA.setNombreTipoCertificado("Estudiante Regular ($6.000.-)"); tipoCertificadoDTOA.setEstadoTipoCertificado(true); tipoCertificadoDTOA.setPrioridadTipoCertificado(1);
		tipoCertificadoDTOB.setNombreTipoCertificado("Egreso ($6.000.-)"); tipoCertificadoDTOB.setEstadoTipoCertificado(true); tipoCertificadoDTOB.setPrioridadTipoCertificado(2);
		tipoCertificadoDTOC.setNombreTipoCertificado("Concentración de Notas ($6.000.-)");  tipoCertificadoDTOC.setEstadoTipoCertificado(true); tipoCertificadoDTOC.setPrioridadTipoCertificado(3);
		tipoCertificadoDTOD.setNombreTipoCertificado("Grado o Título en Trámite ($6.000.-)");  tipoCertificadoDTOD.setEstadoTipoCertificado(true); tipoCertificadoDTOD.setPrioridadTipoCertificado(4);
		tipoCertificadoDTOE.setNombreTipoCertificado("Programas de Asignaturas ($0.-)"); tipoCertificadoDTOE.setEstadoTipoCertificado(true); tipoCertificadoDTOE.setPrioridadTipoCertificado(5);
		tipoCertificadoDTOF.setNombreTipoCertificado("CONICYT - Fecha de Inicio y Término del Programa ($0.-)");  tipoCertificadoDTOF.setEstadoTipoCertificado(true); tipoCertificadoDTOF.setPrioridadTipoCertificado(6);
		tipoCertificadoDTOG.setNombreTipoCertificado("CONICYT - Actividades inscritas por semestre ($0.-)");  tipoCertificadoDTOG.setEstadoTipoCertificado(true); tipoCertificadoDTOG.setPrioridadTipoCertificado(7);
		tipoCertificadoDTOH.setNombreTipoCertificado("CONICYT - Inscripción de Tesis ($0.-)"); tipoCertificadoDTOH.setEstadoTipoCertificado(true); tipoCertificadoDTOH.setPrioridadTipoCertificado(8);
		tipoCertificadoDTOI.setNombreTipoCertificado("CONICYT - Inscripción de Examen de Calificación ($0.-)"); tipoCertificadoDTOI.setEstadoTipoCertificado(true); tipoCertificadoDTOI.setPrioridadTipoCertificado(9);
		tipoCertificadoDTOJ.setNombreTipoCertificado("Notas Parciales y de Exámenes ($6.000.-)"); tipoCertificadoDTOJ.setEstadoTipoCertificado(true); tipoCertificadoDTOJ.setPrioridadTipoCertificado(1);
		tipoCertificadoDTOK.setNombreTipoCertificado("Otros ($6.000.-)");  tipoCertificadoDTOK.setEstadoTipoCertificado(true); tipoCertificadoDTOK.setPrioridadTipoCertificado(1);

		tipoCertificadoDTOA = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOA);
		tipoCertificadoDTOB = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOB);
		tipoCertificadoDTOC = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOC);
		tipoCertificadoDTOD = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOD);
		tipoCertificadoDTOE = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOE);
		tipoCertificadoDTOF = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOF);
		tipoCertificadoDTOG = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOG);
		tipoCertificadoDTOH = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOH);
		tipoCertificadoDTOI = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOI);
		tipoCertificadoDTOJ = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOJ);
		tipoCertificadoDTOK = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOK);
	}

	public void crearTipoSolicitudServicioTest(){
		objLog.info("crearTipoSolicitudServicioTest");
		TipoSolicitudDTO tipoSolicitudDTOA=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOB=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOC=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOD=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOE=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOF=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOG=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOH=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOI=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOJ=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOK=new TipoSolicitudDTO();

		tipoSolicitudDTOA.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOB.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOC.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOD.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOE.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOF.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOG.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOH.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOI.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOJ.setCodigoTipoSolicitud("Otra");
		tipoSolicitudDTOK.setCodigoTipoSolicitud("UCH");

		tipoSolicitudDTOA.setNombreTipoSolicitud("Postergación"); tipoSolicitudDTOA.setEstadoTipoSolicitud(true); tipoSolicitudDTOA.setPrioridadTipoSolicitud(1);
		tipoSolicitudDTOB.setNombreTipoSolicitud("Reincorporación"); tipoSolicitudDTOB.setEstadoTipoSolicitud(true); tipoSolicitudDTOB.setPrioridadTipoSolicitud(2);
		tipoSolicitudDTOC.setNombreTipoSolicitud("Permanencia"); tipoSolicitudDTOC.setEstadoTipoSolicitud(true); tipoSolicitudDTOC.setPrioridadTipoSolicitud(3);
		tipoSolicitudDTOD.setNombreTipoSolicitud("Homologación"); tipoSolicitudDTOD.setEstadoTipoSolicitud(true); tipoSolicitudDTOD.setPrioridadTipoSolicitud(4);
		tipoSolicitudDTOE.setNombreTipoSolicitud("Prórroga Entrega de Tesis"); tipoSolicitudDTOE.setEstadoTipoSolicitud(true); tipoSolicitudDTOE.setPrioridadTipoSolicitud(5);
		tipoSolicitudDTOF.setNombreTipoSolicitud("Inscripción de Tutorias"); tipoSolicitudDTOF.setEstadoTipoSolicitud(true); tipoSolicitudDTOF.setPrioridadTipoSolicitud(6);
		tipoSolicitudDTOG.setNombreTipoSolicitud("Plazo Entrega de Proyecto de Tesis"); tipoSolicitudDTOG.setEstadoTipoSolicitud(true); tipoSolicitudDTOG.setPrioridadTipoSolicitud(7);
		tipoSolicitudDTOH.setNombreTipoSolicitud("Renuncia al Programa"); tipoSolicitudDTOH.setEstadoTipoSolicitud(true); tipoSolicitudDTOH.setPrioridadTipoSolicitud(8);
		tipoSolicitudDTOI.setNombreTipoSolicitud("Inscripción de Tesis"); tipoSolicitudDTOI.setEstadoTipoSolicitud(true); tipoSolicitudDTOI.setPrioridadTipoSolicitud(9);
		tipoSolicitudDTOJ.setNombreTipoSolicitud("Otra Solicitud"); tipoSolicitudDTOJ.setEstadoTipoSolicitud(true); tipoSolicitudDTOJ.setPrioridadTipoSolicitud(1);
		tipoSolicitudDTOK.setNombreTipoSolicitud("Repostulación"); tipoSolicitudDTOK.setEstadoTipoSolicitud(true); tipoSolicitudDTOK.setPrioridadTipoSolicitud(10);

		tipoSolicitudDTOA = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOA);
		tipoSolicitudDTOB = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOB);
		tipoSolicitudDTOC = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOC);
		tipoSolicitudDTOD = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOD);
		tipoSolicitudDTOE = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOE);
		tipoSolicitudDTOF = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOF);
		tipoSolicitudDTOG = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOG);
		tipoSolicitudDTOH = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOH);
		tipoSolicitudDTOI = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOI);
		tipoSolicitudDTOJ = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOJ);
		tipoSolicitudDTOK = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOK);
	}

	public void crearArchivoSolicitudTest(){

		ArchivoSolicitudDTO[] arreglo = new ArchivoSolicitudDTO[1000]; 

		int i=0;

		arreglo[i] = new ArchivoSolicitudDTO(1180, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/11-Noviembre/12/20-Hora/17860255-1_Solicitud_Académica_Homologación.rar", "17860255-1_Solicitud_Académica_Homologación.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1207, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/2/3-Hora/Documentos_postulacion_Katherine_Bachmann_Postitulo_composicion.rar", "Documentos_postulacion_Katherine_Bachmann_Postitulo_composicion.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1208, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/3/14-Hora/cesar_trujillo_postulacion_diplgestioncultural.rar", "cesar_trujillo_postulacion_diplgestioncultural.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1209, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/3/16-Hora/Licencias MIBO.rar", "Licencias MIBO.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1210, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/3/16-Hora/Licencias MIBO.rar", "Licencias MIBO.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1211, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/3/20-Hora/Documentos_postulacion_Katherine_Bachmann_Postitulo_composicion.rar", "Documentos_postulacion_Katherine_Bachmann_Postitulo_composicion.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1212, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/Licencias MIBO.rar", "Licencias MIBO.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1213, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/Licencias MIBO.rar", "Licencias MIBO.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1214, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/Licecnaias médicas MIBO.zip", "Licecnaias médicas MIBO.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1215, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/Licecnaias médicas MIBO.zip", "Licecnaias médicas MIBO.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1216, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/MIBO_solictud_postergación.zip", "MIBO_solictud_postergación.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1217, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/MIBO_solictud_postergación.zip", "MIBO_solictud_postergación.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1218, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/4/14-Hora/IDC - Reglas.zip", "IDC - Reglas.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1219, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/14-Hora/IDC - Reglas.zip", "IDC - Reglas.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1220, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/5/2-Hora/Rosa_Blanco_solicitud_postulacion_Magister_composición musical.rar", "Rosa_Blanco_solicitud_postulacion_Magister_composición musical.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1221, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/6/12-Hora/Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1222, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/6/14-Hora/Natalia Uribe_Solicitud de Pro?rroga.zip", "Natalia Uribe_Solicitud de Pro?rroga.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1223, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/6/15-Hora/Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1224, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/6/15-Hora/Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1225, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/8/17-Hora/vesna cotoras solicitud postulacion magister artes visuales.zip", "vesna cotoras solicitud postulacion magister artes visuales.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1226, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/8/17-Hora/18145856-9_solicitud_postitulo_restauracion_patrimonio_cultural_mueble.rar", "18145856-9_solicitud_postitulo_restauracion_patrimonio_cultural_mueble.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1227, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/10/13-Hora/javiera_peña_solicitud_postulacion_diploma_postitulo_gestion_cultural.rar", "javiera_peña_solicitud_postulacion_diploma_postitulo_gestion_cultural.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1228, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/10/16-Hora/greta_de_giovanni_solicitud_postulacion_postitulo_terapia_de_arte.zip", "greta_de_giovanni_solicitud_postulacion_postitulo_terapia_de_arte.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1229, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/10/18-Hora/Francisca Ruiz_Postulacion maguster gestion cultural 17537785-9.zip", "Francisca Ruiz_Postulacion maguster gestion cultural 17537785-9.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1230, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/11/17-Hora/18145856-9_solicitud_postitulo_restauracion_patrimonio_cultural_mueble.rar", "18145856-9_solicitud_postitulo_restauracion_patrimonio_cultural_mueble.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1231, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/11/19-Hora/Sonia Muñoz_Diplomado Gestión Cultural Pto Montt 2019.rar", "Sonia Muñoz_Diplomado Gestión Cultural Pto Montt 2019.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1232, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/11/19-Hora/Diplomado 2019 Cristina Vicentela.rar", "Diplomado 2019 Cristina Vicentela.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1233, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/11/19-Hora/Diplomado 2019 Cristina Vicentela.rar", "Diplomado 2019 Cristina Vicentela.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1234, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/11/22-Hora/abraham_padilla_solicitud_postulacion_magister_musicologia.zip", "abraham_padilla_solicitud_postulacion_magister_musicologia.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1235, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/12/4-Hora/AnaM Moraga 151577318 Mg Teoría e Historia del Arte.zip", "AnaM Moraga 151577318 Mg Teoría e Historia del Arte.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1236, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/12/16-Hora/Magi?ster en Artes, Artes Visuales, Universidad de Chile.zip", "Magi?ster en Artes, Artes Visuales, Universidad de Chile.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1237, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/12/20-Hora/Rosa_Blanco_solicitud_postulacion_Magister_composición musical.rar", "Rosa_Blanco_solicitud_postulacion_Magister_composición musical.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1238, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/12/22-Hora/Zipp.rar", "Zipp.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1239, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/12/23-Hora/pamela_arrieta_solicitud_postulacion_postitulo_restauración_patrimonio_cultural_mueble.zip", "pamela_arrieta_solicitud_postulacion_postitulo_restauración_patrimonio_cultural_mueble.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1240, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/2-Hora/DOC GA 12320953-2.rar", "DOC GA 12320953-2.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1241, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/13/3-Hora/Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1242, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/13/3-Hora/Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1243, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/13/3-Hora/Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1244, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/13/5-Hora/Formulario inscripción de tesis Elvis Polando.zip", "Formulario inscripción de tesis Elvis Polando.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1245, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/14-Hora/IDC - Reglas.zip", "IDC - Reglas.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1246, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/16-Hora/drive-download-20181213T160850Z-001.zip", "drive-download-20181213T160850Z-001.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1247, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/16-Hora/Viviana_Arango_Postulacion_magister_gestion_cultural.zip", "Viviana_Arango_Postulacion_magister_gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1248, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/16-Hora/pizarro_mariajose_postulacion_.diplomado_artesonoro.zip", "pizarro_mariajose_postulacion_.diplomado_artesonoro.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1249, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/18-Hora/Carolina Schwerter_RepostulacionMGC.rar", "Carolina Schwerter_RepostulacionMGC.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1250, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/1-Hora/DOC GA 12320953-2.rar", "DOC GA 12320953-2.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1251, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/4-Hora/17.631.230-0_solicitud-postulacion_Diplomado_de_desarrollo_profesional_virtual_en_Gestion_cultural.rar", "17.631.230-0_solicitud-postulacion_Diplomado_de_desarrollo_profesional_virtual_en_Gestion_cultural.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1252, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/14-Hora/17.631.230-0_solicitud-postulacion_Diplomado_de_desarrollo_profesional_virtual_en_Gestion_cultural.zip", "17.631.230-0_solicitud-postulacion_Diplomado_de_desarrollo_profesional_virtual_en_Gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1253, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/16-Hora/Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1254, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/17-Hora/Paula Carolina Lopez Diaz_solicitud_postulacion_magister_gestion_cultural.zip", "Paula Carolina Lopez Diaz_solicitud_postulacion_magister_gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1255, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/19-Hora/18907650-9_solicitud_postulacion_magister_artes_visuales.rar", "18907650-9_solicitud_postulacion_magister_artes_visuales.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1256, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/19-Hora/Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1257, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/19-Hora/18907650-9_solicitud_postulacion_magister_artes_visuales.rar", "18907650-9_solicitud_postulacion_magister_artes_visuales.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1258, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/21-Hora/Carolina Ibera Solicitud Postulación Arteterapia.zip", "Carolina Ibera Solicitud Postulación Arteterapia.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1259, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/22-Hora/Solicitud magister Claudia Toro Caberletti Teoria e Historia Arte.zip", "Solicitud magister Claudia Toro Caberletti Teoria e Historia Arte.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1260, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/23-Hora/Gabriela Postulacio?n 2019 U Chile.zip", "Gabriela Postulacio?n 2019 U Chile.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1261, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/23-Hora/Gabriela Alamo Repostulacio?n Magi?ster Gestio?n Cultural.zip", "Gabriela Alamo Repostulacio?n Magi?ster Gestio?n Cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1262, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/0-Hora/15260981-7 POSTULACION POSTITULOARTETERAPIA DELIA ANTINAO.rar", "15260981-7 POSTULACION POSTITULOARTETERAPIA DELIA ANTINAO.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1263, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/1-Hora/MAM Application-Jin Tsai.zip", "MAM Application-Jin Tsai.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1264, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/1-Hora/DOCUMENTOS_CATALINA RIVEROS ESPIÑEIRA (CRE).zip", "DOCUMENTOS_CATALINA RIVEROS ESPIÑEIRA (CRE).zip", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1265, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/1-Hora/308808995_CHIN_FONG_TSAI_solicitud_postulacion_magister_artes_mediales.zip", "308808995_CHIN_FONG_TSAI_solicitud_postulacion_magister_artes_mediales.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1266, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/3-Hora/CARLA_RODRIGUEZ.zip", "CARLA_RODRIGUEZ.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1267, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/3-Hora/CARLA_RODRIGUEZ.zip", "CARLA_RODRIGUEZ.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1268, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/16-Hora/karen espinoza (15341536-6).zip", "karen espinoza (15341536-6).zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1269, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/17-Hora/Ivan_Castillo_solicitud_postulacion_magister_gestion_cultural.rar", "Ivan_Castillo_solicitud_postulacion_magister_gestion_cultural.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1270, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/18-Hora/Jose Miguel Guerra Postulacion Magister gestion Cultural.zip", "Jose Miguel Guerra Postulacion Magister gestion Cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1271, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/19-Hora/CARLA_RODRIGUEZ.zip", "CARLA_RODRIGUEZ.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1272, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/20-Hora/Carolina Gaete Fischer - Magister Teoría e Historia del Arte.rar", "Carolina Gaete Fischer - Magister Teoría e Historia del Arte.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1273, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/21-Hora/marcela_fernandez_solicitud_postulacion_magister_ gestion_cultural.rar", "marcela_fernandez_solicitud_postulacion_magister_ gestion_cultural.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1274, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/22-Hora/Cristian_Soto_Solicitud_Postulación_Magister_Gestión_Cultural.zip", "Cristian_Soto_Solicitud_Postulación_Magister_Gestión_Cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1275, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/22-Hora/233790869-Cecilia Ramallo-Postulación Magíster en Artes con mención en Musicología.rar", "233790869-Cecilia Ramallo-Postulación Magíster en Artes con mención en Musicología.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1276, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/23-Hora/Tamara Contreras Landeros, Magi?ster en Artes, Artes Visuales.zip", "Tamara Contreras Landeros, Magi?ster en Artes, Artes Visuales.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1277, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/16/0-Hora/Nueva carpeta.rar", "Nueva carpeta.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1278, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/16/2-Hora/Gonzalo Cárdenas_solicitud de postulacion_Magiste en teoria e historia del arte.rar", "Gonzalo Cárdenas_solicitud de postulacion_Magiste en teoria e historia del arte.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1279, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/16/16-Hora/17043763-2 Solicitud inscripcion Gestion Cultural Virtual.zip", "17043763-2 Solicitud inscripcion Gestion Cultural Virtual.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1280, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/16/16-Hora/17043763-2_Solicitud_inscripcion_Gestion_Cultural_Virtual.zip", "17043763-2_Solicitud_inscripcion_Gestion_Cultural_Virtual.zip", "solicitudPostulacion"); i=i+1; 
		arreglo[i] = new ArchivoSolicitudDTO(1281, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/17/2-Hora/natalia_escare_solicitud de admisión___Arte Terapia.zip", "natalia_escare_solicitud de admisión___Arte Terapia.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1282, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/17/14-Hora/IDC - Reglas.zip", "IDC - Reglas.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1283, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/17/21-Hora/Valeria Valle Magister en composicion.zip", "Valeria Valle Magister en composicion.zip", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1284, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/18/2-Hora/Postulación Magister - Gonzalo Cuadra.zip", "Postulación Magister - Gonzalo Cuadra.zip", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1285, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/18/2-Hora/17855635-5_solicitud_extensión_prórroga_AndreaUlloa_MGC.rar", "17855635-5_solicitud_extensión_prórroga_AndreaUlloa_MGC.rar", "solicitudAcademica"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1286, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/18/15-Hora/Gonzalo Cárdenas_solicitud de postulación_Magíster en teoría e historia del arte.zip", "Gonzalo Cárdenas_solicitud de postulación_Magíster en teoría e historiadel arte.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1287, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/18/15-Hora/Gonzalo Cárdenas_solicitud de postulación_Magíster en teoría e historia del arte.zip", "Gonzalo Cárdenas_solicitud de postulación_Magíster en teoría e historia del arte.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1288, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/19/15-Hora/Natalia Uribe_Solicitud de Pro?rroga.zip", "Natalia Uribe_Solicitud de Pro?rroga.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1289, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/20/1-Hora/isidora_cruz_solicitud_academica_homologacion.rar", "isidora_cruz_solicitud_academica_homologacion.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1290, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/21/13-Hora/CV Erika Horta.zip", "CV Erika Horta.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1291, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/24/2-Hora/Diego de la Fuente (2).pdf.zip", "Diego de la Fuente (2).pdf.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1292, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/27/12-Hora/Documentos Diplomado.zip", "Documentos Diplomado.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1293, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/27/12-Hora/Damián Cueto_18.761.302-7_Gestión Cultural.zip", "Damián Cueto_18.761.302-7_Gestión Cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1294, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/28/14-Hora/Postulacio?n.rar", "Postulacio?n.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1295, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/31/18-Hora/Maria_Rebeca_Sanchez.zip", "Maria_Rebeca_Sanchez.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1296, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/3/0-Hora/Postulación Magister - Gonzalo Cuadra.zip", "Postulación Magister - Gonzalo Cuadra.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1297, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/3/3-Hora/Inscripción Tesis A Carrizo Munoz 56107924.zip", "Inscripción Tesis A Carrizo Munoz 56107924.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1298, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/3/15-Hora/Felipe Salinas, solicitud postulación Postítulo Composición.rar", "Felipe Salinas, solicitud postulación Postítulo Composición.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1299, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/3/17-Hora/Nuevo Archivo WinRAR ZIP.zip", "Nuevo Archivo WinRAR ZIP.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1300, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/4/15-Hora/Paula C Lopez_Solicitud_postulacion_magister_gestion_cultural.zip", "Paula C Lopez_Solicitud_postulacion_magister_gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1301, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/4/17-Hora/Felipe Salinas, solicitud postulación Postítulo Composición.rar", "Felipe Salinas, solicitud postulación Postítulo Composición.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1302, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/4/20-Hora/Felipe Salinas, solicitud postulación Postítulo Composición.zip", "Felipe Salinas, solicitud postulación Postítulo Composición.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1303, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/7/14-Hora/Miguel_Rios_Solicitud_Postulacion_Curso_Postitulo_en Composcion.rar.rar", "Miguel_Rios_Solicitud_Postulacion_Curso_Postitulo_en Composcion.rar.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1304, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/8/16-Hora/andres dinamarca solicitud postulacion diplomado virtural gestion del patrimonio cultural.rar", "andres dinamarca solicitud postulacion diplomado virtural gestion del patrimonio cultural.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1305, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/8/20-Hora/DanielaFuentes_Postulacion_CursoPostituloRestauracionDePatrimonioCulturalMueble.zip", "DanielaFuentes_Postulacion_CursoPostituloRestauracionDePatrimonioCulturalMueble.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1306, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/9/2-Hora/Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1307, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/9/22-Hora/Ibiss Villalobos postulación arte terapia - copia.rar", "Ibiss Villalobos postulación arte terapia - copia.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1308, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/10/13-Hora/postulacion gestion cultural 2019.zip", "postulacion gestion cultural 2019.zip", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1309, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/10/16-Hora/Formulario Inscripción Tesis. S. Gaspar.pdf.zip", "Formulario Inscripción Tesis. S. Gaspar.pdf.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1310, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/15/6-Hora/henry_palacio_solicitud_postulacion_magister_artes_mencion_artes_visuales_AN931614.zip", "henry_palacio_solicitud_postulacion_magister_artes_mencion_artes_visuales_AN931614.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1311, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/15/6-Hora/henry_palacio_solicitud_postulacion_magister_artes_mencion_artes_visuales_AN931614.zip", "henry_palacio_solicitud_postulacion_magister_artes_mencion_artes_visuales_AN931614.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1312, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/16/16-Hora/Ignacio_Apablaza_solicitud_postulacion_diploma_postitulo_gestion_cultural.rar", "Ignacio_Apablaza_solicitud_postulacion_diploma_postitulo_gestion_cultural.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1313, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/16/22-Hora/12953468-0_solicitud_académica_prorroga_entrega_de_tesis.rar", "12953468-0_solicitud_académica_prorroga_entrega_de_tesis.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1314, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/17/13-Hora/marcel_becerra_ibaceta_postitulo_gestion_cultural_santiago_2019.rar", "marcel_becerra_ibaceta_postitulo_gestion_cultural_santiago_2019.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1315, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/17/19-Hora/tomas_ahumada_formulario_inscripcion_tesis.pdf.zip", "tomas_ahumada_formulario_inscripcion_tesis.pdf.zip", "solicitudAcademica"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1316, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/17/20-Hora/Formulario inscripcion tesis.zip", "Formulario inscripcion tesis.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1317, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/17/21-Hora/irma_sepu?lveda_solicitud_postulacion_ Magister_en_Artes, mencio?n_Artes Visuales.zip", "irma_sepu?lveda_solicitud_postulacion_ Magister_en_Artes, mencio?n_Artes Visuales.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1318, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/17/22-Hora/Formulario_Inscripci195179n_Tesis_P.Reynaldos.rar", "Formulario_Inscripci195179n_Tesis_P.Reynaldos.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1319, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/18/13-Hora/12953468-0_solicitud_académica_prórroga.rar", "12953468-0_solicitud_académica_prórroga.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1320, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/18/13-Hora/12953468-0_solicitud_académica_prórroga.rar", "12953468-0_solicitud_académica_prórroga.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1321, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/18/19-Hora/12953468-0_solicitud_académica_prórroga.rar", "12953468-0_solicitud_académica_prórroga.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1322, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/18/19-Hora/12953468-0_solicitud_académica_prórroga.rar", "12953468-0_solicitud_académica_prórroga.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1323, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/21/1-Hora/Mun?oz Documentos Obligatorios.zip", "Mun?oz Documentos Obligatorios.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1324, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/21/2-Hora/jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1325, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/21/13-Hora/jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1326, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/21/13-Hora/jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1327, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/21/22-Hora/Formulario Inscripción Tesis. G. Pérez.zip", "Formulario Inscripción Tesis. G. Pérez.zip", "solicitudAcademica"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1328, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/22/3-Hora/Documentos Chile.zip", "Documentos Chile.zip", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1329, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/23/15-Hora/claudiaaranda_postulacion_diplomagestionpatrimonio.rar", "claudiaaranda_postulacion_diplomagestionpatrimonio.rar", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1330, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/23/19-Hora/pablo_talhouk_solicitud_postulacion_magister_artes_visuales.zip", "pablo_talhouk_solicitud_postulacion_magister_artes_visuales.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1331, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/24/14-Hora/REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1332, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/24/14-Hora/REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1333, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/24/15-Hora/REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1334, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/24/15-Hora/karen_castel_solicitud_postulacion_curso_especializacion_restauracion_patrimonio_cultural_mueble.rar", "karen_castel_solicitud_postulacion_curso_especializacion_restauracion_patrimonio_cultural_mueble.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1335, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/24/22-Hora/karen_castel_solicitud_postulacion_curso_especializacion_restauracion_patrimonio_cultural_mueble.zip", "karen_castel_solicitud_postulacion_curso_especializacion_restauracion_patrimonio_cultural_mueble.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1336, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/25/7-Hora/daniela_portillo_solicitud_academica_prorroga_entrega_tesis.zip", "daniela_portillo_solicitud_academica_prorroga_entrega_tesis.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1337, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/26/16-Hora/BELEM GALAZ-MAGISTER EN GESTIÓN CULTURAL-2019.zip", "BELEM GALAZ-MAGISTER EN GESTIÓN CULTURAL-2019.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1338, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/27/4-Hora/carolina (1).rar", "carolina (1).rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1339, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/27/21-Hora/sandra_alegria_solicitud_postulacion_postitulo_arteterapia.zip", "sandra_alegria_solicitud_postulacion_postitulo_arteterapia.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1340, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/1-Hora/VALENTINA_VIDAL_SALAZAR_SOLICITUD_POSTITULO_GESTION_CULTURAL.rar", "VALENTINA_VIDAL_SALAZAR_SOLICITUD_POSTITULO_GESTION_CULTURAL.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1341, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/15-Hora/Roberto_Dan?obeitia_postulacion_diplomado_gestion_cultural.zip", "Roberto_Dan?obeitia_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1342, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/18-Hora/Lorenzo_Cornejo_solicitud_postulacion_Magister_en_Artes_mención_Musicología.rar", "Lorenzo_Cornejo_solicitud_postulacion_Magister_en_Artes_mención_Musicología.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1343, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/18-Hora/katerine_saldias_postulacion_postitulo_virtual_gestion_patrimonio_cultural.rar", "katerine_saldias_postulacion_postitulo_virtual_gestion_patrimonio_cultural.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1344, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/19-Hora/Jessica Quezada Nuñez. Rut.10.299.785-9. Postulación Magister Interpretación musical en Dirección Coral.zip", "Jessica Quezada Nuñez. Rut.10.299.785-9. Postulación Magister Interpretación musical en Dirección Coral.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1345, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/19-Hora/Aline Suarez Palma. Postulación Diplomado de Gestión Cultural Virtual. Rut 16.196.422-0.zip", "Aline Suarez Palma. Postulación Diplomado de Gestión Cultural Virtual. Rut 16.196.422-0.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1346, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/29/15-Hora/Formulario inscripción de Tesis C. Hidalgo.pdf.zip", "Formulario inscripción de Tesis C. Hidalgo.pdf.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1347, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/29/15-Hora/Formulario inscripción de Tesis C. Hidalgo.pdf.zip", "Formulario inscripción de Tesis C. Hidalgo.pdf.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1348, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/29/17-Hora/carmen_aramburu-solicitud_postulacion_diploma postitulo_gestion_patrimonio_cultural.zip", "carmen_aramburu-solicitud_postulacion_diploma postitulo_gestion_patrimonio_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1349, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/29/18-Hora/Lorenzo_Cornejo_solicitud_postulacion_Magister_Musicologia.rar", "Lorenzo_Cornejo_solicitud_postulacion_Magister_Musicologia.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1350, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/29/18-Hora/katerine_saldias_postulacion_postitulo_virtual_gestion_patrimonio_cultural.rar", "katerine_saldias_postulacion_postitulo_virtual_gestion_patrimonio_cultural.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1351, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/0-Hora/Daniel_varas_solicitud_postulacion_postitulo en Restauracion.rar.rar", "Daniel_varas_solicitud_postulacion_postitulo en Restauracion.rar.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1352, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/0-Hora/Trinidad_ Yarad_solicitud_arteterapia alias.zip", "Trinidad_ Yarad_solicitud_arteterapia alias.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1353, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/18-Hora/Archivos Trini.rar", "Archivos Trini.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1354, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/18-Hora/Trinidad_Yarad_solicitud_postulación_postítulo_arteterapia.rar", "Trinidad_Yarad_solicitud_postulación_postítulo_arteterapia.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1355, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/18-Hora/AnaAraya.17702203-9.PostulaciónDiplomadoVirtualGestiónPatrimonioCultural..zip", "AnaAraya.17702203-9.PostulaciónDiplomadoVirtualGestiónPatrimonioCultural..zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1356, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/19-Hora/Nuevo Archivo WinRAR ZIP.zip", "Nuevo Archivo WinRAR ZIP.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1357, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/22-Hora/Carta de Recomendación Prof. María de los angeles.rar", "Carta de Recomendación Prof. María de los angeles.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1358, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/22-Hora/Postulación_magister_astesvisuales_sebastiánDuarte_rut18.731.086-5.rar", "Postulación_magister_astesvisuales_sebastiánDuarte_rut18.731.086-5.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1359, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/22-Hora/VirginiaAcosta_solicitud_postulacion_magister_artesvisuales.zip", "VirginiaAcosta_solicitud_postulacion_magister_artesvisuales.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1360, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/23-Hora/Antonio_Urrutia_Luxoro_solicitud_postulación_Magíster_Teoría_e_Historia_del_Arte.rar", "Antonio_Urrutia_Luxoro_solicitud_postulación_Magíster_Teoría_e_Historia_del_Arte.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1361, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/31/16-Hora/Magíster, Sebastián Mahaluf.rar", "Magíster, Sebastián Mahaluf.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1362, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/31/16-Hora/13.505.509-0 solocitud academica rendicion examen.rar", "13.505.509-0 solocitud academica rendicion examen.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1363, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/2-Febrero/28/14-Hora/Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1364, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/2-Febrero/28/15-Hora/Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1365, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/4/0-Hora/Felipe_contreras_solicitud_academica_prorroga_tesis.rar", "Felipe_contreras_solicitud_academica_prorroga_tesis.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1366, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/4/0-Hora/Felipe_contreras_solicitud_academica_prorroga_tesis.rar", "Felipe_contreras_solicitud_academica_prorroga_tesis.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1367, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/4/12-Hora/Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1368, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/4/12-Hora/Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1369, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/4/12-Hora/Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1370, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/4/17-Hora/Magister de Artes Visuales Paula Izquierdo.zip", "Magister de Artes Visuales Paula Izquierdo.zip", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1371, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/5/1-Hora/Cecilia_Sandoval_solicitud_postulacion_Curso de Especialización de Postítulo en Restauración del Patrimonio Cultural Muebl.rar", "Cecilia_Sandoval_solicitud_postulacion_Curso de Especialización de Postítulo en Restauración del Patrimonio Cultural Muebl.rar", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1372, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/5/13-Hora/Archivo.zip", "Archivo.zip", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1373, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/5/20-Hora/zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "solicitudAcademica"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1374, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/5/20-Hora/sebastian_mahaluf_solicitus_academica.zip", "sebastian_mahaluf_solicitus_academica.zip", "solicitudAcademica"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1375, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/5/20-Hora/consorcio-soap-portlet.zip", "consorcio-soap-portlet.zip", "solicitudAcademica"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1376, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/31/16-Hora/Magíster, Sebastián Mahaluf.rar", "Magíster, Sebastián Mahaluf.rar", "solicitudAcademica"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1377, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/5/21-Hora/daniela_canto_solicitud_postulacion_extension_virtual_diplomado_gestion_cultural.rar", "daniela_canto_solicitud_postulacion_extension_virtual_diplomado_gestion_cultural.rar", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1378, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/5/20-Hora/zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "solicitudAcademica"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1379, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/6/15-Hora/Archivo comprimido.zip", "Archivo comprimido.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1380, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/6/19-Hora/Eduardo_Flores_Prorroga_entrega_de_tesis_2019.zip", "Eduardo_Flores_Prorroga_entrega_de_tesis_2019.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1381, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/6/19-Hora/Eduardo_Flores_Prorroga_entrega_de_tesis_2019.zip", "Eduardo_Flores_Prorroga_entrega_de_tesis_2019.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1382, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/7/15-Hora/consorcio-soap-portlet.zip", "consorcio-soap-portlet.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1383, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/7/18-Hora/Araceli_Rodríguez_Prorroga_entrega_de_tesis_2019.rar", "Araceli_Rodríguez_Prorroga_entrega_de_tesis_2019.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1384, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/9/23-Hora/Paulina Aguayo Solicitud Postulacion Especialidad Arte Terapia.zip", "Paulina Aguayo Solicitud Postulacion Especialidad Arte Terapia.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1385, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/10/18-Hora/dominique_manghi_solicitud_postulacion_postitulo_virtual_gestion_patrimonio_cultural.zip", "dominique_manghi_solicitud_postulacion_postitulo_virtual_gestion_patrimonio_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1386, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/12/15-Hora/juan diaz solicitud postulacion diploma de postitulo en arte sonoro.rar", "juan diaz solicitud postulacion diploma de postitulo en arte sonoro.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1387, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/5/20-Hora/zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1388, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/20-Hora/Documentos Julio Chávez.zip", "Documentos Julio Chávez.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1389, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/20-Hora/julio_chávez_solicitud_postulación_magister_artes_visuales.zip.zip", "julio_chávez_solicitud_postulación_magister_artes_visuales.zip.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1390, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/20-Hora/DanielaQuelin.rar", "DanielaQuelin.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1391, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/22-Hora/raimundo_rosas_solicitud_postulacion_postitulo_arteterapia.zip", "raimundo_rosas_solicitud_postulacion_postitulo_arteterapia.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1392, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/22-Hora/9898298-1_solicitud_postulacion_postitulo_arteterapia.zip", "9898298-1_solicitud_postulacion_postitulo_arteterapia.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1393, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/22-Hora/DANIEL_QUELIN_solicitud_postulacion_magister_gestion_cultural.rar.rar", "DANIEL_QUELIN_solicitud_postulacion_magister_gestion_cultural.rar.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1394, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/22-Hora/DANIEL_QUELIN_solicitud_postulacion_magister_gestion_cultural.rar", "DANIEL_QUELIN_solicitud_postulacion_magister_gestion_cultural.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1395, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/15-Hora/rebeca_gutierrez_solicitud_postulacion_magister_gestion_cultural.zip", "rebeca_gutierrez_solicitud_postulacion_magister_gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1396, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/16-Hora/TANIA_CALDERON_LEIVA_POSTULACION_MAGISTER_ARTES_MENCION_ARTES_PLASTICAS.zip", "TANIA_CALDERON_LEIVA_POSTULACION_MAGISTER_ARTES_MENCION_ARTES_PLASTICAS.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1397, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/17-Hora/Pablo Rojas postulacion magister gestion cultural.zip", "Pablo Rojas postulacion magister gestion cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1398, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/17-Hora/16509388_7_solicitud_magister_artes_mediales.zip", "16509388_7_solicitud_magister_artes_mediales.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1399, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/17-Hora/16509388_7_solicitud_magister_artes_mediales.zip", "16509388_7_solicitud_magister_artes_mediales.zip", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1400, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/19-Hora/George_Lee_V_solicitud_postulacion_magistes_artes_visuales.zip", "George_Lee_V_solicitud_postulacion_magistes_artes_visuales.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1401, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/19-Hora/CV Lorenzo Segovia_post restauracion 2019.zip", "CV Lorenzo Segovia_post restauracion 2019.zip", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1402, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/15/20-Hora/Resultados postulacio?n MGC 2015.zip", "Resultados postulacio?n MGC 2015.zip", "solicitudAcademica"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1403, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/15/20-Hora/rebeca_gutierrez_solicitud_REpostulacion_magister_gestion_cultural.zip", "rebeca_gutierrez_solicitud_REpostulacion_magister_gestion_cultural.zip", "solicitudAcademica"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1404, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/16/2-Hora/lorenzo segovia post restau.rar", "lorenzo segovia post restau.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1405, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/16/3-Hora/lorenzo segovia post restau.rar", "lorenzo segovia post restau.rar", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1406, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/18/0-Hora/17552329-4_solicitud_postulacion_magister_gestion_cultural.rar.rar", "17552329-4_solicitud_postulacion_magister_gestion_cultural.rar.rar", "solicitudPostulacion"); i=i+1;	
		arreglo[i] = new ArchivoSolicitudDTO(1407, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/12-Hora/Solicitud ORTEGA SÁENZ.zip", "Solicitud ORTEGA SÁENZ.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1408, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/12-Hora/ORTEGA SÁENZ_ Solicitud_ reincorporación-doctorado.zip", "ORTEGA SÁENZ_ Solicitud_ reincorporación-doctorado.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1409, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/13-Hora/Zipp.rar", "Zipp.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1410, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/13-Hora/Aguayo Gloria Magister Gestión Cultural.rar", "Aguayo Gloria Magister Gestión Cultural.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1411, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/13-Hora/Alejandra Jiménez Castro.rar", "Alejandra Jiménez Castro.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1412, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/13-Hora/Alejandra Jiménez Castro.rar", "Alejandra Jiménez Castro.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1413, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/15-Hora/documentos prorroga tesis.zip", "documentos prorroga tesis.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1414, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/16-Hora/Alejandra Jiménez Castro.rar", "Alejandra Jiménez Castro.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1415, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/18/18-Hora/17552329-4_solicitud_postulacion_magister_gestion_cultural.zip", "17552329-4_solicitud_postulacion_magister_gestion_cultural.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1416, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/19/4-Hora/Solicitud prórroga Tesis HPeralta.rar", "Solicitud prórroga Tesis HPeralta.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1417, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/19/4-Hora/Solicitud prórroga Tesis HPeralta.rar", "Solicitud prórroga Tesis HPeralta.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1418, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/19/20-Hora/Solicitud prórroga Tesis HPeralta.rar", "Solicitud prórroga Tesis HPeralta.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1419, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/20/15-Hora/Postulacion Ximena Guzman Magister en Gestion Cultural zip.zip", "Postulacion Ximena Guzman Magister en Gestion Cultural zip.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1420, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/20/17-Hora/ConsorcioSoapPortlet_pr.zip", "ConsorcioSoapPortlet_pr.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1421, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/20/19-Hora/Postulación Julio Barrios Magister.rar", "Postulación Julio Barrios Magister.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1422, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/21/0-Hora/Documentos_Manuel_Alvarado_Cornejo.rar", "Documentos_Manuel_Alvarado_Cornejo.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1423, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/21/14-Hora/14.385.735-2_postulación postítulo.rar", "14.385.735-2_postulación postítulo.rar", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1424, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/22/19-Hora/Paula_Lopez_solicitud_academica_determinar modalidad de solicitud.zip", "Paula_Lopez_solicitud_academica_determinar modalidad de solicitud.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1425, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/24/4-Hora/solcitud prorroga tesis PDominguez.zip", "solcitud prorroga tesis PDominguez.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1426, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/25/21-Hora/Natalia Uribe_Solicitud de Pro?rroga.zip", "Natalia Uribe_Solicitud de Pro?rroga.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1427, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/26/2-Hora/REINHARDT-SCHULZ-POSTULACION-MAGISTER-ARTES-MEDIALES.zip", "REINHARDT-SCHULZ-POSTULACION-MAGISTER-ARTES-MEDIALES.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1428, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/26/14-Hora/06784594_3 Carta MGC posterga fecha TESIS LWeinstein.pdf.zip", "06784594_3 Carta MGC posterga fecha TESIS LWeinstein.pdf.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1429, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/26/16-Hora/modificaciones.zip", "modificaciones.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1431, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/27/14-Hora/Cristóbal De Ferrari Certificado Médico Reincorporación.rar", "Cristóbal De Ferrari Certificado Médico Reincorporación.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1432, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/27/15-Hora/Ricardo Mandujano Madariaga. Solicitud renuncia 2019.rar", "Ricardo Mandujano Madariaga. Solicitud renuncia 2019.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1433, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/27/16-Hora/felipe kong solicitud capítulo tesis.zip", "felipe kong solicitud capítulo tesis.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1434, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/28/16-Hora/maite_flores_solicitud_postulacion_postitulo_arte_sonoro.zip", "maite_flores_solicitud_postulacion_postitulo_arte_sonoro.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1435, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/28/23-Hora/Nadya Ramírez solicitud de prórroga tesis.rar", "Nadya Ramírez solicitud de prórroga tesis.rar", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1436, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/29/11-Hora/Solicitud de Pro?rroga Jose? Gil.zip", "Solicitud de Pro?rroga Jose? Gil.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1437, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/29/11-Hora/Solicitud de Pro?rroga Jose? Gil.zip", "Solicitud de Pro?rroga Jose? Gil.zip", "solicitudAcademica"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1438, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/4-Abril/2/20-Hora/oscar_teare_solicitud_postulacion_diplomado_posti?tulo_arte_sonoro.zip", "oscar_teare_solicitud_postulacion_diplomado_posti?tulo_arte_sonoro.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1439, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/4-Abril/3/13-Hora/oscar_teare_solicitud_postulacion_diplomado_posti?tulo_arte_sonoro.zip", "oscar_teare_solicitud_postulacion_diplomado_posti?tulo_arte_sonoro.zip", "solicitudPostulacion"); i=i+1;
		arreglo[i] = new ArchivoSolicitudDTO(1440, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/4-Abril/3/17-Hora/Postulación Diplomado GC.rar", "Postulación Diplomado GC.rar", "solicitudPostulacion"); i=i+1;
		
		//		'1180', '/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/11-Noviembre/12/20-Hora/17860255-1_Solicitud_Académica_Homologación.rar', '17860255-1_Solicitud_Académica_Homologación.rar', 'solicitudAcademica'
		//
		//	ArchivoSolicitudDTO archivoSolicitudDTOA = new ArchivoSolicitudDTO(1207, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/2/3-Hora/Documentos_postulacion_Katherine_Bachmann_Postitulo_composicion.rar", "Documentos_postulacion_Katherine_Bachmann_Postitulo_composicion.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOB = new ArchivoSolicitudDTO(1208, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/3/14-Hora/cesar_trujillo_postulacion_diplgestioncultural.rar", "cesar_trujillo_postulacion_diplgestioncultural.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOC = new ArchivoSolicitudDTO(1209, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/3/16-Hora/Licencias MIBO.rar", "Licencias MIBO.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOD = new ArchivoSolicitudDTO(1210, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/3/16-Hora/Licencias MIBO.rar", "Licencias MIBO.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOE = new ArchivoSolicitudDTO(1211, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/3/20-Hora/Documentos_postulacion_Katherine_Bachmann_Postitulo_composicion.rar", "Documentos_postulacion_Katherine_Bachmann_Postitulo_composicion.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOF = new ArchivoSolicitudDTO(1212, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/Licencias MIBO.rar", "Licencias MIBO.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOG = new ArchivoSolicitudDTO(1213, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/Licencias MIBO.rar", "Licencias MIBO.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOH = new ArchivoSolicitudDTO(1214, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/Licecnaias médicas MIBO.zip", "Licecnaias médicas MIBO.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOI = new ArchivoSolicitudDTO(1215, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/Licecnaias médicas MIBO.zip", "Licecnaias médicas MIBO.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOJ = new ArchivoSolicitudDTO(1216, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/MIBO_solictud_postergación.zip", "MIBO_solictud_postergación.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOK = new ArchivoSolicitudDTO(1217, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/13-Hora/MIBO_solictud_postergación.zip", "MIBO_solictud_postergación.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOL = new ArchivoSolicitudDTO(1218, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/4/14-Hora/IDC - Reglas.zip", "IDC - Reglas.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOM = new ArchivoSolicitudDTO(1219, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/4/14-Hora/IDC - Reglas.zip", "IDC - Reglas.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTON = new ArchivoSolicitudDTO(1220, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/5/2-Hora/Rosa_Blanco_solicitud_postulacion_Magister_composición musical.rar", "Rosa_Blanco_solicitud_postulacion_Magister_composición musical.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOO = new ArchivoSolicitudDTO(1221, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/6/12-Hora/Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOP = new ArchivoSolicitudDTO(1222, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/6/14-Hora/Natalia Uribe_Solicitud de Pro?rroga.zip", "Natalia Uribe_Solicitud de Pro?rroga.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOQ = new ArchivoSolicitudDTO(1223, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/6/15-Hora/Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOR = new ArchivoSolicitudDTO(1224, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/6/15-Hora/Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "Daniela Núñez Rosas_Postulación Postítulo en Terapias de Arte.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOS = new ArchivoSolicitudDTO(1225, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/8/17-Hora/vesna cotoras solicitud postulacion magister artes visuales.zip", "vesna cotoras solicitud postulacion magister artes visuales.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOT = new ArchivoSolicitudDTO(1226, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/8/17-Hora/18145856-9_solicitud_postitulo_restauracion_patrimonio_cultural_mueble.rar", "18145856-9_solicitud_postitulo_restauracion_patrimonio_cultural_mueble.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOU = new ArchivoSolicitudDTO(1227, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/10/13-Hora/javiera_peña_solicitud_postulacion_diploma_postitulo_gestion_cultural.rar", "javiera_peña_solicitud_postulacion_diploma_postitulo_gestion_cultural.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOV = new ArchivoSolicitudDTO(1228, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/10/16-Hora/greta_de_giovanni_solicitud_postulacion_postitulo_terapia_de_arte.zip", "greta_de_giovanni_solicitud_postulacion_postitulo_terapia_de_arte.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOW = new ArchivoSolicitudDTO(1229, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/10/18-Hora/Francisca Ruiz_Postulacion maguster gestion cultural 17537785-9.zip", "Francisca Ruiz_Postulacion maguster gestion cultural 17537785-9.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOX = new ArchivoSolicitudDTO(1230, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/11/17-Hora/18145856-9_solicitud_postitulo_restauracion_patrimonio_cultural_mueble.rar", "18145856-9_solicitud_postitulo_restauracion_patrimonio_cultural_mueble.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOY = new ArchivoSolicitudDTO(1231, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/11/19-Hora/Sonia Muñoz_Diplomado Gestión Cultural Pto Montt 2019.rar", "Sonia Muñoz_Diplomado Gestión Cultural Pto Montt 2019.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOZ = new ArchivoSolicitudDTO(1232, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/11/19-Hora/Diplomado 2019 Cristina Vicentela.rar", "Diplomado 2019 Cristina Vicentela.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAA = new ArchivoSolicitudDTO(1233, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/11/19-Hora/Diplomado 2019 Cristina Vicentela.rar", "Diplomado 2019 Cristina Vicentela.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAB = new ArchivoSolicitudDTO(1234, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/11/22-Hora/abraham_padilla_solicitud_postulacion_magister_musicologia.zip", "abraham_padilla_solicitud_postulacion_magister_musicologia.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAC = new ArchivoSolicitudDTO(1235, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/12/4-Hora/AnaM Moraga 151577318 Mg Teoría e Historia del Arte.zip", "AnaM Moraga 151577318 Mg Teoría e Historia del Arte.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAD = new ArchivoSolicitudDTO(1236, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/12/16-Hora/Magi?ster en Artes, Artes Visuales, Universidad de Chile.zip", "Magi?ster en Artes, Artes Visuales, Universidad de Chile.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAE = new ArchivoSolicitudDTO(1237, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/12/20-Hora/Rosa_Blanco_solicitud_postulacion_Magister_composición musical.rar", "Rosa_Blanco_solicitud_postulacion_Magister_composición musical.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAF = new ArchivoSolicitudDTO(1238, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/12/22-Hora/Zipp.rar", "Zipp.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAG = new ArchivoSolicitudDTO(1239, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/12/23-Hora/pamela_arrieta_solicitud_postulacion_postitulo_restauración_patrimonio_cultural_mueble.zip", "pamela_arrieta_solicitud_postulacion_postitulo_restauración_patrimonio_cultural_mueble.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAH = new ArchivoSolicitudDTO(1240, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/2-Hora/DOC GA 12320953-2.rar", "DOC GA 12320953-2.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAI = new ArchivoSolicitudDTO(1241, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/13/3-Hora/Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAJ = new ArchivoSolicitudDTO(1242, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/13/3-Hora/Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAK = new ArchivoSolicitudDTO(1243, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/13/3-Hora/Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "Formulario Inscripción Tesis Danilo Campos-3.pdf.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAL = new ArchivoSolicitudDTO(1244, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/13/5-Hora/Formulario inscripción de tesis Elvis Polando.zip", "Formulario inscripción de tesis Elvis Polando.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAM = new ArchivoSolicitudDTO(1245, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/14-Hora/IDC - Reglas.zip", "IDC - Reglas.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAN = new ArchivoSolicitudDTO(1246, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/16-Hora/drive-download-20181213T160850Z-001.zip", "drive-download-20181213T160850Z-001.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAO = new ArchivoSolicitudDTO(1247, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/16-Hora/Viviana_Arango_Postulacion_magister_gestion_cultural.zip", "Viviana_Arango_Postulacion_magister_gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAP = new ArchivoSolicitudDTO(1248, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/16-Hora/pizarro_mariajose_postulacion_.diplomado_artesonoro.zip", "pizarro_mariajose_postulacion_.diplomado_artesonoro.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAQ = new ArchivoSolicitudDTO(1249, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/13/18-Hora/Carolina Schwerter_RepostulacionMGC.rar", "Carolina Schwerter_RepostulacionMGC.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAR = new ArchivoSolicitudDTO(1250, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/1-Hora/DOC GA 12320953-2.rar", "DOC GA 12320953-2.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAS = new ArchivoSolicitudDTO(1251, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/4-Hora/17.631.230-0_solicitud-postulacion_Diplomado_de_desarrollo_profesional_virtual_en_Gestion_cultural.rar", "17.631.230-0_solicitud-postulacion_Diplomado_de_desarrollo_profesional_virtual_en_Gestion_cultural.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAT = new ArchivoSolicitudDTO(1252, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/14-Hora/17.631.230-0_solicitud-postulacion_Diplomado_de_desarrollo_profesional_virtual_en_Gestion_cultural.zip", "17.631.230-0_solicitud-postulacion_Diplomado_de_desarrollo_profesional_virtual_en_Gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAV = new ArchivoSolicitudDTO(1253, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/16-Hora/Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAW = new ArchivoSolicitudDTO(1254, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/17-Hora/Paula Carolina Lopez Diaz_solicitud_postulacion_magister_gestion_cultural.zip", "Paula Carolina Lopez Diaz_solicitud_postulacion_magister_gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAX = new ArchivoSolicitudDTO(1255, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/19-Hora/18907650-9_solicitud_postulacion_magister_artes_visuales.rar", "18907650-9_solicitud_postulacion_magister_artes_visuales.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAY = new ArchivoSolicitudDTO(1256, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/19-Hora/Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOAZ = new ArchivoSolicitudDTO(1257, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/19-Hora/18907650-9_solicitud_postulacion_magister_artes_visuales.rar", "18907650-9_solicitud_postulacion_magister_artes_visuales.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBA = new ArchivoSolicitudDTO(1258, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/21-Hora/Carolina Ibera Solicitud Postulación Arteterapia.zip", "Carolina Ibera Solicitud Postulación Arteterapia.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBB = new ArchivoSolicitudDTO(1259, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/22-Hora/Solicitud magister Claudia Toro Caberletti Teoria e Historia Arte.zip", "Solicitud magister Claudia Toro Caberletti Teoria e Historia Arte.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBC = new ArchivoSolicitudDTO(1260, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/23-Hora/Gabriela Postulacio?n 2019 U Chile.zip", "Gabriela Postulacio?n 2019 U Chile.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBD = new ArchivoSolicitudDTO(1261, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/14/23-Hora/Gabriela Alamo Repostulacio?n Magi?ster Gestio?n Cultural.zip", "Gabriela Alamo Repostulacio?n Magi?ster Gestio?n Cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBE = new ArchivoSolicitudDTO(1262, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/0-Hora/15260981-7 POSTULACION POSTITULOARTETERAPIA DELIA ANTINAO.rar", "15260981-7 POSTULACION POSTITULOARTETERAPIA DELIA ANTINAO.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBF = new ArchivoSolicitudDTO(1263, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/1-Hora/MAM Application-Jin Tsai.zip", "MAM Application-Jin Tsai.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBG = new ArchivoSolicitudDTO(1264, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/1-Hora/DOCUMENTOS_CATALINA RIVEROS ESPIÑEIRA (CRE).zip", "DOCUMENTOS_CATALINA RIVEROS ESPIÑEIRA (CRE).zip", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTOBH = new ArchivoSolicitudDTO(1265, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/1-Hora/308808995_CHIN_FONG_TSAI_solicitud_postulacion_magister_artes_mediales.zip", "308808995_CHIN_FONG_TSAI_solicitud_postulacion_magister_artes_mediales.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBI = new ArchivoSolicitudDTO(1266, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/3-Hora/CARLA_RODRIGUEZ.zip", "CARLA_RODRIGUEZ.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBJ = new ArchivoSolicitudDTO(1267, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/3-Hora/CARLA_RODRIGUEZ.zip", "CARLA_RODRIGUEZ.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBK = new ArchivoSolicitudDTO(1268, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/16-Hora/karen espinoza (15341536-6).zip", "karen espinoza (15341536-6).zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBL = new ArchivoSolicitudDTO(1269, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/17-Hora/Ivan_Castillo_solicitud_postulacion_magister_gestion_cultural.rar", "Ivan_Castillo_solicitud_postulacion_magister_gestion_cultural.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBM = new ArchivoSolicitudDTO(1270, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/18-Hora/Jose Miguel Guerra Postulacion Magister gestion Cultural.zip", "Jose Miguel Guerra Postulacion Magister gestion Cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBN = new ArchivoSolicitudDTO(1271, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/19-Hora/CARLA_RODRIGUEZ.zip", "CARLA_RODRIGUEZ.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBO = new ArchivoSolicitudDTO(1272, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/20-Hora/Carolina Gaete Fischer - Magister Teoría e Historia del Arte.rar", "Carolina Gaete Fischer - Magister Teoría e Historia del Arte.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBP = new ArchivoSolicitudDTO(1273, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/21-Hora/marcela_fernandez_solicitud_postulacion_magister_ gestion_cultural.rar", "marcela_fernandez_solicitud_postulacion_magister_ gestion_cultural.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBQ = new ArchivoSolicitudDTO(1274, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/22-Hora/Cristian_Soto_Solicitud_Postulación_Magister_Gestión_Cultural.zip", "Cristian_Soto_Solicitud_Postulación_Magister_Gestión_Cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBR = new ArchivoSolicitudDTO(1275, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/22-Hora/233790869-Cecilia Ramallo-Postulación Magíster en Artes con mención en Musicología.rar", "233790869-Cecilia Ramallo-Postulación Magíster en Artes con mención en Musicología.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBS = new ArchivoSolicitudDTO(1276, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/15/23-Hora/Tamara Contreras Landeros, Magi?ster en Artes, Artes Visuales.zip", "Tamara Contreras Landeros, Magi?ster en Artes, Artes Visuales.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBT = new ArchivoSolicitudDTO(1277, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/16/0-Hora/Nueva carpeta.rar", "Nueva carpeta.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBU = new ArchivoSolicitudDTO(1278, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/16/2-Hora/Gonzalo Cárdenas_solicitud de postulacion_Magiste en teoria e historia del arte.rar", "Gonzalo Cárdenas_solicitud de postulacion_Magiste en teoria e historia del arte.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBV = new ArchivoSolicitudDTO(1279, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/16/16-Hora/17043763-2 Solicitud inscripcion Gestion Cultural Virtual.zip", "17043763-2 Solicitud inscripcion Gestion Cultural Virtual.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBW = new ArchivoSolicitudDTO(1280, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/16/16-Hora/17043763-2_Solicitud_inscripcion_Gestion_Cultural_Virtual.zip", "17043763-2_Solicitud_inscripcion_Gestion_Cultural_Virtual.zip", "solicitudPostulacion"); 
		//	ArchivoSolicitudDTO archivoSolicitudDTOBX = new ArchivoSolicitudDTO(1281, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/17/2-Hora/natalia_escare_solicitud de admisión___Arte Terapia.zip", "natalia_escare_solicitud de admisión___Arte Terapia.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBY = new ArchivoSolicitudDTO(1282, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/17/14-Hora/IDC - Reglas.zip", "IDC - Reglas.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOBZ = new ArchivoSolicitudDTO(1283, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/17/21-Hora/Valeria Valle Magister en composicion.zip", "Valeria Valle Magister en composicion.zip", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTOCA = new ArchivoSolicitudDTO(1284, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/18/2-Hora/Postulación Magister - Gonzalo Cuadra.zip", "Postulación Magister - Gonzalo Cuadra.zip", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTOCB = new ArchivoSolicitudDTO(1285, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/18/2-Hora/17855635-5_solicitud_extensión_prórroga_AndreaUlloa_MGC.rar", "17855635-5_solicitud_extensión_prórroga_AndreaUlloa_MGC.rar", "solicitudAcademica");	
		//	ArchivoSolicitudDTO archivoSolicitudDTOCC = new ArchivoSolicitudDTO(1286, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/18/15-Hora/Gonzalo Cárdenas_solicitud de postulación_Magíster en teoría e historia del arte.zip", "Gonzalo Cárdenas_solicitud de postulación_Magíster en teoría e historiadel arte.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCD = new ArchivoSolicitudDTO(1287, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/18/15-Hora/Gonzalo Cárdenas_solicitud de postulación_Magíster en teoría e historia del arte.zip", "Gonzalo Cárdenas_solicitud de postulación_Magíster en teoría e historia del arte.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCE = new ArchivoSolicitudDTO(1288, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/19/15-Hora/Natalia Uribe_Solicitud de Pro?rroga.zip", "Natalia Uribe_Solicitud de Pro?rroga.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCF = new ArchivoSolicitudDTO(1289, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/20/1-Hora/isidora_cruz_solicitud_academica_homologacion.rar", "isidora_cruz_solicitud_academica_homologacion.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCG = new ArchivoSolicitudDTO(1290, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/21/13-Hora/CV Erika Horta.zip", "CV Erika Horta.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCH = new ArchivoSolicitudDTO(1291, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/24/2-Hora/Diego de la Fuente (2).pdf.zip", "Diego de la Fuente (2).pdf.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCI = new ArchivoSolicitudDTO(1292, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/27/12-Hora/Documentos Diplomado.zip", "Documentos Diplomado.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCJ = new ArchivoSolicitudDTO(1293, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/27/12-Hora/Damián Cueto_18.761.302-7_Gestión Cultural.zip", "Damián Cueto_18.761.302-7_Gestión Cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCK = new ArchivoSolicitudDTO(1294, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2018/12-Diciembre/28/14-Hora/Postulacio?n.rar", "Postulacio?n.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCL = new ArchivoSolicitudDTO(1295, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2018/12-Diciembre/31/18-Hora/Maria_Rebeca_Sanchez.zip", "Maria_Rebeca_Sanchez.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCM = new ArchivoSolicitudDTO(1296, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/3/0-Hora/Postulación Magister - Gonzalo Cuadra.zip", "Postulación Magister - Gonzalo Cuadra.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCN = new ArchivoSolicitudDTO(1297, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/3/3-Hora/Inscripción Tesis A Carrizo Munoz 56107924.zip", "Inscripción Tesis A Carrizo Munoz 56107924.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCO = new ArchivoSolicitudDTO(1298, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/3/15-Hora/Felipe Salinas, solicitud postulación Postítulo Composición.rar", "Felipe Salinas, solicitud postulación Postítulo Composición.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCP = new ArchivoSolicitudDTO(1299, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/3/17-Hora/Nuevo Archivo WinRAR ZIP.zip", "Nuevo Archivo WinRAR ZIP.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCR = new ArchivoSolicitudDTO(1300, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/4/15-Hora/Paula C Lopez_Solicitud_postulacion_magister_gestion_cultural.zip", "Paula C Lopez_Solicitud_postulacion_magister_gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTOCS = new ArchivoSolicitudDTO(1301, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/4/17-Hora/Felipe Salinas, solicitud postulación Postítulo Composición.rar", "Felipe Salinas, solicitud postulación Postítulo Composición.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1302, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/4/20-Hora/Felipe Salinas, solicitud postulación Postítulo Composición.zip", "Felipe Salinas, solicitud postulación Postítulo Composición.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1303, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/7/14-Hora/Miguel_Rios_Solicitud_Postulacion_Curso_Postitulo_en Composcion.rar.rar", "Miguel_Rios_Solicitud_Postulacion_Curso_Postitulo_en Composcion.rar.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1304, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/8/16-Hora/andres dinamarca solicitud postulacion diplomado virtural gestion del patrimonio cultural.rar", "andres dinamarca solicitud postulacion diplomado virtural gestion del patrimonio cultural.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1305, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/8/20-Hora/DanielaFuentes_Postulacion_CursoPostituloRestauracionDePatrimonioCulturalMueble.zip", "DanielaFuentes_Postulacion_CursoPostituloRestauracionDePatrimonioCulturalMueble.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1306, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/9/2-Hora/Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "Ariel_Cárdenas_solicitud_postulación_Magister_Interpretación_Musical.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1307, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/9/22-Hora/Ibiss Villalobos postulación arte terapia - copia.rar", "Ibiss Villalobos postulación arte terapia - copia.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1308, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/10/13-Hora/postulacion gestion cultural 2019.zip", "postulacion gestion cultural 2019.zip", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1309, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/10/16-Hora/Formulario Inscripción Tesis. S. Gaspar.pdf.zip", "Formulario Inscripción Tesis. S. Gaspar.pdf.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1310, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/15/6-Hora/henry_palacio_solicitud_postulacion_magister_artes_mencion_artes_visuales_AN931614.zip", "henry_palacio_solicitud_postulacion_magister_artes_mencion_artes_visuales_AN931614.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1311, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/15/6-Hora/henry_palacio_solicitud_postulacion_magister_artes_mencion_artes_visuales_AN931614.zip", "henry_palacio_solicitud_postulacion_magister_artes_mencion_artes_visuales_AN931614.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1312, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/16/16-Hora/Ignacio_Apablaza_solicitud_postulacion_diploma_postitulo_gestion_cultural.rar", "Ignacio_Apablaza_solicitud_postulacion_diploma_postitulo_gestion_cultural.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1313, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/16/22-Hora/12953468-0_solicitud_académica_prorroga_entrega_de_tesis.rar", "12953468-0_solicitud_académica_prorroga_entrega_de_tesis.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1314, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/17/13-Hora/marcel_becerra_ibaceta_postitulo_gestion_cultural_santiago_2019.rar", "marcel_becerra_ibaceta_postitulo_gestion_cultural_santiago_2019.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1315, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/17/19-Hora/tomas_ahumada_formulario_inscripcion_tesis.pdf.zip", "tomas_ahumada_formulario_inscripcion_tesis.pdf.zip", "solicitudAcademica");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1316, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/17/20-Hora/Formulario inscripcion tesis.zip", "Formulario inscripcion tesis.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1317, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/17/21-Hora/irma_sepu?lveda_solicitud_postulacion_ Magister_en_Artes, mencio?n_Artes Visuales.zip", "irma_sepu?lveda_solicitud_postulacion_ Magister_en_Artes, mencio?n_Artes Visuales.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1318, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/17/22-Hora/Formulario_Inscripci195179n_Tesis_P.Reynaldos.rar", "Formulario_Inscripci195179n_Tesis_P.Reynaldos.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1319, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/18/13-Hora/12953468-0_solicitud_académica_prórroga.rar", "12953468-0_solicitud_académica_prórroga.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1320, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/18/13-Hora/12953468-0_solicitud_académica_prórroga.rar", "12953468-0_solicitud_académica_prórroga.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1321, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/18/19-Hora/12953468-0_solicitud_académica_prórroga.rar", "12953468-0_solicitud_académica_prórroga.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1322, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/18/19-Hora/12953468-0_solicitud_académica_prórroga.rar", "12953468-0_solicitud_académica_prórroga.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1323, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/21/1-Hora/Mun?oz Documentos Obligatorios.zip", "Mun?oz Documentos Obligatorios.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1324, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/21/2-Hora/jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1325, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/21/13-Hora/jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1326, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/21/13-Hora/jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "jhonny_seghabi_solicitud_postulacion_postitulo_composicion_musical.zip", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1327, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/21/22-Hora/Formulario Inscripción Tesis. G. Pérez.zip", "Formulario Inscripción Tesis. G. Pérez.zip", "solicitudAcademica");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1328, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/22/3-Hora/Documentos Chile.zip", "Documentos Chile.zip", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1329, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/23/15-Hora/claudiaaranda_postulacion_diplomagestionpatrimonio.rar", "claudiaaranda_postulacion_diplomagestionpatrimonio.rar", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1330, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/23/19-Hora/pablo_talhouk_solicitud_postulacion_magister_artes_visuales.zip", "pablo_talhouk_solicitud_postulacion_magister_artes_visuales.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1331, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/24/14-Hora/REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1332, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/24/14-Hora/REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1333, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/24/15-Hora/REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "REPOSTULACIÓN XIMENA GUZMÁN MGC 2019 ZIP.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1334, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/24/15-Hora/karen_castel_solicitud_postulacion_curso_especializacion_restauracion_patrimonio_cultural_mueble.rar", "karen_castel_solicitud_postulacion_curso_especializacion_restauracion_patrimonio_cultural_mueble.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1335, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/24/22-Hora/karen_castel_solicitud_postulacion_curso_especializacion_restauracion_patrimonio_cultural_mueble.zip", "karen_castel_solicitud_postulacion_curso_especializacion_restauracion_patrimonio_cultural_mueble.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1336, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/25/7-Hora/daniela_portillo_solicitud_academica_prorroga_entrega_tesis.zip", "daniela_portillo_solicitud_academica_prorroga_entrega_tesis.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1337, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/26/16-Hora/BELEM GALAZ-MAGISTER EN GESTIÓN CULTURAL-2019.zip", "BELEM GALAZ-MAGISTER EN GESTIÓN CULTURAL-2019.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1338, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/27/4-Hora/carolina (1).rar", "carolina (1).rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1339, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/27/21-Hora/sandra_alegria_solicitud_postulacion_postitulo_arteterapia.zip", "sandra_alegria_solicitud_postulacion_postitulo_arteterapia.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1340, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/1-Hora/VALENTINA_VIDAL_SALAZAR_SOLICITUD_POSTITULO_GESTION_CULTURAL.rar", "VALENTINA_VIDAL_SALAZAR_SOLICITUD_POSTITULO_GESTION_CULTURAL.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1341, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/15-Hora/Roberto_Dan?obeitia_postulacion_diplomado_gestion_cultural.zip", "Roberto_Dan?obeitia_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1342, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/18-Hora/Lorenzo_Cornejo_solicitud_postulacion_Magister_en_Artes_mención_Musicología.rar", "Lorenzo_Cornejo_solicitud_postulacion_Magister_en_Artes_mención_Musicología.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1343, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/18-Hora/katerine_saldias_postulacion_postitulo_virtual_gestion_patrimonio_cultural.rar", "katerine_saldias_postulacion_postitulo_virtual_gestion_patrimonio_cultural.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1344, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/19-Hora/Jessica Quezada Nuñez. Rut.10.299.785-9. Postulación Magister Interpretación musical en Dirección Coral.zip", "Jessica Quezada Nuñez. Rut.10.299.785-9. Postulación Magister Interpretación musical en Dirección Coral.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1345, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/28/19-Hora/Aline Suarez Palma. Postulación Diplomado de Gestión Cultural Virtual. Rut 16.196.422-0.zip", "Aline Suarez Palma. Postulación Diplomado de Gestión Cultural Virtual. Rut 16.196.422-0.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1346, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/29/15-Hora/Formulario inscripción de Tesis C. Hidalgo.pdf.zip", "Formulario inscripción de Tesis C. Hidalgo.pdf.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1347, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/29/15-Hora/Formulario inscripción de Tesis C. Hidalgo.pdf.zip", "Formulario inscripción de Tesis C. Hidalgo.pdf.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1348, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/29/17-Hora/carmen_aramburu-solicitud_postulacion_diploma postitulo_gestion_patrimonio_cultural.zip", "carmen_aramburu-solicitud_postulacion_diploma postitulo_gestion_patrimonio_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1349, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/29/18-Hora/Lorenzo_Cornejo_solicitud_postulacion_Magister_Musicologia.rar", "Lorenzo_Cornejo_solicitud_postulacion_Magister_Musicologia.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1350, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/29/18-Hora/katerine_saldias_postulacion_postitulo_virtual_gestion_patrimonio_cultural.rar", "katerine_saldias_postulacion_postitulo_virtual_gestion_patrimonio_cultural.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1351, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/0-Hora/Daniel_varas_solicitud_postulacion_postitulo en Restauracion.rar.rar", "Daniel_varas_solicitud_postulacion_postitulo en Restauracion.rar.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1352, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/0-Hora/Trinidad_ Yarad_solicitud_arteterapia alias.zip", "Trinidad_ Yarad_solicitud_arteterapia alias.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1353, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/18-Hora/Archivos Trini.rar", "Archivos Trini.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1354, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/18-Hora/Trinidad_Yarad_solicitud_postulación_postítulo_arteterapia.rar", "Trinidad_Yarad_solicitud_postulación_postítulo_arteterapia.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1355, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/18-Hora/AnaAraya.17702203-9.PostulaciónDiplomadoVirtualGestiónPatrimonioCultural..zip", "AnaAraya.17702203-9.PostulaciónDiplomadoVirtualGestiónPatrimonioCultural..zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1356, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/19-Hora/Nuevo Archivo WinRAR ZIP.zip", "Nuevo Archivo WinRAR ZIP.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1357, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/22-Hora/Carta de Recomendación Prof. María de los angeles.rar", "Carta de Recomendación Prof. María de los angeles.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1358, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/22-Hora/Postulación_magister_astesvisuales_sebastiánDuarte_rut18.731.086-5.rar", "Postulación_magister_astesvisuales_sebastiánDuarte_rut18.731.086-5.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1359, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/22-Hora/VirginiaAcosta_solicitud_postulacion_magister_artesvisuales.zip", "VirginiaAcosta_solicitud_postulacion_magister_artesvisuales.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1360, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/1-Enero/30/23-Hora/Antonio_Urrutia_Luxoro_solicitud_postulación_Magíster_Teoría_e_Historia_del_Arte.rar", "Antonio_Urrutia_Luxoro_solicitud_postulación_Magíster_Teoría_e_Historia_del_Arte.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1361, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/31/16-Hora/Magíster, Sebastián Mahaluf.rar", "Magíster, Sebastián Mahaluf.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1362, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/31/16-Hora/13.505.509-0 solocitud academica rendicion examen.rar", "13.505.509-0 solocitud academica rendicion examen.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1363, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/2-Febrero/28/14-Hora/Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1364, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/2-Febrero/28/15-Hora/Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1365, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/4/0-Hora/Felipe_contreras_solicitud_academica_prorroga_tesis.rar", "Felipe_contreras_solicitud_academica_prorroga_tesis.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1366, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/4/0-Hora/Felipe_contreras_solicitud_academica_prorroga_tesis.rar", "Felipe_contreras_solicitud_academica_prorroga_tesis.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1367, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/4/12-Hora/Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1368, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/4/12-Hora/Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1369, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/4/12-Hora/Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "Maria_Cisterna_Solicitud_postulacion_diplomado_gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1370, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/4/17-Hora/Magister de Artes Visuales Paula Izquierdo.zip", "Magister de Artes Visuales Paula Izquierdo.zip", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1371, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/5/1-Hora/Cecilia_Sandoval_solicitud_postulacion_Curso de Especialización de Postítulo en Restauración del Patrimonio Cultural Muebl.rar", "Cecilia_Sandoval_solicitud_postulacion_Curso de Especialización de Postítulo en Restauración del Patrimonio Cultural Muebl.rar", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1372, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/5/13-Hora/Archivo.zip", "Archivo.zip", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1373, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/5/20-Hora/zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "solicitudAcademica");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1374, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/5/20-Hora/sebastian_mahaluf_solicitus_academica.zip", "sebastian_mahaluf_solicitus_academica.zip", "solicitudAcademica");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1375, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/5/20-Hora/consorcio-soap-portlet.zip", "consorcio-soap-portlet.zip", "solicitudAcademica");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1376, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/1-Enero/31/16-Hora/Magíster, Sebastián Mahaluf.rar", "Magíster, Sebastián Mahaluf.rar", "solicitudAcademica");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1377, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/5/21-Hora/daniela_canto_solicitud_postulacion_extension_virtual_diplomado_gestion_cultural.rar", "daniela_canto_solicitud_postulacion_extension_virtual_diplomado_gestion_cultural.rar", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1378, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/5/20-Hora/zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "solicitudAcademica");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1379, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/6/15-Hora/Archivo comprimido.zip", "Archivo comprimido.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1380, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/6/19-Hora/Eduardo_Flores_Prorroga_entrega_de_tesis_2019.zip", "Eduardo_Flores_Prorroga_entrega_de_tesis_2019.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1381, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/6/19-Hora/Eduardo_Flores_Prorroga_entrega_de_tesis_2019.zip", "Eduardo_Flores_Prorroga_entrega_de_tesis_2019.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1382, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/7/15-Hora/consorcio-soap-portlet.zip", "consorcio-soap-portlet.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1383, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/7/18-Hora/Araceli_Rodríguez_Prorroga_entrega_de_tesis_2019.rar", "Araceli_Rodríguez_Prorroga_entrega_de_tesis_2019.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1384, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/9/23-Hora/Paulina Aguayo Solicitud Postulacion Especialidad Arte Terapia.zip", "Paulina Aguayo Solicitud Postulacion Especialidad Arte Terapia.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1385, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/10/18-Hora/dominique_manghi_solicitud_postulacion_postitulo_virtual_gestion_patrimonio_cultural.zip", "dominique_manghi_solicitud_postulacion_postitulo_virtual_gestion_patrimonio_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1386, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/12/15-Hora/juan diaz solicitud postulacion diploma de postitulo en arte sonoro.rar", "juan diaz solicitud postulacion diploma de postitulo en arte sonoro.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1387, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/5/20-Hora/zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "zip REPOSTULACIÓN XIMENA GUZMÁN MGC 2019.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1388, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/20-Hora/Documentos Julio Chávez.zip", "Documentos Julio Chávez.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1389, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/20-Hora/julio_chávez_solicitud_postulación_magister_artes_visuales.zip.zip", "julio_chávez_solicitud_postulación_magister_artes_visuales.zip.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1390, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/20-Hora/DanielaQuelin.rar", "DanielaQuelin.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1391, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/22-Hora/raimundo_rosas_solicitud_postulacion_postitulo_arteterapia.zip", "raimundo_rosas_solicitud_postulacion_postitulo_arteterapia.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1392, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/22-Hora/9898298-1_solicitud_postulacion_postitulo_arteterapia.zip", "9898298-1_solicitud_postulacion_postitulo_arteterapia.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1393, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/22-Hora/DANIEL_QUELIN_solicitud_postulacion_magister_gestion_cultural.rar.rar", "DANIEL_QUELIN_solicitud_postulacion_magister_gestion_cultural.rar.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1394, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/14/22-Hora/DANIEL_QUELIN_solicitud_postulacion_magister_gestion_cultural.rar", "DANIEL_QUELIN_solicitud_postulacion_magister_gestion_cultural.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1395, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/15-Hora/rebeca_gutierrez_solicitud_postulacion_magister_gestion_cultural.zip", "rebeca_gutierrez_solicitud_postulacion_magister_gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1396, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/16-Hora/TANIA_CALDERON_LEIVA_POSTULACION_MAGISTER_ARTES_MENCION_ARTES_PLASTICAS.zip", "TANIA_CALDERON_LEIVA_POSTULACION_MAGISTER_ARTES_MENCION_ARTES_PLASTICAS.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1397, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/17-Hora/Pablo Rojas postulacion magister gestion cultural.zip", "Pablo Rojas postulacion magister gestion cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1398, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/17-Hora/16509388_7_solicitud_magister_artes_mediales.zip", "16509388_7_solicitud_magister_artes_mediales.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1399, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/17-Hora/16509388_7_solicitud_magister_artes_mediales.zip", "16509388_7_solicitud_magister_artes_mediales.zip", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1400, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/19-Hora/George_Lee_V_solicitud_postulacion_magistes_artes_visuales.zip", "George_Lee_V_solicitud_postulacion_magistes_artes_visuales.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1401, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/15/19-Hora/CV Lorenzo Segovia_post restauracion 2019.zip", "CV Lorenzo Segovia_post restauracion 2019.zip", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1402, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/15/20-Hora/Resultados postulacio?n MGC 2015.zip", "Resultados postulacio?n MGC 2015.zip", "solicitudAcademica");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1403, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/15/20-Hora/rebeca_gutierrez_solicitud_REpostulacion_magister_gestion_cultural.zip", "rebeca_gutierrez_solicitud_REpostulacion_magister_gestion_cultural.zip", "solicitudAcademica");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1404, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/16/2-Hora/lorenzo segovia post restau.rar", "lorenzo segovia post restau.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1405, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/16/3-Hora/lorenzo segovia post restau.rar", "lorenzo segovia post restau.rar", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1406, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/18/0-Hora/17552329-4_solicitud_postulacion_magister_gestion_cultural.rar.rar", "17552329-4_solicitud_postulacion_magister_gestion_cultural.rar.rar", "solicitudPostulacion");	
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1407, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/12-Hora/Solicitud ORTEGA SÁENZ.zip", "Solicitud ORTEGA SÁENZ.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1408, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/12-Hora/ORTEGA SÁENZ_ Solicitud_ reincorporación-doctorado.zip", "ORTEGA SÁENZ_ Solicitud_ reincorporación-doctorado.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1409, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/13-Hora/Zipp.rar", "Zipp.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1410, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/13-Hora/Aguayo Gloria Magister Gestión Cultural.rar", "Aguayo Gloria Magister Gestión Cultural.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1411, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/13-Hora/Alejandra Jiménez Castro.rar", "Alejandra Jiménez Castro.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1412, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/13-Hora/Alejandra Jiménez Castro.rar", "Alejandra Jiménez Castro.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1413, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/15-Hora/documentos prorroga tesis.zip", "documentos prorroga tesis.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1414, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/18/16-Hora/Alejandra Jiménez Castro.rar", "Alejandra Jiménez Castro.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1415, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/18/18-Hora/17552329-4_solicitud_postulacion_magister_gestion_cultural.zip", "17552329-4_solicitud_postulacion_magister_gestion_cultural.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1416, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/19/4-Hora/Solicitud prórroga Tesis HPeralta.rar", "Solicitud prórroga Tesis HPeralta.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1417, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/19/4-Hora/Solicitud prórroga Tesis HPeralta.rar", "Solicitud prórroga Tesis HPeralta.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1418, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/19/20-Hora/Solicitud prórroga Tesis HPeralta.rar", "Solicitud prórroga Tesis HPeralta.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1419, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/20/15-Hora/Postulacion Ximena Guzman Magister en Gestion Cultural zip.zip", "Postulacion Ximena Guzman Magister en Gestion Cultural zip.zip", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1420, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/20/17-Hora/ConsorcioSoapPortlet_pr.zip", "ConsorcioSoapPortlet_pr.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1421, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/20/19-Hora/Postulación Julio Barrios Magister.rar", "Postulación Julio Barrios Magister.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1422, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/21/0-Hora/Documentos_Manuel_Alvarado_Cornejo.rar", "Documentos_Manuel_Alvarado_Cornejo.rar", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1423, "/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/21/14-Hora/14.385.735-2_postulación postítulo.rar", "14.385.735-2_postulación postítulo.rar", "solicitudPostulacion");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1424, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/22/19-Hora/Paula_Lopez_solicitud_academica_determinar modalidad de solicitud.zip", "Paula_Lopez_solicitud_academica_determinar modalidad de solicitud.zip", "solicitudAcademica");
		//	ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO(1425, "/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/24/4-Hora/solcitud prorroga tesis PDominguez.zip", "solcitud prorroga tesis PDominguez.zip", "solicitudAcademica");
		

//		'1426', '/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/25/21-Hora/Natalia Uribe_Solicitud de Pro?rroga.zip', 'Natalia Uribe_Solicitud de Pro?rroga.zip', 'solicitudAcademica'
//		'1427', '/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/26/2-Hora/REINHARDT-SCHULZ-POSTULACION-MAGISTER-ARTES-MEDIALES.zip', 'REINHARDT-SCHULZ-POSTULACION-MAGISTER-ARTES-MEDIALES.zip', 'solicitudPostulacion'
//		'1428', '/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/26/14-Hora/06784594_3 Carta MGC posterga fecha TESIS LWeinstein.pdf.zip', '06784594_3 Carta MGC posterga fecha TESIS LWeinstein.pdf.zip', 'solicitudAcademica'
//		'1429', '/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/26/16-Hora/modificaciones.zip', 'modificaciones.zip', 'solicitudPostulacion'
//		'1431', '/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/27/14-Hora/Cristóbal De Ferrari Certificado Médico Reincorporación.rar', 'Cristóbal De Ferrari Certificado Médico Reincorporación.rar', 'solicitudAcademica'
//		'1432', '/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/27/15-Hora/Ricardo Mandujano Madariaga. Solicitud renuncia 2019.rar', 'Ricardo Mandujano Madariaga. Solicitud renuncia 2019.rar', 'solicitudAcademica'
//		'1433', '/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/27/16-Hora/felipe kong solicitud capítulo tesis.zip', 'felipe kong solicitud capítulo tesis.zip', 'solicitudAcademica'
//		'1434', '/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/3-Marzo/28/16-Hora/maite_flores_solicitud_postulacion_postitulo_arte_sonoro.zip', 'maite_flores_solicitud_postulacion_postitulo_arte_sonoro.zip', 'solicitudPostulacion'
//		'1435', '/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/28/23-Hora/Nadya Ramírez solicitud de prórroga tesis.rar', 'Nadya Ramírez solicitud de prórroga tesis.rar', 'solicitudAcademica'
//		'1436', '/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/29/11-Hora/Solicitud de Pro?rroga Jose? Gil.zip', 'Solicitud de Pro?rroga Jose? Gil.zip', 'solicitudAcademica'
//		'1437', '/opt/apache-tomcat-8.5.20/temp/solicitudesAcademicas/2019/3-Marzo/29/11-Hora/Solicitud de Pro?rroga Jose? Gil.zip', 'Solicitud de Pro?rroga Jose? Gil.zip', 'solicitudAcademica'
//		'1438', '/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/4-Abril/2/20-Hora/oscar_teare_solicitud_postulacion_diplomado_posti?tulo_arte_sonoro.zip', 'oscar_teare_solicitud_postulacion_diplomado_posti?tulo_arte_sonoro.zip', 'solicitudPostulacion'
//		'1439', '/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/4-Abril/3/13-Hora/oscar_teare_solicitud_postulacion_diplomado_posti?tulo_arte_sonoro.zip', 'oscar_teare_solicitud_postulacion_diplomado_posti?tulo_arte_sonoro.zip', 'solicitudPostulacion'
//		'1440', '/opt/apache-tomcat-8.5.20/temp/solicitudesPostulaciones/2019/4-Abril/3/17-Hora/Postulación Diplomado GC.rar', 'Postulación Diplomado GC.rar', 'solicitudPostulacion'

		
		System.out.println("archivo[j]:"+i);

		for(int j=0; j< arreglo.length; j++){

			if(arreglo[j]!=null && arreglo[j].getIdArchivoSolicitud()>0){
				try{
					factoryServicioDAO.getArchivoSolicitudServicio().crearArchivoSolicitudDTO(arreglo[j]);
				}catch(Exception e){
					System.out.println("rechazo["+j+"] ->"+arreglo[j].getIdArchivoSolicitud());
					e.printStackTrace();
				}
			}


		}



	}

	public void crearSolicitudCertificadoTest(){

		SolicitudCertificadoDTO[] arreglo = new SolicitudCertificadoDTO[1000]; 

		int i=0;

		arreglo[i] = new SolicitudCertificadoDTO(898, "2018", "Gómez", "Pacheco", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-02 18:32:48"), "jhpachecog@unal.edu.co", "Jorge Hernando", "25.583.127-5", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(899, "2015", "Contreras", "Contreras", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-03 15:26:18"), "daniella.contreras@gmail.com", "Marlene Daniella", "15.459.848-0", 9, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(900, "2015", "Contreras", "Contreras", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-03 15:26:19"), "daniella.contreras@gmail.com", "Marlene Daniella", "15.459.848-0", 9, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(901, "2016", "Sahurie", "Rojas", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-04 13:39:14"), "pablo.rojas.s@ug.uchile.cl", "Pablo Marcelo", "18167538-1", 9, 5, 11); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(902, "2016", "Pinto", "Navarro", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-05 15:58:11"), "vitorionav73@gmail.com", "Victor", "8.337.353-9", 9, 5, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(903, "2018", "Leòn", "Parga", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-06 19:02:25"), "venusenelparaiso@gmail.com", "Angela", "13682630-1", 7, 1, 6); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(904, "2018", "Leòn", "Parga", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-06 19:03:52"), "venusenelparaiso@gmail.com", "Angela", "13682630-1", 7, 1, 10); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(905, "2015", "Romero", "López", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-10 12:21:46"), "berenicelopezromero@gmail.com", "Berenice", "23897110-1", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(906, "2015", "Romero", "López", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-10 12:24:44"), "berenicelopezromero@gmail.com", "Berenice", "23897110-1", 7, 1, 10); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(907, "2015", "Romero", "López", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-10 12:27:05"), "berenicelopezromero@gmail.com", "Berenice", "23897110-1", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(908, "2015", "Romero", "López", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-10 12:30:03"), "berenicelopezromero@gmail.com", "Berenice", "23897110-1", 7, 1, 7); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(909, "2016", "Flores", "Ramírez ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-11 12:31:24"), "lorenaramirezf@gmail.com", "Lorena Margarita", "15.430.560-2", 7, 7, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(910, "2015", "Styles", "Herrera", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-11 14:43:01"), "patyhest@gmail.com", "Patricia Elena", "102487621", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(911, "2015", "Styles", "Herrera", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-11 14:57:47"), "patyhest@gmail.com", "Patricia Elena", "10.248.762-1", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(912, "2011", "aguilera", "luna", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-11 15:30:04"), "camilaluna6@gmail.com", "camila", "18474455-4", 7, 29, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(913, "2013", "González", "Catalán", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-12 18:34:24"), "rcatalang@gmail.com", "Ricardo Cristian", "14121095-5", 3, 7, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(914, "2013", "González", "Catalán", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-12 18:34:25"), "rcatalang@gmail.com", "Ricardo Cristian", "14121095-5", 3, 7, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(915, "2018", "Flores", "Portillo", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-12 20:12:19"), "rebecapflores@gmail.com", "Rebeca", "261978059", 5, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(916, "2015", "Germain", "Gómez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-13 12:50:03"), "franciscagomezge@gmail.com", "Francisca", "155011556", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(917, "2015", "Germain", "Gómez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-13 12:54:13"), "franciscagomezge@gmail.com", "Francisca", "155011556", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(919, "2008", "martinez", "acevedo", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-13 18:52:46"), "y.acevedo.martinez@gmail.com", "yahanara", "172392466", 9, 29, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(920, "2017", "Pastrana", "Cruchett", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 13:43:46"), "paulina.cruchett@gmail.com", "Paulina ", "16575894-3", 9, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(921, "2018", "Bolivar", "Gutierrez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 16:35:42"), "dgutierrezb@gmail.com", "Diana Paola", "23684872-8", 3, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(922, "2015", "TRONCOSO", "ALBORNOZ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 18:54:21"), "ALEJAALBORNOZ@GMAIL.COM", "ELIANA ALEJANDRA", "10822567-K", 9, 22, 2); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(923, "2015", "Cornejo", "Eulefi", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-17 18:45:47"), "ani.eulefi@gmail.com", "Anaí", "177067075", 1, 13, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(924, "2015", "Cornejo", "Eulefi", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-17 18:48:24"), "ani.eulefi@gmail.com", "Anaí", "177067075", 1, 13, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(925, "2015", "García", "Pessis", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-18 15:26:20"), "bpessis@uc.cl", "Begoña", "17270080-2", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(926, "2016", "González", "Saavedra", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-18 18:37:59"), "lorerey@gmail.com", "María Lorena", "14138346-9", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(927, "2016", "González", "Saavedra", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-18 18:42:31"), "lorerey@gmail.com", "María Lorena", "14138346-9", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(928, "2018", "Aguilera", "Slachevsky", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-20 12:31:27"), "esteli.sa@gmail.com", "Estelí ", "16356389-4", 9, 6, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(929, "2018", "Aguilera", "Slachevsky", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-20 12:31:28"), "esteli.sa@gmail.com", "Estelí ", "16356389-4", 9, 6, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(930, "2015", "Cornejo", "Eulefi", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-20 16:08:05"), "ani.eulefi@gmail.com", "Anaí", "177067075", 1, 13, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(931, "2009", "Orrego", "Rey", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-20 19:18:05"), "luciareyo@gmail.com", "Lucía", "14632362-6", 6, 6, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(932, "2015", "Eluchans", "Caruso", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-21 19:01:21"), "giocarel@gmail.com", "Giovanna", "142437406", 9, 3, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(933, "2015", "Eluchans", "Caruso", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-21 19:03:30"), "giocarel@gmail.com", "Giovanna", "142437406", 9, 3, 10); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(934, "2017", " baeza", "baeza", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-26 13:55:33"), "franciscocancinobaeza@gmail.com", "francisco javier", "12720198-6", 7, 1, 7); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(935, "2018", "González", "Cápona", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-26 15:38:12"), "dcapona@gmail.com", "Daniela", "17355326-9", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(936, "2018", "González", "Cápona", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-26 15:41:58"), "dcapona@gmail.com", "Daniela", "17355326-9", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(937, "2017", "Urriola", "Espinosa", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-27 13:47:15"), "cristobalespinosa@ug.uchile.cl", "Cristóbal", "17.085.094-7", 9, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(938, "2004", "Soto", "Cottet", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-27 16:04:42"), "pcottet@yahoo.com", "Pablo Antonio", "9991110-7", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(939, "2011", "Leiva", "Lorca", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-27 16:46:22"), "jrglorca@gmail.com", "Jorge", "12.685.532.K", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(940, "2018", "Vial", "Larrain", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-28 18:25:44"), "dlarrainv@gmail.com", "Daniel Agustin de los Dolores", "15.325.729-9", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(941, "2018", "Vial", "Larrain", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-28 18:26:48"), "dlarrainv@gmail.com", "Daniel Agustin de los Dolores", "15.325.729-9", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(942, "2018", "Beltrán", "Arriagada", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-28 19:21:28"), "leoarriagada@outlook.com", "Leonardo", "16531708-4", 9, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(943, "2018", "Beltrán", "Arriagada", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-28 19:44:46"), "leoarriagada@outlook.com", "Leonardo", "16531708-4", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(944, "2018", "Beltrán", "Arriagada", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-28 19:46:41"), "leoarriagada@outlook.com", "Leonardo", "16531708-4", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(945, "2017", " baeza", "cancino", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-29 01:05:04"), "franciscocancinobaeza@gmail.com", "francisco javier", "12720198-6", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(946, "2015", "Cruz", "Cubides", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-30 11:40:20"), "aemia@hotmail.com", "Ana Milena ", "23.158.462-5", 4, 7, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(947, "2007 creo", "Gleisner", "Parra", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-02 18:06:57"), "arteparrita@gmail.com", "Carolina", "126298250", 5, 13, 5); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(948, "2010", "Jerez", "Henriquez ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-02 19:31:13"), "sintetizadorhenriquez@gmail.com", "Gabriel Alejandro ", "13440719-0", 9, 10, 2); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(949, "2018", "Sepúlveda", "Simpson", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-03 12:41:04"), "simpson.eduardo@gmail.com", "Eduardo Alberto", "16814392-3", 7, 1, 6); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(950, "2018", "Sepúlveda", "Simpson", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-03 13:15:12"), "simpson.eduardo@gmail.com", "Eduardo Alberto", "16814392-3", 7, 1, 7); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(951, "2018", "Sepúlveda", "Simpson", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-03 13:16:10"), "simpson.eduardo@gmail.com", "Eduardo Alberto", "16.814.392-3", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(952, "2018", "Sepúlveda", "Simpson", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-03 13:17:14"), "simpson.eduardo@gmail.com", "Eduardo Alberto", "16814392-3", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(953, "2017", "Reyes", "Arévalo", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-03 13:46:08"), "sofiarevalo9@gmail.com", "Sofía ", "16399383k", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(954, "2017", "Reyes", "Arévalo", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-03 13:48:13"), "sofiarevalo9@gmail.com", "Sofía", "16399383k", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(955, "2016", "Sepúlveda", "Navarrete", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-03 17:39:31"), "bnavarretesep@gmail.com", "Beatriz", "10365081-K", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(956, "2015", "Aldridge", "Valenzuela", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-07 14:36:50"), "aovalenz@gmail.com", "Alejandro ", "16.095.229-6", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(957, "2015", "Aldridge", "Valenzuela", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-07 14:37:44"), "aovalenz@gmail.com", "Alejandro", "16.095.229-6", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(958, "2015", "Maturana", "Escudero", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-07 15:22:34"), "mariajose.escudero@gmail.com", "María José ", "16.355.100-4", 9, 7, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(959, "2015", "Maturana", "Escudero", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-07 15:23:44"), "mariajose.escudero@gmail.com", "María José", "163551004", 9, 7, 2); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(960, "2015", "Opazo", "Solís ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-07 21:46:45"), "josesolisopazo@gmail.com", "José Domingo", "11862306-1", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(961, "2017", "Parraguez", "Hernández", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-09 01:59:17"), "martasimil@gmail.com", "Marta Cecilia", "14.145.449-8", 7, 1, 6); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(962, "2009", "Sagredo", "Arros", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-09 19:48:51"), "juan.arros@gmail.com", "Juan Alberto", "6647065-2", 9, 29, 11); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(963, "2015", "rojas", "moya", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-09 22:55:54"), "paloma.moya@gmail.com", "paloma", "175994130", 5, 13, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(964, "2015", "Fernández", "Insunza", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-10 15:51:20"), "ivan.insunza@gmail.com", "Iván", "157484052", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(965, "2015", "Fernández", "Insunza", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-10 15:52:19"), "ivan.insunza@gmail.com", "Iván", "157484052", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(966, "2016", "Sepúlveda", "Navarrete", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-10 18:18:53"), "bnavarretesep@gmail.com", "Beatriz", "10365081-K", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(967, "2015", "Opazo", "Solís", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-10 18:31:27"), "josesolisopazo@gmail.com", "José Domingo", "11.862.306-1", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(968, "2018", "Bozzo", "Berrios ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-10 23:16:33"), "Danzatarapaca@gmail.com", "Daniela Alejandra ", "109995347", 9, 20, 2); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(969, "2015", "Contreras", "Contreras", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-11 00:40:55"), "daniella.contreras@gmail.com", "Marlene Daniella", "15.459.848-0", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(970, "2018", "Bascuñan", "Goffard", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-11 14:20:58"), "ngoffardster@gmail.com", "Nathalie", "12720651-1", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(971, "2018", "Bascuñan", "Goffard", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-11 14:22:57"), "ngoffardster@gmail.com", "Nathalie", "12720651-1", 7, 1, 7); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(972, "2016", "Maurer", "Glavic", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-11 14:36:42"), "karenglavic@gmail.com", "Karen", "160067039", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(973, "2012", "Traverso", "Cori", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-11 14:56:46"), "rcori@uchile.cl", "Rolando", "6.009.229-K", 7, 1, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(974, "2018", "Páez ", "González ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-11 15:55:49"), "nestored1974@gmail.com", "Néstor Eduardo", "12.678.961-0", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(975, "2018", "Páez ", "González ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-11 15:57:34"), "nestored1974@gmail.com", "Néstor Eduardo ", "12.678.961-0", 7, 1, 6); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(976, "2018", "Páez ", "González ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-11 16:02:02"), "nestored1974@gmail.com", "Néstor Eduardo ", "12.678.961-0", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(977, "2018", "Páez ", "González ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-11 16:08:09"), "nestored1974@gmail.com", "Néstor Eduardo ", "12.678.961-0", 7, 1, 7); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(978, "2015", "Castro", "Sanchez ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-13 19:24:51"), "rebeca.sanchez.castro@gmail.com", "Maria Rebeca ", "16092627-9", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(979, "2015", "Castro", "Sanchez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-13 19:31:07"), "rebeca.sanchez.castro@gmail.com", "Maria Rebeca", "16092627-9", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(980, "2015", "Romero", "López", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-14 13:16:12"), "berenicelopezromero@gmail.com", "Berenice", "238971101", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(981, "2017", "Carla Motto", "Motto", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-14 14:34:14"), "carla.motto@gmail.com", "Carla", "154705813", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(982, "2017", "Oviedo", "Balboa", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-14 20:44:50"), "Elizabeth.balboa@ug.uchile.cl", "Elizabeth ", "139418433", 3, 12, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(983, "2017", "Reyes", "Casanueva", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-15 03:07:31"), "loretocasanuev@gmail.com", "Loreto", "166535336", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(984, "2017", "Reyes", "Casanueva", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-15 03:08:10"), "loretocasanuev@gmail.co", "Loreto", "166535336", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(985, "2017", "Carla Motto", "Motto", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-15 15:48:02"), "carla.motto@gmail.com", "Carla", "154705813", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(986, "2018", "Cuello", "Grillo", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-15 19:46:58"), "agrilloc@gmail.com", "Andrés", "13.252.466-1", 7, 1, 6); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(987, "2018", "León", "Parga", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-16 13:10:43"), "venusenelparaiso@gmail.com", "Angela", "13682630-1", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(988, "2017", "Sánchez", "Sánchez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-16 13:29:07"), "jlsanchez@live.com", "Jorge ", "141507850", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(989, "2017", "Sánchez", "Sánchez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-16 13:30:39"), "jlsanchez@live.com", "Jorge", "14150785-0", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(990, "2001", "Pinto", "Mahaluf", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-16 17:13:18"), "info@mahaluf.net", "Sebastian", "13.050.509-0", 9, 2, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(991, "2001", "Pinto", "Mahaluf", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-16 17:14:30"), "info@mahaluf.net", "Sebastian", "13.050.509-0", 6, 2, 2); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(992, "2018", "Rios", "Checa", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-16 19:57:07"), "checacecilia@gmail.com", "Cecilia", "24583369-5", 9, 8, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(993, "2016", "Castillo", "Vildoso", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-21 12:42:24"), "juanpablovildoso@gmail.com", "Juan Pablo", "15.602.025-7", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(994, "2016", "Castillo", "Vildoso", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-21 12:44:04"), "juanpablovildoso@gmail.com", "Juan Pablo", "15.602.025-7", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(995, "2019", "Martel", "Toledo", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-22 13:27:38"), "carlostoledomartel@gmail.com", "Carlos", "124226643", 7, 24, 5); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(996, "2013", "Gajardo", "Guzmán", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-22 15:12:44"), "gustavoguzman.web@gmail.com", "Gustavo Adolfo", "16.021.598-4", 4, 10, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(997, "2013", "Gajardo", "Guzmán", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-22 15:14:09"), "gustavoguzman.web@gmail.com", "Gustavo", "16.021.598-4", 3, 10, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(998, "2013", "Gajardo", "Guzmán ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-22 15:16:51"), "gustavoguzman.web@gmail.com", "Gustavo Adolfo", "16.021.598-4", 3, 10, 10); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(999, "2013", "Gajardo", "Guzmán ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-22 15:17:20"), "gustavoguzman.web@gmail.com", "Gustavo Adolfo", "16.021.598-4", 3, 10, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1000, "2018", "Diego Parra Donoso", "Donoso", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-22 15:58:30"), "diegoparrad@gmail.com", "Diego", "176104945", 7, 6, 6); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1001, "2015", "Contreras", "Contreras", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-23 18:13:30"), "daniella.contreras@gmail.com", "Marlene Daniella", "15.459.848-0", 7, 1, 6); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1002, "2016", "Urra", "Núñez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-23 21:05:41"), "isabelfabiola@gmail.com", "Isabel", "10682339-1", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1003, "2016", "Urra", "Núñez ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-23 21:33:04"), "isabelfabiola@gmail.com", "Isabel ", "10682339-1", 7, 1, 10); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1004, "2017", "duarte", "lópez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-23 22:33:13"), "alexanderlopezd@hotmail.com", "alexander", "173567227", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1005, "2014", "Cerpa", "Farías", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-24 20:37:31"), "marifacer@gmail.com", "Maritza", "15349302-2", 9, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1006, "2018", "vildosola", "silva", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-25 14:43:10"), "antonio_silva_chile@yahoo.com", "antonio", "99066490", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1007, "2016", "Phillips", "Herrera", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-28 23:16:10"), "lorenaherrera@u.uchile.cl", "Lorena", "13699054-3", 7, 1, 6); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1008, "2013", "Zaldivar", "Aguirre", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-29 15:40:02"), "roaguidrigorre@gmail.com", "Rodrigo ", "16020733-7", 9, 4, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1009, "2013", "Saavedra", "Quinteros", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-04 01:47:08"), "jquinterossaavedra@gmail.com", "Juan Manuel", "153822611", 7, 4, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1010, "2015", "Moreno ", "Garrido", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-04 16:17:13"), "mgarridocamila@gmail.com", "Camila ", "167161936", 9, 7, 2); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1011, "2018", "Palacios", "Coppola", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-05 00:29:59"), "coppolacalabria@gmail.com", "Pavella", "12069125-2", 7, 1, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1012, "2018", "Palacios", "Coppola", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-05 00:31:30"), "coppolacalabria@gmail.com", "Pavella", "12069125-2", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1013, "2018", "Neira", "Puga", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-05 15:41:25"), "gabrielpuganeira@gmail.com", "Gabriel manuel", "18361848-2", 9, 20, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1014, "2014", "Fernandez", "Delgado", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-05 19:39:37"), "pameladelgado12@gmail.com", "Pamela", "165574427", 1, 29, 2); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1015, "2018", "Feliciano", "Figueroa", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-05 21:40:32"), "anette.figueroa1@gmail.com", "Anette", "26208689-5", 9, 13, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1016, "2018", "González", "Cápona", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-06 11:10:57"), "dcapona@gmail.com", "Daniela", "17355326-9", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1017, "2017", "calbul", "campos", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-07 03:10:12"), "camposmgdt@gmail.com", "Danilo", "16760711-k", 7, 3, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1018, "2016", "SEPULVEDA", "NAVARRETE", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-07 12:33:16"), "bnavarretesep@gmail.com", "BEATRIZ", "10365081-K", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1019, "2007", "Salazar", "Cu", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-07 19:57:37"), "adrian.cusalazar@gmail.com", "Adrián Mauricio", "22355513-6", 9, 3, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1020, "2017", "Tejada", "Motto", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-11 13:22:24"), "carla.motto@gmail.com", "Carla", "154705813", 7, 1, 10); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1021, "2018", "Vial", "Larraín ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-11 14:09:31"), "dlarrainv@gmail.com", "Daniel Agustín de los Dolores", "15325729-9", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1022, "2014", "pacheco", "cortés", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-11 14:30:19"), "cortes.macarena.p@gmail.com", "macarena", "16.368.218-4", 9, 2, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1023, "2014", "pacheco", "cortés", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-11 14:31:22"), "cortes.macarena.p@gmail.com", "macarena", "16.368.218-4", 9, 2, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1024, "2006", "Abuhadba", "Harcha", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-11 18:51:15"), "cindyharcha@gmail.com", "Cindy Jocelyn", "14619799K", 9, 14, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1025, "2012", "Vizzolini", "Lattanzi", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-12 12:40:41"), "mlauralattanzi@gmail.com", "María Laura ", "23386202-9", 2, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1026, "2012", "Vizzolini", "Lattanzi", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-12 12:42:03"), "mlauralattanzi@gmail.com", "María Laura ", "23386202-9", 2, 1, 11); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1027, "2015", "Yáñez", "Quezada", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-12 15:07:53"), "lucyquezada@ug.uchile.cl", "Lucy", "178026186", 7, 6, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1028, "2010", " Díaz", "Carrasco", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-13 20:10:30"), "nicolas.carrasco.d@gmail.com", "Nicolás José", "13.830.232-6", 9, 1, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1029, "2018", "Páez ", "González ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-14 00:01:06"), "nestored1974@gmail.com", "Néstor Eduardo ", "12.678.961-0", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1030, "2018", "PÁEZ", "GONZÁLEZ ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-14 14:51:58"), "NESTORED1974@GMAIL.COM", "NÉSTOR EDUARDO", "12678961-0", 7, 1, 7); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1031, "2017", "Reyes", "Casanueva", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-14 20:42:49"), "loretocasanuev@gmail.com", "Loreto", "166535336", 7, 1, 10); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1032, "1990", "Stansfield", "Vera", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-15 15:49:54"), "lorenavera@me.com", "Lorena", "7648227-6", 4, 29, 2); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1033, "2017", "baeza", "cancino", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-16 22:49:04"), "franciscocancinobaeza@gmail.com", "francisco javier", "12720198-6", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1034, "2018", "Uribe-Echevarría", "Vigouroux", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-18 00:29:41"), "martinvigourouxuribe@gmail.com", "Martín", "17.088.484-1", 7, 6, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1035, "2010", "Valenzuela", "Torres", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-19 16:38:03"), "maria.torres.v@gmail.com", "María Irene", "12643447-2", 3, 1, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1036, "2017", "duarte", "lópez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-19 19:44:15"), "alexanderlopezd@hotmail.com", "alexander ", "173567227", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1037, "2010", "Martínez", "Jiménez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-20 18:32:51"), "vfjimene@uc.cl", "Victoria Francisca", "153274614", 7, 6, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1038, "2010 (solicito CERTIFICADO DE TESIS PARA RANKING / BECAS CHILE)", "Martínez", "Jiménez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-20 18:47:17"), "vfjimene@uc.cl", "Victoria Francisca", "15.327.461-4", 7, 6, 11); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1039, "2015", "Opazo", "Solís ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-20 19:58:02"), "josesolisopazo@gmail.com", "José Domingo", "11862306-1", 7, 1, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1040, "2018", "Gonzalez", "Hidalgo", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-21 19:33:05"), "renatohidalgog@gmail.com", "Renato ", "18502786-4", 7, 4, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1041, "2019", "Martin", "Bastías", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-22 13:37:11"), "morita.bastias@gmail.com", "Morita Paola","106652619", 7, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1042, "2016", "Oetiker", "Zuñiga", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-22 17:35:16"), "rzoetiker@gmail.com", "Ruddy", "17798384-5", 3, 7, 2); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1043, "2016", "Oetiker", "Zuñiga", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-22 17:38:35"), "rzoetiker@gmail.com", "Ruddy", "17798384-5", 3, 7, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1045, "2016", "Pinto", "Navarro", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-23 14:40:24"), "vitorionav73@gmail.com", "Victor", "8.337.353-9", 5, 5, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1046, "2019", "Acuña", "Martí", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-25 01:14:28"), "llimarti@gmail.com", "Llinos", "16794115-K", 7, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1046, "2018", "Vera", "Pilonieta", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-26 13:33:43"), "estebanmpv@gmail.com", "Esteban", "263584473", 9, 13, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1048, "2018", "Ancamil", "Castillo ", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-26 15:08:33"), "francisco.castilloan@gmail.com", "Francisco", "167862683", 7, 17, 4); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1050, "1998", "Brozovich", "Aguilar", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-26 21:43:04"), "javieraguilar7-8@hotmail.co", "Javier", "14.676.730-3", 9, 29, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1051, "2011", "Carlos Araya", "Araya", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-27 12:52:39"), "carlosarayam@gmail.com", "Carlos", "15679284-5", 3, 1, 8); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1052, "2019", "Espinoza", "Álvarez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-29 20:43:22"), "natura.nurtura@gmail.com", "Guillermo ", "14.147.153-8", 1, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1053, "2019", "DUQUE", "ARANGO", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-29 21:59:20"), "varangod@unal.edu.co", "VIVIANA", "AN679288", 7, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1054, "2019", "DUQUE", "ARANGO", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-29 22:01:47"), "varangod@unal.edu.co", "VIVIANA ", "AN679288 ", 7, 7, 5); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1055, "2019", "Dominguez", "Montero", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-31 17:59:03"), "consuelomonterodominguez@gmail.com", "Maria consuelo", "166119804", 9, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1056, "2019", "Felipe Fierro", "Fierro", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-01 12:04:15"), "f.fierro.becker@gmail.com", "Felipe", "16370181-2", 7, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1057, "2019", "Figueroa", "Cabanillas", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-01 12:19:27"), "paucabanillas@gmail.com", "Paulina", "153655219", 9, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1058, "2019", "domínguez", "montero", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-01 13:59:40"), "consuelomonterodominguez@gmail.com", "maría consuelo", "166119804", 7, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1059, "2019", "Campos", "Gutiérrez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-01 16:32:36"), "rsgutier@uc.cl", "Rebeca", "151404340", 7, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1060, "2019", "Jiménez", "Henríquez", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-01 17:55:37"), "jacinta.h.j@gmail.com", "Jacinta Sofía", "18.020.304-4", 7, 7, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1061, "2005", "Bonilla", "Arentsen", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-01 19:26:54"), "javierarentsen@yahoo.es", "Javier Andrés", "10.308.960-3", 9, 2, 2); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1062, "2005", "Bonilla", "Arentsen", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-01 19:28:38"), "javierarentsen@yahoo.es", "Javier Andrés", "10.308.960-3", 9, 2, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1063, "2017", "Ramírez", "Matus", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-02 14:48:04"), "carolina.matus.r@gmail.com", "Carolina Giselle", "13480124-7", 9, 9, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1064, "1990", "Stansfield", "Vera", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-02 15:15:39"), "lorenavera@me.com", "Lorena", "76482276", 4, 29, 2); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1065, "2011", "Hiriart", "Gouet", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-02 15:48:43"), "adrian.gouet@gmail.com", "Adrián", "15380579-2", 7, 2, 3); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1066, "2019", "Sepulveda", "Simpson", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-03 02:14:13"), "Manuel.simpson@gmail.com", "Manuel", "17560500-2", 9, 9, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1067, "2018", "Valenzuela", "Moreno", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-03 05:16:01"), "javiera.moreno@ug.uchile.cl", "Javiera Belén", "186638395", 1, 12, 1); i = i+1;
		arreglo[i] = new SolicitudCertificadoDTO(1068, "2007", "SERRANO", "GUICHARD", 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-03 15:56:58") , "carolina.guichardserrano@gmail.com", "CAROLINA", "138314006", 9, 2, 2); i = i+1;

		

		System.out.println("certificado[j]:"+i);

		for(int j=0; j< arreglo.length; j++){
			if(arreglo[j]!=null && arreglo[j].getIdSolicitudCertificado()>0){
				try{
					factoryServicioDAO.getSolicitudCertificadoServicio().crearSolicitudCertificadoDTO(arreglo[j]);
				}catch(Exception e){
					System.out.println("rechazo["+j+"] ->"+arreglo[j].getIdSolicitudCertificado());
					e.printStackTrace();
				}
			}


		}


		/***

	'898', '2018', 'Gómez', 'Pacheco', '1', '2018-12-02 18:32:48', 'jhpachecog@unal.edu.co', 'Jorge Hernando', '25.583.127-5', '7', '1', '3'
	'899', '2015', 'Contreras', 'Contreras', '1', '2018-12-03 15:26:18', 'daniella.contreras@gmail.com', 'Marlene Daniella', '15.459.848-0', '9', '1', '3'
	'900', '2015', 'Contreras', 'Contreras', '1', '2018-12-03 15:26:19', 'daniella.contreras@gmail.com', 'Marlene Daniella', '15.459.848-0', '9', '1', '3'
	'901', '2016', 'Sahurie', 'Rojas', '1', '2018-12-04 13:39:14', 'pablo.rojas.s@ug.uchile.cl', 'Pablo Marcelo', '18167538-1', '9', '5', '11'
	'902', '2016', 'Pinto', 'Navarro', '1', '2018-12-05 15:58:11', 'vitorionav73@gmail.com', 'Victor', '8.337.353-9', '9', '5', '4'
	'903', '2018', 'Leòn', 'Parga', '1', '2018-12-06 19:02:25', 'venusenelparaiso@gmail.com', 'Angela', '13682630-1', '7', '1', '6'
	'904', '2018', 'Leòn', 'Parga', '1', '2018-12-06 19:03:52', 'venusenelparaiso@gmail.com', 'Angela', '13682630-1', '7', '1', '10'
	'905', '2015', 'Romero', 'López', '1', '2018-12-10 12:21:46', 'berenicelopezromero@gmail.com', 'Berenice', '23897110-1', '7', '1', '3'
	'906', '2015', 'Romero', 'López', '1', '2018-12-10 12:24:44', 'berenicelopezromero@gmail.com', 'Berenice', '23897110-1', '7', '1', '10'
	'907', '2015', 'Romero', 'López', '1', '2018-12-10 12:27:05', 'berenicelopezromero@gmail.com', 'Berenice', '23897110-1', '7', '1', '1'
	'908', '2015', 'Romero', 'López', '1', '2018-12-10 12:30:03', 'berenicelopezromero@gmail.com', 'Berenice', '23897110-1', '7', '1', '7'
	'909', '2016', 'Flores', 'Ramírez ', '1', '2018-12-11 12:31:24', 'lorenaramirezf@gmail.com', 'Lorena Margarita', '15.430.560-2', '7', '7', '3'
	'910', '2015', 'Styles', 'Herrera', '1', '2018-12-11 14:43:01', 'patyhest@gmail.com', 'Patricia Elena', '102487621', '7', '1', '3'
	'911', '2015', 'Styles', 'Herrera', '1', '2018-12-11 14:57:47', 'patyhest@gmail.com', 'Patricia Elena', '10.248.762-1', '7', '1', '1'
	'912', '2011', 'aguilera', 'luna', '1', '2018-12-11 15:30:04', 'camilaluna6@gmail.com', 'camila', '18474455-4', '7', '29', '3'
	'913', '2013', 'González', 'Catalán', '1', '2018-12-12 18:34:24', 'rcatalang@gmail.com', 'Ricardo Cristian', '14121095-5', '3', '7', '3'
	'914', '2013', 'González', 'Catalán', '1', '2018-12-12 18:34:25', 'rcatalang@gmail.com', 'Ricardo Cristian', '14121095-5', '3', '7', '3'
	'915', '2018', 'Flores', 'Portillo', '1', '2018-12-12 20:12:19', 'rebecapflores@gmail.com', 'Rebeca', '261978059', '5', '7', '1'
	'916', '2015', 'Germain', 'Gómez', '1', '2018-12-13 12:50:03', 'franciscagomezge@gmail.com', 'Francisca', '155011556', '7', '1', '1'
	'917', '2015', 'Germain', 'Gómez', '1', '2018-12-13 12:54:13', 'franciscagomezge@gmail.com', 'Francisca', '155011556', '7', '1', '3'
	'918', '2010', 'Gonzalez', 'Cornejo', '1', '2018-12-13 14:37:03', 'julio.i.cornejo.gonzalez@gmail.com', 'Julio', '1-9', '6', '1', '2'
	'919', '2008', 'martinez', 'acevedo', '1', '2018-12-13 18:52:46', 'y.acevedo.martinez@gmail.com', 'yahanara', '172392466', '9', '29', '3'
	'920', '2017', 'Pastrana', 'Cruchett', '1', '2018-12-14 13:43:46', 'paulina.cruchett@gmail.com', 'Paulina ', '16575894-3', '9', '7', '1'
	'921', '2018', 'Bolivar', 'Gutierrez', '1', '2018-12-14 16:35:42', 'dgutierrezb@gmail.com', 'Diana Paola', '23684872-8', '3', '7', '1'
	'922', '2015', 'TRONCOSO', 'ALBORNOZ', '1', '2018-12-14 18:54:21', 'ALEJAALBORNOZ@GMAIL.COM', 'ELIANA ALEJANDRA', '10822567-K', '9', '22', '2'
	'923', '2015', 'Cornejo', 'Eulefi', '1', '2018-12-17 18:45:47', 'ani.eulefi@gmail.com', 'Anaí', '177067075', '1', '13', '1'
	'924', '2015', 'Cornejo', 'Eulefi', '1', '2018-12-17 18:48:24', 'ani.eulefi@gmail.com', 'Anaí', '177067075', '1', '13', '4'
	'925', '2015', 'García', 'Pessis', '1', '2018-12-18 15:26:20', 'bpessis@uc.cl', 'Begoña', '17270080-2', '7', '1', '1'
	'926', '2016', 'González', 'Saavedra', '1', '2018-12-18 18:37:59', 'lorerey@gmail.com', 'María Lorena', '14138346-9', '7', '1', '1'
	'927', '2016', 'González', 'Saavedra', '1', '2018-12-18 18:42:31', 'lorerey@gmail.com', 'María Lorena', '14138346-9', '7', '1', '3'
	'928', '2018', 'Aguilera', 'Slachevsky', '1', '2018-12-20 12:31:27', 'esteli.sa@gmail.com', 'Estelí ', '16356389-4', '9', '6', '1'
	'929', '2018', 'Aguilera', 'Slachevsky', '1', '2018-12-20 12:31:28', 'esteli.sa@gmail.com', 'Estelí ', '16356389-4', '9', '6', '1'
	'930', '2015', 'Cornejo', 'Eulefi', '1', '2018-12-20 16:08:05', 'ani.eulefi@gmail.com', 'Anaí', '177067075', '1', '13', '4'
	'931', '2009', 'Orrego', 'Rey', '1', '2018-12-20 19:18:05', 'luciareyo@gmail.com', 'Lucía', '14632362-6', '6', '6', '3'
	'932', '2015', 'Eluchans', 'Caruso', '1', '2018-12-21 19:01:21', 'giocarel@gmail.com', 'Giovanna', '142437406', '9', '3', '4'
	'933', '2015', 'Eluchans', 'Caruso', '1', '2018-12-21 19:03:30', 'giocarel@gmail.com', 'Giovanna', '142437406', '9', '3', '10'
	'934', '2017', ' baeza', 'baeza', '1', '2018-12-26 13:55:33', 'franciscocancinobaeza@gmail.com', 'francisco javier', '12720198-6', '7', '1', '7'
	'935', '2018', 'González', 'Cápona', '1', '2018-12-26 15:38:12', 'dcapona@gmail.com', 'Daniela', '17355326-9', '7', '1', '3'
	'936', '2018', 'González', 'Cápona', '1', '2018-12-26 15:41:58', 'dcapona@gmail.com', 'Daniela', '17355326-9', '7', '1', '1'
	'937', '2017', 'Urriola', 'Espinosa', '1', '2018-12-27 13:47:15', 'cristobalespinosa@ug.uchile.cl', 'Cristóbal', '17.085.094-7', '9', '7', '1'
	'938', '2004', 'Soto', 'Cottet', '1', '2018-12-27 16:04:42', 'pcottet@yahoo.com', 'Pablo Antonio', '9991110-7', '7', '1', '3'
	'939', '2011', 'Leiva', 'Lorca', '1', '2018-12-27 16:46:22', 'jrglorca@gmail.com', 'Jorge', '12.685.532.K', '7', '1', '3'
	'940', '2018', 'Vial', 'Larrain', '1', '2018-12-28 18:25:44', 'dlarrainv@gmail.com', 'Daniel Agustin de los Dolores', '15.325.729-9', '7', '1', '1'
	'941', '2018', 'Vial', 'Larrain', '1', '2018-12-28 18:26:48', 'dlarrainv@gmail.com', 'Daniel Agustin de los Dolores', '15.325.729-9', '7', '1', '3'
	'942', '2018', 'Beltrán', 'Arriagada', '1', '2018-12-28 19:21:28', 'leoarriagada@outlook.com', 'Leonardo', '16531708-4', '9', '1', '1'
	'943', '2018', 'Beltrán', 'Arriagada', '1', '2018-12-28 19:44:46', 'leoarriagada@outlook.com', 'Leonardo', '16531708-4', '7', '1', '3'
	'944', '2018', 'Beltrán', 'Arriagada', '1', '2018-12-28 19:46:41', 'leoarriagada@outlook.com', 'Leonardo', '16531708-4', '7', '1', '1'
	'945', '2017', ' baeza', 'cancino', '1', '2018-12-29 01:05:04', 'franciscocancinobaeza@gmail.com', 'francisco javier', '12720198-6', '7', '1', '1'
	'946', '2015', 'Cruz', 'Cubides', '1', '2018-12-30 11:40:20', 'aemia@hotmail.com', 'Ana Milena ', '23.158.462-5', '4', '7', '3'
	'947', '2007 creo', 'Gleisner', 'Parra', '1', '2019-01-02 18:06:57', 'arteparrita@gmail.com', 'Carolina', '126298250', '5', '13', '5'
	'948', '2010', 'Jerez', 'Henriquez ', '1', '2019-01-02 19:31:13', 'sintetizadorhenriquez@gmail.com', 'Gabriel Alejandro ', '13440719-0', '9', '10', '2'
	'949', '2018', 'Sepúlveda', 'Simpson', '1', '2019-01-03 12:41:04', 'simpson.eduardo@gmail.com', 'Eduardo Alberto', '16814392-3', '7', '1', '6'
	'950', '2018', 'Sepúlveda', 'Simpson', '1', '2019-01-03 13:15:12', 'simpson.eduardo@gmail.com', 'Eduardo Alberto', '16814392-3', '7', '1', '7'
	'951', '2018', 'Sepúlveda', 'Simpson', '1', '2019-01-03 13:16:10', 'simpson.eduardo@gmail.com', 'Eduardo Alberto', '16.814.392-3', '7', '1', '1'
	'952', '2018', 'Sepúlveda', 'Simpson', '1', '2019-01-03 13:17:14', 'simpson.eduardo@gmail.com', 'Eduardo Alberto', '16814392-3', '7', '1', '3'
	'953', '2017', 'Reyes', 'Arévalo', '1', '2019-01-03 13:46:08', 'sofiarevalo9@gmail.com', 'Sofía ', '16399383k', '7', '1', '1'
	'954', '2017', 'Reyes', 'Arévalo', '1', '2019-01-03 13:48:13', 'sofiarevalo9@gmail.com', 'Sofía', '16399383k', '7', '1', '3'
	'955', '2016', 'Sepúlveda', 'Navarrete', '1', '2019-01-03 17:39:31', 'bnavarretesep@gmail.com', 'Beatriz', '10365081-K', '7', '1', '3'
	'956', '2015', 'Aldridge', 'Valenzuela', '1', '2019-01-07 14:36:50', 'aovalenz@gmail.com', 'Alejandro ', '16.095.229-6', '7', '1', '1'
	'957', '2015', 'Aldridge', 'Valenzuela', '1', '2019-01-07 14:37:44', 'aovalenz@gmail.com', 'Alejandro', '16.095.229-6', '7', '1', '3'
	'958', '2015', 'Maturana', 'Escudero', '1', '2019-01-07 15:22:34', 'mariajose.escudero@gmail.com', 'María José ', '16.355.100-4', '9', '7', '4'
	'959', '2015', 'Maturana', 'Escudero', '1', '2019-01-07 15:23:44', 'mariajose.escudero@gmail.com', 'María José', '163551004', '9', '7', '2'
	'960', '2015', 'Opazo', 'Solís ', '1', '2019-01-07 21:46:45', 'josesolisopazo@gmail.com', 'José Domingo', '11862306-1', '7', '1', '3'
	'961', '2017', 'Parraguez', 'Hernández', '1', '2019-01-09 01:59:17', 'martasimil@gmail.com', 'Marta Cecilia', '14.145.449-8', '7', '1', '6'
	'962', '2009', 'Sagredo', 'Arros', '1', '2019-01-09 19:48:51', 'juan.arros@gmail.com', 'Juan Alberto', '6647065-2', '9', '29', '11'
	'963', '2015', 'rojas', 'moya', '1', '2019-01-09 22:55:54', 'paloma.moya@gmail.com', 'paloma', '175994130', '5', '13', '4'
	'964', '2015', 'Fernández', 'Insunza', '1', '2019-01-10 15:51:20', 'ivan.insunza@gmail.com', 'Iván', '157484052', '7', '1', '3'
	'965', '2015', 'Fernández', 'Insunza', '1', '2019-01-10 15:52:19', 'ivan.insunza@gmail.com', 'Iván', '157484052', '7', '1', '1'
	'966', '2016', 'Sepúlveda', 'Navarrete', '1', '2019-01-10 18:18:53', 'bnavarretesep@gmail.com', 'Beatriz', '10365081-K', '7', '1', '1'
	'967', '2015', 'Opazo', 'Solís', '1', '2019-01-10 18:31:27', 'josesolisopazo@gmail.com', 'José Domingo', '11.862.306-1', '7', '1', '1'
	'968', '2018', 'Bozzo', 'Berrios ', '1', '2019-01-10 23:16:33', 'Danzatarapaca@gmail.com', 'Daniela Alejandra ', '109995347', '9', '20', '2'
	'969', '2015', 'Contreras', 'Contreras', '1', '2019-01-11 00:40:55', 'daniella.contreras@gmail.com', 'Marlene Daniella', '15.459.848-0', '7', '1', '3'
	'970', '2018', 'Bascuñan', 'Goffard', '1', '2019-01-11 14:20:58', 'ngoffardster@gmail.com', 'Nathalie', '12720651-1', '7', '1', '1'
	'971', '2018', 'Bascuñan', 'Goffard', '1', '2019-01-11 14:22:57', 'ngoffardster@gmail.com', 'Nathalie', '12720651-1', '7', '1', '7'
	'972', '2016', 'Maurer', 'Glavic', '1', '2019-01-11 14:36:42', 'karenglavic@gmail.com', 'Karen', '160067039', '7', '1', '3'
	'973', '2012', 'Traverso', 'Cori', '1', '2019-01-11 14:56:46', 'rcori@uchile.cl', 'Rolando', '6.009.229-K', '7', '1', '4'
	'974', '2018', 'Páez ', 'González ', '1', '2019-01-11 15:55:49', 'nestored1974@gmail.com', 'Néstor Eduardo', '12.678.961-0', '7', '1', '1'
	'975', '2018', 'Páez ', 'González ', '1', '2019-01-11 15:57:34', 'nestored1974@gmail.com', 'Néstor Eduardo ', '12.678.961-0', '7', '1', '6'
	'976', '2018', 'Páez ', 'González ', '1', '2019-01-11 16:02:02', 'nestored1974@gmail.com', 'Néstor Eduardo ', '12.678.961-0', '7', '1', '3'
	'977', '2018', 'Páez ', 'González ', '1', '2019-01-11 16:08:09', 'nestored1974@gmail.com', 'Néstor Eduardo ', '12.678.961-0', '7', '1', '7'
	'978', '2015', 'Castro', 'Sanchez ', '1', '2019-01-13 19:24:51', 'rebeca.sanchez.castro@gmail.com', 'Maria Rebeca ', '16092627-9', '7', '1', '1'
	'979', '2015', 'Castro', 'Sanchez', '1', '2019-01-13 19:31:07', 'rebeca.sanchez.castro@gmail.com', 'Maria Rebeca', '16092627-9', '7', '1', '3'
	'980', '2015', 'Romero', 'López', '1', '2019-01-14 13:16:12', 'berenicelopezromero@gmail.com', 'Berenice', '238971101', '7', '1', '1'
	'981', '2017', 'Carla Motto', 'Motto', '1', '2019-01-14 14:34:14', 'carla.motto@gmail.com', 'Carla', '154705813', '7', '1', '3'
	'982', '2017', 'Oviedo', 'Balboa', '1', '2019-01-14 20:44:50', 'Elizabeth.balboa@ug.uchile.cl', 'Elizabeth ', '139418433', '3', '12', '1'
	'983', '2017', 'Reyes', 'Casanueva', '1', '2019-01-15 03:07:31', 'loretocasanuev@gmail.com', 'Loreto', '166535336', '7', '1', '1'
	'984', '2017', 'Reyes', 'Casanueva', '1', '2019-01-15 03:08:10', 'loretocasanuev@gmail.co', 'Loreto', '166535336', '7', '1', '3'
	'985', '2017', 'Carla Motto', 'Motto', '1', '2019-01-15 15:48:02', 'carla.motto@gmail.com', 'Carla', '154705813', '7', '1', '1'
	'986', '2018', 'Cuello', 'Grillo', '1', '2019-01-15 19:46:58', 'agrilloc@gmail.com', 'Andrés', '13.252.466-1', '7', '1', '6'
	'987', '2018', 'León', 'Parga', '1', '2019-01-16 13:10:43', 'venusenelparaiso@gmail.com', 'Angela', '13682630-1', '7', '1', '3'
	'988', '2017', 'Sánchez', 'Sánchez', '1', '2019-01-16 13:29:07', 'jlsanchez@live.com', 'Jorge ', '141507850', '7', '1', '3'
	'989', '2017', 'Sánchez', 'Sánchez', '1', '2019-01-16 13:30:39', 'jlsanchez@live.com', 'Jorge', '14150785-0', '7', '1', '1'
	'990', '2001', 'Pinto', 'Mahaluf', '1', '2019-01-16 17:13:18', 'info@mahaluf.net', 'Sebastian', '13.050.509-0', '9', '2', '3'
	'991', '2001', 'Pinto', 'Mahaluf', '1', '2019-01-16 17:14:30', 'info@mahaluf.net', 'Sebastian', '13.050.509-0', '6', '2', '2'
	'992', '2018', 'Rios', 'Checa', '1', '2019-01-16 19:57:07', 'checacecilia@gmail.com', 'Cecilia', '24583369-5', '9', '8', '1'
	'993', '2016', 'Castillo', 'Vildoso', '1', '2019-01-21 12:42:24', 'juanpablovildoso@gmail.com', 'Juan Pablo', '15.602.025-7', '7', '1', '1'
	'994', '2016', 'Castillo', 'Vildoso', '1', '2019-01-21 12:44:04', 'juanpablovildoso@gmail.com', 'Juan Pablo', '15.602.025-7', '7', '1', '3'
	'995', '2019', 'Martel', 'Toledo', '1', '2019-01-22 13:27:38', 'carlostoledomartel@gmail.com', 'Carlos', '124226643', '7', '24', '5'
	'996', '2013', 'Gajardo', 'Guzmán', '1', '2019-01-22 15:12:44', 'gustavoguzman.web@gmail.com', 'Gustavo Adolfo', '16.021.598-4', '4', '10', '3'
	'997', '2013', 'Gajardo', 'Guzmán', '1', '2019-01-22 15:14:09', 'gustavoguzman.web@gmail.com', 'Gustavo', '16.021.598-4', '3', '10', '4'
	'998', '2013', 'Gajardo', 'Guzmán ', '1', '2019-01-22 15:16:51', 'gustavoguzman.web@gmail.com', 'Gustavo Adolfo', '16.021.598-4', '3', '10', '10'
	'999', '2013', 'Gajardo', 'Guzmán ', '1', '2019-01-22 15:17:20', 'gustavoguzman.web@gmail.com', 'Gustavo Adolfo', '16.021.598-4', '3', '10', '3'
	'1000', '2018', 'Diego Parra Donoso', 'Donoso', '1', '2019-01-22 15:58:30', 'diegoparrad@gmail.com', 'Diego', '176104945', '7', '6', '6'
	'1001', '2015', 'Contreras', 'Contreras', '1', '2019-01-23 18:13:30', 'daniella.contreras@gmail.com', 'Marlene Daniella', '15.459.848-0', '7', '1', '6'
	'1002', '2016', 'Urra', 'Núñez', '1', '2019-01-23 21:05:41', 'isabelfabiola@gmail.com', 'Isabel', '10682339-1', '7', '1', '1'
	'1003', '2016', 'Urra', 'Núñez ', '1', '2019-01-23 21:33:04', 'isabelfabiola@gmail.com', 'Isabel ', '10682339-1', '7', '1', '10'
	'1004', '2017', 'duarte', 'lópez', '1', '2019-01-23 22:33:13', 'alexanderlopezd@hotmail.com', 'alexander', '173567227', '7', '1', '3'
	'1005', '2014', 'Cerpa', 'Farías', '1', '2019-01-24 20:37:31', 'marifacer@gmail.com', 'Maritza', '15349302-2', '9', '1', '1'
	'1006', '2018', 'vildosola', 'silva', '1', '2019-01-25 14:43:10', 'antonio_silva_chile@yahoo.com', 'antonio', '99066490', '7', '1', '3'
	'1007', '2016', 'Phillips', 'Herrera', '1', '2019-01-28 23:16:10', 'lorenaherrera@u.uchile.cl', 'Lorena', '13699054-3', '7', '1', '6'
	'1008', '2013', 'Zaldivar', 'Aguirre', '1', '2019-01-29 15:40:02', 'roaguidrigorre@gmail.com', 'Rodrigo ', '16020733-7', '9', '4', '4'
	'1009', '2013', 'Saavedra', 'Quinteros', '1', '2019-03-04 01:47:08', 'jquinterossaavedra@gmail.com', 'Juan Manuel', '153822611', '7', '4', '4'
	'1010', '2015', 'Moreno ', 'Garrido', '1', '2019-03-04 16:17:13', 'mgarridocamila@gmail.com', 'Camila ', '167161936', '9', '7', '2'
	'1011', '2018', 'Palacios', 'Coppola', '1', '2019-03-05 00:29:59', 'coppolacalabria@gmail.com', 'Pavella', '12069125-2', '7', '1', '1'
	'1012', '2018', 'Palacios', 'Coppola', '1', '2019-03-05 00:31:30', 'coppolacalabria@gmail.com', 'Pavella', '12069125-2', '7', '1', '3'
	'1013', '2018', 'Neira', 'Puga', '1', '2019-03-05 15:41:25', 'gabrielpuganeira@gmail.com', 'Gabriel manuel', '18361848-2', '9', '20', '4'
	'1014', '2014', 'Fernandez', 'Delgado', '1', '2019-03-05 19:39:37', 'pameladelgado12@gmail.com', 'Pamela', '165574427', '1', '29', '2'
	'1015', '2018', 'Feliciano', 'Figueroa', '1', '2019-03-05 21:40:32', 'anette.figueroa1@gmail.com', 'Anette', '26208689-5', '9', '13', '1'
	'1016', '2018', 'González', 'Cápona', '1', '2019-03-06 11:10:57', 'dcapona@gmail.com', 'Daniela', '17355326-9', '7', '1', '3'
	'1017', '2017', 'calbul', 'campos', '1', '2019-03-07 03:10:12', 'camposmgdt@gmail.com', 'Danilo', '16760711-k', '7', '3', '3'
	'1018', '2016', 'SEPULVEDA', 'NAVARRETE', '1', '2019-03-07 12:33:16', 'bnavarretesep@gmail.com', 'BEATRIZ', '10365081-K', '7', '1', '3'
	'1019', '2007', 'Salazar', 'Cu', '1', '2019-03-07 19:57:37', 'adrian.cusalazar@gmail.com', 'Adrián Mauricio', '22355513-6', '9', '3', '4'
	'1020', '2017', 'Tejada', 'Motto', '1', '2019-03-11 13:22:24', 'carla.motto@gmail.com', 'Carla', '154705813', '7', '1', '10'
	'1021', '2018', 'Vial', 'Larraín ', '1', '2019-03-11 14:09:31', 'dlarrainv@gmail.com', 'Daniel Agustín de los Dolores', '15325729-9', '7', '1', '3'
	'1022', '2014', 'pacheco', 'cortés', '1', '2019-03-11 14:30:19', 'cortes.macarena.p@gmail.com', 'macarena', '16.368.218-4', '9', '2', '4'
	'1023', '2014', 'pacheco', 'cortés', '1', '2019-03-11 14:31:22', 'cortes.macarena.p@gmail.com', 'macarena', '16.368.218-4', '9', '2', '4'
	'1024', '2006', 'Abuhadba', 'Harcha', '1', '2019-03-11 18:51:15', 'cindyharcha@gmail.com', 'Cindy Jocelyn', '14619799K', '9', '14', '3'
	'1025', '2012', 'Vizzolini', 'Lattanzi', '1', '2019-03-12 12:40:41', 'mlauralattanzi@gmail.com', 'María Laura ', '23386202-9', '2', '1', '3'
	'1026', '2012', 'Vizzolini', 'Lattanzi', '1', '2019-03-12 12:42:03', 'mlauralattanzi@gmail.com', 'María Laura ', '23386202-9', '2', '1', '11'
	'1027', '2015', 'Yáñez', 'Quezada', '1', '2019-03-12 15:07:53', 'lucyquezada@ug.uchile.cl', 'Lucy', '178026186', '7', '6', '4'
	'1028', '2010', ' Díaz', 'Carrasco', '1', '2019-03-13 20:10:30', 'nicolas.carrasco.d@gmail.com', 'Nicolás José', '13.830.232-6', '9', '1', '4'
	'1029', '2018', 'Páez ', 'González ', '1', '2019-03-14 00:01:06', 'nestored1974@gmail.com', 'Néstor Eduardo ', '12.678.961-0', '7', '1', '3'
	'1030', '2018', 'PÁEZ', 'GONZÁLEZ ', '1', '2019-03-14 14:51:58', 'NESTORED1974@GMAIL.COM', 'NÉSTOR EDUARDO', '12678961-0', '7', '1', '7'
	'1031', '2017', 'Reyes', 'Casanueva', '1', '2019-03-14 20:42:49', 'loretocasanuev@gmail.com', 'Loreto', '166535336', '7', '1', '10'
	'1032', '1990', 'Stansfield', 'Vera', '1', '2019-03-15 15:49:54', 'lorenavera@me.com', 'Lorena', '7648227-6', '4', '29', '2'
	'1033', '2017', 'baeza', 'cancino', '1', '2019-03-16 22:49:04', 'franciscocancinobaeza@gmail.com', 'francisco javier', '12720198-6', '7', '1', '3'
	'1034', '2018', 'Uribe-Echevarría', 'Vigouroux', '1', '2019-03-18 00:29:41', 'martinvigourouxuribe@gmail.com', 'Martín', '17.088.484-1', '7', '6', '1'
	'1035', '2010', 'Valenzuela', 'Torres', '1', '2019-03-19 16:38:03', 'maria.torres.v@gmail.com', 'María Irene', '12643447-2', '3', '1', '4'
	'1036', '2017', 'duarte', 'lópez', '1', '2019-03-19 19:44:15', 'alexanderlopezd@hotmail.com', 'alexander ', '173567227', '7', '1', '3'
	'1037', '2010', 'Martínez', 'Jiménez', '1', '2019-03-20 18:32:51', 'vfjimene@uc.cl', 'Victoria Francisca', '153274614', '7', '6', '3'
	'1038', '2010 (solicito CERTIFICADO DE TESIS PARA RANKING / BECAS CHILE)', 'Martínez', 'Jiménez', '1', '2019-03-20 18:47:17', 'vfjimene@uc.cl', 'Victoria Francisca', '15.327.461-4', '7', '6', '11'
	'1039', '2015', 'Opazo', 'Solís ', '1', '2019-03-20 19:58:02', 'josesolisopazo@gmail.com', 'José Domingo', '11862306-1', '7', '1', '3'
	'1040', '2018', 'Gonzalez', 'Hidalgo', '1', '2019-03-21 19:33:05', 'renatohidalgog@gmail.com', 'Renato ', '18502786-4', '7', '4', '3'
	'1041', '2019', 'Martin', 'Bastías', '1', '2019-03-22 13:37:11', 'morita.bastias@gmail.com', 'Morita Paola', '106652619', '7', '7', '1'
	'1042', '2016', 'Oetiker', 'Zuñiga', '1', '2019-03-22 17:35:16', 'rzoetiker@gmail.com', 'Ruddy', '17798384-5', '3', '7', '2'
	'1043', '2016', 'Oetiker', 'Zuñiga', '1', '2019-03-22 17:38:35', 'rzoetiker@gmail.com', 'Ruddy', '17798384-5', '3', '7', '3'
	'1045', '2016', 'Pinto', 'Navarro', '1', '2019-03-23 14:40:24', 'vitorionav73@gmail.com', 'Victor', '8.337.353-9', '5', '5', '4'
	'1046', '2019', 'Acuña', 'Martí', '1', '2019-03-25 01:14:28', 'llimarti@gmail.com', 'Llinos', '16794115-K', '7', '7', '1'
	'1047', '2018', 'Vera', 'Pilonieta', '1', '2019-03-26 13:33:43', 'estebanmpv@gmail.com', 'Esteban', '263584473', '9', '13', '4'
	'1048', '2018', 'Ancamil', 'Castillo ', '1', '2019-03-26 15:08:33', 'francisco.castilloan@gmail.com', 'Francisco', '167862683', '7', '17', '4'
	'1050', '1998', 'Brozovich', 'Aguilar', '1', '2019-03-26 21:43:04', 'javieraguilar7-8@hotmail.co', 'Javier', '14.676.730-3', '9', '29', '3'
	'1051', '2011', 'Carlos Araya', 'Araya', '1', '2019-03-27 12:52:39', 'carlosarayam@gmail.com', 'Carlos', '15679284-5', '3', '1', '8'
	'1052', '2019', 'Espinoza', 'Álvarez', '1', '2019-03-29 20:43:22', 'natura.nurtura@gmail.com', 'Guillermo ', '14.147.153-8', '1', '7', '1'
	'1053', '2019', 'DUQUE', 'ARANGO', '1', '2019-03-29 21:59:20', 'varangod@unal.edu.co', 'VIVIANA', 'AN679288', '7', '7', '1'
	'1054', '2019', 'DUQUE', 'ARANGO', '1', '2019-03-29 22:01:47', 'varangod@unal.edu.co', 'VIVIANA ', 'AN679288 ', '7', '7', '5'
	'1055', '2019', 'Dominguez', 'Montero', '1', '2019-03-31 17:59:03', 'consuelomonterodominguez@gmail.com', 'Maria consuelo', '166119804', '9', '7', '1'
	'1056', '2019', 'Felipe Fierro', 'Fierro', '1', '2019-04-01 12:04:15', 'f.fierro.becker@gmail.com', 'Felipe', '16370181-2', '7', '7', '1'
	'1057', '2019', 'Figueroa', 'Cabanillas', '1', '2019-04-01 12:19:27', 'paucabanillas@gmail.com', 'Paulina', '153655219', '9', '7', '1'
	'1058', '2019', 'domínguez', 'montero', '1', '2019-04-01 13:59:40', 'consuelomonterodominguez@gmail.com', 'maría consuelo', '166119804', '7', '7', '1'
	'1059', '2019', 'Campos', 'Gutiérrez', '1', '2019-04-01 16:32:36', 'rsgutier@uc.cl', 'Rebeca', '151404340', '7', '7', '1'
	'1060', '2019', 'Jiménez', 'Henríquez', '1', '2019-04-01 17:55:37', 'jacinta.h.j@gmail.com', 'Jacinta Sofía', '18.020.304-4', '7', '7', '1'
	'1061', '2005', 'Bonilla', 'Arentsen', '1', '2019-04-01 19:26:54', 'javierarentsen@yahoo.es', 'Javier Andrés', '10.308.960-3', '9', '2', '2'
	'1062', '2005', 'Bonilla', 'Arentsen', '1', '2019-04-01 19:28:38', 'javierarentsen@yahoo.es', 'Javier Andrés', '10.308.960-3', '9', '2', '3'
	'1063', '2017', 'Ramírez', 'Matus', '1', '2019-04-02 14:48:04', 'carolina.matus.r@gmail.com', 'Carolina Giselle', '13480124-7', '9', '9', '1'
	'1064', '1990', 'Stansfield', 'Vera', '1', '2019-04-02 15:15:39', 'lorenavera@me.com', 'Lorena', '76482276', '4', '29', '2'
	'1065', '2011', 'Hiriart', 'Gouet', '1', '2019-04-02 15:48:43', 'adrian.gouet@gmail.com', 'Adrián', '15380579-2', '7', '2', '3'
	'1066', '2019', 'Sepulveda', 'Simpson', '1', '2019-04-03 02:14:13', 'Manuel.simpson@gmail.com', 'Manuel', '17560500-2', '9', '9', '1'
	'1067', '2018', 'Valenzuela', 'Moreno', '1', '2019-04-03 05:16:01', 'javiera.moreno@ug.uchile.cl', 'Javiera Belén', '186638395', '1', '12', '1'
	'1068', '2007', 'SERRANO', 'GUICHARD', '1', '2019-04-03 15:56:58', 'carolina.guichardserrano@gmail.com', 'CAROLINA', '138314006', '9', '2', '2'

		 ***/
	}


	public void crearSolicitudAcademicaTest(){
		objLog.info("crearSolicitudAcademicaTest");

		SolicitudAcademicaDTO[] arreglo = new SolicitudAcademicaDTO[1000]; 

		int i=0;

		arreglo[i] = new SolicitudAcademicaDTO(362,"2016","Guasch","Schiodtz",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-03 14:29:56") ,"Inscripción de tesis para iniciar la tramitación correspondiente en Secretaría de Estudios","joan.sch77@gmail.com","Joan","13.241.508-0",0,7,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(363,"2017","Cauzarich","Oporto",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-03 17:34:11"),"AFE equivalente a Tesis: Concierto Sinfónico para Violoncello y orquesta de Pedro Humberto Allende: Estudio y reedición de  parte solista y reducción de piano.","olivercell@gmail.com","Oliver ","15.894.887-7",0,9,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(364,"2017","Cauzlarich","Oporto",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-03 17:40:52"),"AFE equivalente a Tesis: Concierto Sinfónico para Violoncello y orquesta de Pedro Humberto Allende: Estudio y reedición de  parte solista y reducción de piano.","olivercell@gmail.com","Oliver","15.894.887-7",0,9,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(366,"2017","Calbul","Campos",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-13 03:50:55"),"inscripción de tesis ","camposmgdt@gmail.com","Danilo Enrique","16760711-k",1243,3,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(367,"2015","Pacheco","Polanco",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-13 05:13:20"),"documento adjunto.","teatroinmigrante@gmail.com","Elvis Lisandro","222856779",1244,3,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(369,"2015","TRONCOSO","ALBORNOZ",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 18:50:25"),"Solicito copia de certificación del diplomado","ALEJAALBORNOZ@GMAIL.COM","ELIANA ","10822567-K",0,22,10); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(371,"2014","Martínez","Valle",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-17 22:15:57"),"De acuerdo a lo solicitado, debo realizar la solicitud de homologación para dar mi examen de grado de magister en composición.","valeriazul79@gmail.com","Valeria Gisel","13.634.338-6",0,4,4); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(372,"2016","Oyarzún","Ulloa",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-18 02:54:30"),"Solicito extender mi solicitud de prórroga otorgada durante este año, debido a que tuve que pausar el avance de mi tesis al momento de incorporarme al equipo de acreditación del MGC, donde comencé mis labores en Octubre. De todas maneras, mi tesis se encuentra en un importante estado de avance, de manera que sería óptimo para mí y para el bien de mi trabajo de tesis el contar con la extensión de la prórroga al menos durante el primer semestre del año 2019.","andrea.ulloa@ug.uchile.cl","Andrea Javiera","17855635-5",1285,7,5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(373,"2014","España","Cruz",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-20 01:24:30"),"Luego de asistir durante un año y medio a clases en la Universidad de Chile, solicito una homologación de las asignaturas cursadas. El motivo de mi atraso se ha debido a la falta de recursos para pagar la deuda de mis estudios de pregrado, razón por la cual trabajé durante tiempo completo los últimos tres años. No tuve la alternativa de realizar una tesis acorde a los estándares que dicho curso requiere. Además, durante este tiempo he podido perfeccionarme como profesional del área de conservación y restauración. Mis intenciones son finalmente poder dedicarme a esta disciplina con propiedad.","isidoracruze@gmail.com","Isidora ","168317018",1289,12,4); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(374,"2017","Curaqueo","de la Fuente",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-24 02:08:17"),"Programa: Magister en Artes Mediales","diego.delafuente@ug.uchile.cl","Diego","17.602.050-4",1291,8,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(375,"2017","Gómez","Cornejo",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-24 13:30:01"),"Autoinducción emocional en el conductor orquestal en su labor como performer","jlcornejo@gmail.com","Jorge Luis","12889313K",0,9,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(376,"2015","Castro","Sanchez",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-31 18:51:38"),"Carta de solicitud y certificados medicos adjuntos","rebeca.sanchez.castro@gmail.com","Maria Rebeca","16092627-9",1295,1,1); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(377,"2018 Admisión especial de Reincorporación","Muñoz","Carrizo",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-03 03:44:22"),"Después de una severa enfermedad personal, a partir del mes de Octubre de 2018, con la orientación de mi Profesora guía Dra. Verónica Sentis Hermann he trabajado en la elaboración del Anteproyecto de Tesis lo que ha permitido que esté en condiciones de Inscribir la Tesis que hemos titulado \"LO AURÁTICO COMO SUSTANCIA PRIMERA Y DISTINTIVA DEL TEATRO\"","abeljcarrizo@gmail.com","Abel","5.610.792-4",1297,3,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(378,"2015","bahamondes","cuevas",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-10 14:42:24"),"Solicité la prorroga para relizar la tesis durante el año 2017, por motivos laborales  y familiares me fue imposible lograr dicho objetivo. El año 2019 tengo la disponibilidad completa para realizar mi tesis y finalizar así el Magister.","claudia.cuevas.bah@gmail.com","claudia","16626939-3",0,7,2); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(379,"2016","Abraham","Gaspar",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-10 16:53:07"),"A través de la presente quisiera inscribir mi tesis magistral. ","gaspar.soledad@gmail.com","María Soledad","153246017",1309,3,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(380,"2014","Arévalo","San Martín ",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-15 20:46:24"),"En los actuales momentos me encuentro realizando los trámites finales para la obtención del grado Magister en Artes mención Dirección Teatral","sanmartin.paul@gmail.com","Diego Paul","24.950.677-k",0,3,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(381,"2016","Hermosilla","Ahumada",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-17 20:00:20"),"Hola, me encuentro en el proceso de entrega de mi tesis, y por medio del programa me informaron que faltaba realizar este trámite. Me encuentro matriculado en el año 2018, y pretendo matricularme en 2019 para realizar mi defensa durante el presente año. ","tomas.ahumada.h@gmail.com","Tomas Andres","169546339",1315,3,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(382,"2016","Ibáñez","Muñoz",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-17 20:11:58"),"inscripcion de tesis para postular a grado de magister.","alanm.ibanez@live.cl","Allan Cristopher","18528676-2",1316,3,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(383,"2016","Reynaldos","Acuña",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-17 22:51:44"),"Termino del postgrado de dirección teatral.","Priscila.reynolds@gmail.com","Priscila","17904033-6",1318,3,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(384,"2016","Carrasco","Pérez",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-21 22:39:24"),"Conclusión y entrega de tesis, para iniciar proceso de defensa y titulación de esta.","teatrocorpus@yahoo.com.br","Gonzalo Edgardo","12.102.137-4",1327,3,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(385,"2014","Campusano","Rojas",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-24 14:10:11"),"Para dejar registro de que mi tesis ya está lista y fue aprobada por el profesor guía.","mariadelosangelesrojas@gmail.com","María de los Angeles","138521680",0,7,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(386,"2015","Cisterna","Portillo",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-25 07:04:47"),"Debido a un presente acontecimiento que entorpece gravemente mi investigación de tesis, me veo obligada a pedir una prórroga para mi entrega final. Lamentablemente hace unos días fui violentamente asaltada por dos delincuentes en la comuna de Puente Alto, usurpándome gran parte de mi material de investigación. A pesar de que tengo parte de mi trabajo respaldado, el trabajo realizado en las últimas semanas, crucial para el cierre de mi investigación, ha escapado de mi poder. A partir de esta situación, consulté a mi profesor guía Camilo Rossel cómo proceder y el profesor sugirió aplicar a una prórroga. El suceso ha provocado en mí un cuadro de estrés post traumático que actualmente me tiene muy afectada. Aun así, he intentado reaccionar a la brevedad para poder aplicar a esta solicitud con todos los antecedentes y apoyos aquí adjuntos.","portillo.cisterna@gmail.com","Daniela Jacqueline de Lourdes","17.798.250-4",1336,6,5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(387,"2013","Langenbach","Schwerter",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-27 04:00:32"),"Por motivos personales y laborales no logré finalizar proceso de tesis y me vi en la obligación de cambiarme de ciudad; actualmente trabajo en la Ilustre municipalidad de Lago Ranco, como asesora cultural del Programa de desarrollo territorial indígena y como gestora cultural de Museo Tringlo. Luego de adjudicar proyecto FNDR para construcción de un nuevo museo adquirí el compromiso de terminar el Magister para asumir la dirección de dicho museo, por lo cual me interesa poder realizar mi tesis y defensa de la misma a la brevedad.","catalizando@gmail.com","Carolina","15882442-6",1338,7,11); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(388,"2016","García","Hidalgo",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-29 15:25:58"),"Inscripción de Tesis","claudiahidalgogarcia@yahoo.com","Claudia Patricia","7982702-9",1347,3,9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(389,"2003","Navarrete","Navarro",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-30 14:07:15"),"Busco certificado de diplomado efectuado en el año 2003 en el departamento de danza de la facultad de artes de la U. de Chile el nombre de este es \"Danza Aplicada a la Educación\" ","boydanzer@hotmail.com","Alex Christian ","11.886.484-0",0,29,10); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(391,"2001","Pinto","Mahaluf",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-31 12:00:00"),"Mi nombre es Sebastián Mahaluf Pinto, RUT: 13.050.509-0, fui alumno del Programa de Magíster en Artes, con Mención en Artes Visuales.\n\nIngresé al Magister en el año 2001 cursando todas las asignaturas del programa, y debido a motivos personales, no pude rendir el examen final en los plazos establecidos. (le adjunto certificado de concentración de notas)\n\nPosteriormente me enteré por mis compañeros del mismo cohorte, que se realizó un llamado para finalizar este proceso, del cual nunca fui contactado.\n\nPor lo anterior, ruego a usted considerar esta solicitud para poder reintegrarme y rendir mi examen final.\n\nEn espera de su comprensión y buena acogida, se despide atentamente,\n\nSebastián Mahaluf ","info@mahaluf.net","Sebastián","13.050.509-0",1376,2,10); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(392,"2010","Castro","Guzmán",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-05 12:00:00"),"El año 2014 inicié el área de Educación y Cultura de la Corporación Cultural de Peñalolén y soy creadora y coordinadora gral de Formarte, programa que incluye las asignaturas del Teatro, Danza y Canto Coral dentro del currículo formal de las escuelas públicas de Peñalolén, relevando la importancia de la educación artística para la formación integral de las personas. Formarte es un programa pionero y referente gracias a sus excelentes resultados.\nLas razones por las cuales no pude realizar mi fueron las siguientes: tuve problemas de tipo laboral y económico luego quedé embarazada y tuve a mi hijo, lo que demandó gran parte de mi tiempo. Los siguientes años tuve una gran carga laboral y problemas familiares importantes, como la enfermedad de mi padre quien está a mi cargo, entre otras. Hoy mis condiciones mejoraron y puedo finalizarla","ximenaguzmancastro@gmail.com","Ximena","139125371",1378,7,11); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(393,"2017","Briceño","Corvalán",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-06 18:37:49"),"Solicito la reincorporación al curso de especialización de Restauración del Patrimonio Cultural mueble, ya que me encuentro en condiciones para poder realizarlo en relación a mi maternidad.","malejandra1702@gmail.com","María Alejandra","16.574.178-1",0,12,2); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(394,"2016","Roa","Flores",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-06 19:28:23"),"En la carta adjunta detallo las causas por las que solicito una prórroga de entrega de tesis - Magister en Artes, mención teoría e historia del arte.","flores.roa.eduardo@gmail.com","Eduardo Gonzalo Rodrigo","16.765.923-3",1380,6,5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(395,"2016","Roa","Flores",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-06 19:29:42"),"Fundamento adjunto en la carta","flores.roa.eduardo@gmail.com","Eduardo Gonzalo Rodrigo","16.765.923-3",1381,6,5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(396,"2017","Soto","Ried",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-07 15:08:51"),"Cumplo con renunciar al programa, luego de haberlo postergado por razones de carácter económico. Dado que esas condiciones no se han visto modificadas de manera positiva, me veo en la obligación de renunciar al programa de doctorado mencionado.","nicolasried@gmail.com","Nicolás","17.286.621-2",0,1,8); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(397,"2016","GONZÁLEZ","RODRÍGUEZ",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-07 18:04:36"),"Estimado Comité Académico, adjunto carta formal para solicitud de prórroga de entrega de Tesis. ","ara.edith@gmail.com","ARACELI","16.812.109-1",1383,6,5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(398,"2017","Flores","Tirapegui ",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-11 19:38:42"),"El motivo de solicitar la postergación de mis estudios de Magíster en Artes Mediales para el año 2019, se debe a que estoy residiendo y trabajando en Banff, Canadá. Actualmente estoy adquiriendo experiencias que aportarán a mis competencias profesionales y laborales, como el aprendizaje de idioma, generación de redes de trabajo y conocer otros entornos que me permitan una mirada más estratégica y comparativa.","gerardo.tirapegui@gmail.com","Gerardo Andrés","17.188.756-9",0,8,1); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(399,"2017","Román","Adaros",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-11-12 20:38:25"),"Los motivos para esta solicitud tienen que ver, por un lado, con que yo tuve la oportunidad de realizar el mismo módulo (con la misma profesora) como asignatura obligatoria durante mi formación de Socióloga en pre-grado en la Facultad de Ciencias Sociales de la Universidad de Chile el año 2013, el cual aprobé con nota final 6,5. Y por otro lado, porque ya finalizando el Magíster me encuentro trabajando con total dedicación en mi tesis, por lo cual no tomar el módulo no significaría un alejamiento del programa, sino más bien el poder ocupar aquellas horas en mi trabajo final.","carola1250@gmail.com","Carolina","17.860.255-1",1180,7,4); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(400,"2019","Campos","Gutierrez",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-15 20:02:52"),"Fui seleccionada en el MGC en 2015 pero finalmente no lo cursé. El prof Gabriel Matthey está al tanto de mi caso.","rsgutier@uc.cl","Rebeca","151404340",1403,7,11); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(401,"2012","SAENZ","ORTEGA",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-18 12:43:45"),"SE ADJUNTA CARPETA (zip) CON CARTA DE SOLICITUD Y DOCUMENTOS DE RESPALDO","LFORTEGA@UC.CL","LEONORA FERNANDA","124871182",1408,1,2); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(402,"2010","Aguayo","Aguayo",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-18 13:41:46"),"Ingresé al Megister en Gestión Cultural el año 2010, egresando el año 2011. Los estudios en Gestión Cultural cursados, me entregaron herramientas para el ejercicio profesional, reforzando los conocimientos obtenidos desde la práctica. Como es posible apreciar en el CV adjunto, desde mi egreso desde la Licenciatura en Artes Plásticas de la Universidad de Concepción hasta hoy, he desarrollado mi labor en el campo de la gestión cultural, especializándome en procesos de planificación de organizaciones culturales públicas y privadas. Además de ser socia fundadora de la Asociación para la Medicación Artística y Cultural http://www.redmediacionartistica.cl/, lugar en el que actualmente estoy a cargo de la administración y finanzas, soy asesora y apoyo de la Corporación Cultural Balmaceda Arte Joven en materias de planificación. ","gaatome@gmail.com","Gloria Albertina","12320953-2",1410,7,2); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(403,"2016","Aguayo","Acuña ",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-18 15:44:18"),"Durante el segundo semestre de 2018 tuve dificultades en lo personal que me impidieron dedicarme a la investigación y elaboración de tesis de magister. Tales dificultades se relacionan con la dedicación de gran parte de mi tiempo –incluso mi cambio de domicilio–  para colaborar en el cuidado de mi padre quien durante ese semestre fue diagnosticado y posteriormente tratado por Linfoma no hodgkin, lo cual implicó varias hospitalizaciones ( quimioterapias y aislamientos por Leucopenia); así como cuidado y dedicación que irrumpieron mi quehacer, sin tomar en cuenta las circunstancias que emocionalmente implica la enfermedad, lo cual no me permitieron avanzar dentro del plan de trabajo propuesto de antemano.  Adjunto epicrisis de algunas hospitalizaciones, así como el certificado del diag. Esperando su comprensión, se despide atte, Anita A.","anita.e.acuna@gmail.com","Anita ","16605636-5",1413,6,5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(404,"2010","Castro","Jiménez",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-18 13:47:30"),"Egresé del Magister el año 2011 y por razones laborales y personales,  me vi en la obligación de postergar mi proceso de titulación. Tomando en cuenta la experiencia que adquirí en el magister y la que me ha dado ser  Co fundadora y Directora Ejecutiva del Circo del Mundo por 24 años, es que he decidió terminar mi proceso de titulación para adquirir el grado académico y a mediano plazo incrementar mis conocimientos con otros estudios.","alesiempre@gmail.com","Alejandra del Pilar","10061430-8",1412,7,2); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(406,"2016","Cornejo","Alvarado",true,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-21 00:59:24"),"La fundamentación va en los archivos adjuntos ","mgalvara@uc.cl","Manuel","18084383-3",1422,6,5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(407,"2019","guarda","rodriguez",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-21 16:19:55"),"certificado medico tratamiento siquiatrico.","huapicana@gmail.com","carla","109878480",0,24,8); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(408,"2019","guarda","rodriguez",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-21 19:27:19"),"certificado medico de mi psiquiatra  que he tratado de adjuntar a este link pero no lo carga , por tal motivo lo envié al correo de Srta Andrea Peñalosa con copia a Srta. Marcela Garcia","huapicana@gmail.com","carla","109878480",0,24,8); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(409,"2019","Guarda ","Rodriguez",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-21 19:42:29"),"Certificado médico siquiatra, envié por vía correo a Andrea Peñaloza y Marcela García , por si es que no se carga en este link.","Huapicana@gmail.com","Carla ","109878480",0,24,8); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(410,"2015","Leiva","Flores",false,1,AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-22 15:35:45"),"Mi tesis ya fue entregada a mi profesor guía. Actualmente me encuentro a la espera de sus comentario finales y trabajando en la conclusión. Elevo esta solicitud, luego de que la coordinadora del magíster, Isabel Jara, determinara darme hasta la primera semana de mayo, luego de haber visto un resumen y de haber hablado con mi profesor guía, Sebastián Vidal. Para cumplir tal plazo, necesito matricularme.","mfloresl@ug.uchile.cl","Mariairis","17533999-k",0,6,5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(411,"2011","Diaz","Lopez",true,1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-22 19:47:10"),"El 18 de diciembre de 2018 ingresé mi solicitud a través de esta misma plataforma para determinar qué modalidad aplica para mi caso, considerando que estoy egresada, con certificado de egreso oficial del año 2013 adjunto y me encuentro avanzando en mi tesis con entrega antes de julio de este año","carolopezd@gmail.com","Paula Carolina","100363909",1424,7,10); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(412,"2016","Cayuela", "Weinstein", true, 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-26 14:06:07"), "Solicita prórroga según indica documento adjunto", "luisweinstein@gmail.com", "Luis", "6784594-3", 1428, 7, 5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(414,"2014","Cerpa", "Farías", false, 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-26 19:01:16"), "Solicito a la Escuela de Postgrado de la Universidad de Chile una prórroga para poder entregar mi tesis dentro del año académico 2019, esto debido a motivos de trabajo, salud y asuntos personales que retrasaron el término del doctorado dentro de los plazos establecidos por la Universidad. Quedo atenta y esperando que eta solicitud sea bien acogida, atentamente Maritza Farías Cerpa.  ", "marifacer@gmail.com", "Maritza", "15349302-2", 0, 1, 5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(415,"2014","Órdenes", "Sanhueza", false, 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-26 21:38:49"), "Por medio de la presente solicito la prórroga para la entrega de mi tesis doctoral. Por motivos de trabajo principalmente, asociado a mi desempeño académico en nuestra misma casa de estudios (Departamento de Psicología, Facultad de Ciencias Sociales), el desarrollo de mi investigación ha tardado más de lo proyectado originalmente. Mi compromiso es dar término a la investigación durante el presente año. ", "danilosanhueza@gmail.com", "Danilo Esteban", "15509677-2", 0, 1, 5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(416,"2014","moggia", "garcía", false, 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-27 14:57:44"), "Me encuentro finalizando la escritura de mi tesis, con miras a entregarla durante el mes de mayo. A lo que debo añadir que    estoy embarazada de siete meses.", "macarenagarciamoggia@gmail.com", "macarena", "15098634-6", 0, 1, 5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(417,"2019","Madariaga", "Mandujano", true, 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-27 15:30:16"), "He tenido un problema familiar y económico (deudas impagas de operaciones  de mi madre en el Hospital de la Universidad de Chile) por el que me veo obligado a renunciar a mi calidad de alumno en dicho curso, para cubrir los cheques de dicha deuda.  Yo pagué un año completo del Postítulo al contado con el descuento $ 2.806.986, y mi preocupación es recobrar lo más posible el dinero, comprendo que la matrícula no se devuelva, por esto es que quisiera darme de baja lo antes posible para ya no ser considerado alumno, que el tiempo no pase y que se me pueda reembolsar lo demás. El problema es que mi madre arrastra un problema de salud que ha derivado en numerosas cirugías los último años, las que hemos financiado en familia. Ahora hay un cheque en abril por 4.000.0000 que hay que cubrir. ", "ricardomandujano@gmail.com", "Ricardo ", "13.270.843-6", 1432, 12, 8); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(418,"2014","aránguiz", "kong", true, 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-27 16:03:54"), "Solicito prórroga para la entrega de mi tesis, que ya se encuentra en su etapa final de redacción. La demora se ha debido sobre todo a modificaciones importantes en la formulación luego de la estadía de investigación realizada en París, a fines del 2017 y principios del 2018. He mantenido comunicación con mi tutor (Profesor Miguel Ruiz) y he recibido buena retroalimentación de su parte respecto a los avances de mi trabajo. adjunto un capítulo de mi tesis como muestra. ", "felipekaranguiz@gmail.com", "felipe esteban", "16742984K", 1433, 1, 5); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(419,"2011","Chaves", "López", false, 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-29 14:56:43"), "Recibí una carta donde se me notificaban la eliminación del programa, por efectos de tiempo de permanencia en el plan de estudios. En acuerdo con mi profesor guía, Federico Galende, y en virtud de los avances de mi tesis, que representan el 70%, quisiera solicitar mi reincorporación. ", "plopess@gmail.com", "Paz", "15464926-3", 0, 1, 2); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(420,"2001","Moreno", "Araya", false, 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-30 16:26:10"), "Estimadas/os.  Solicito por favor una reincorporación al programa en el contexto de estar en mi finalización de tesis doctoral, tema conversado explícitamente con  el coordinador y mi profesor guía. Quedo atento a cualquier consulta o solicitud a carlosarayam@gmail.com Saludos cordiales.", "carlosarayam@gmail.com", "Carlos Alberto", "15.679.284-5", 0, 1, 2); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(421,"2013","Hidalgo", "Retamal", false, 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-01 21:19:02"), "Solicito inscribir la tesis.", "jerehi@gmail.com", "Jorge", "15.428.571-7", 0, 1, 9); i = i+1;
		arreglo[i] = new SolicitudAcademicaDTO(422,"2018"," Palma", "Cancino", false, 1, AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-03 13:54:34"), "Estimados necesito certificado de alumno regular para justificar estudios ante Fondo Solidario de PUCV para su postergación ", "ignaciocp@gmail.com", "Jorge Ignacio ", "165750411",0, 6, 10); i = i+1;
		

		/**		(362,'2016','Guasch','Schiodtz',0,1,'2018-12-03 14:29:56','Inscripción de tesis para iniciar la tramitación correspondiente en Secretaría de Estudios','joan.sch77@gmail.com','Joan','13.241.508-0',NULL,7,9),
		 * 		(363,'2017','Cauzarich','Oporto',0,1,'2018-12-03 17:34:11','AFE equivalente a Tesis: Concierto Sinfónico para Violoncello y orquesta de Pedro Humberto Allende: Estudio y reedición de  parte solista y reducción de piano.','olivercell@gmail.com','Oliver ','15.894.887-7',NULL,9,9),
		 * 		(364,'2017','Cauzlarich','Oporto',0,1,'2018-12-03 17:40:52','AFE equivalente a Tesis: Concierto Sinfónico para Violoncello y orquesta de Pedro Humberto Allende: Estudio y reedición de  parte solista y reducción de piano.','olivercell@gmail.com','Oliver','15.894.887-7',NULL,9,9),
		 * 		(366,'2017','Calbul','Campos',1,1,'2018-12-13 03:50:55','inscripción de tesis ','camposmgdt@gmail.com','Danilo Enrique','16760711-k',1243,3,9),
		 * 		(367,'2015','Pacheco','Polanco',1,1,'2018-12-13 05:13:20','documento adjunto.','teatroinmigrante@gmail.com','Elvis Lisandro','222856779',1244,3,9),
		 * 		(369,'2015','TRONCOSO','ALBORNOZ',0,1,'2018-12-14 18:50:25','Solicito copia de certificación del diplomado','ALEJAALBORNOZ@GMAIL.COM','ELIANA ','10822567-K',NULL,22,10),
		 * 		(371,'2014','Martínez','Valle',0,1,'2018-12-17 22:15:57','De acuerdo a lo solicitado, debo realizar la solicitud de homologación para dar mi examen de grado de magister en composición.','valeriazul79@gmail.com','Valeria Gisel','13.634.338-6',NULL,4,4),
		 * 		(372,'2016','Oyarzún','Ulloa',1,1,'2018-12-18 02:54:30','Solicito extender mi solicitud de prórroga otorgada durante este año, debido a que tuve que pausar el avance de mi tesis al momento de incorporarme al equipo de acreditación del MGC, donde comencé mis labores en Octubre. De todas maneras, mi tesis se encuentra en un importante estado de avance, de manera que sería óptimo para mí y para el bien de mi trabajo de tesis el contar con la extensión de la prórroga al menos durante el primer semestre del año 2019.','andrea.ulloa@ug.uchile.cl','Andrea Javiera','17855635-5',1285,7,5),
		 * 		(373,'2014','España','Cruz',1,1,'2018-12-20 01:24:30','Luego de asistir durante un año y medio a clases en la Universidad de Chile, solicito una homologación de las asignaturas cursadas. El motivo de mi atraso se ha debido a la falta de recursos para pagar la deuda de mis estudios de pregrado, razón por la cual trabajé durante tiempo completo los últimos tres años. No tuve la alternativa de realizar una tesis acorde a los estándares que dicho curso requiere. Además, durante este tiempo he podido perfeccionarme como profesional del área de conservación y restauración. Mis intenciones son finalmente poder dedicarme a esta disciplina con propiedad.','isidoracruze@gmail.com','Isidora ','168317018',1289,12,4),
		 * 		(374,'2017','Curaqueo','de la Fuente',1,1,'2018-12-24 02:08:17','Programa: Magister en Artes Mediales','diego.delafuente@ug.uchile.cl','Diego','17.602.050-4',1291,8,9),
		 * 		(375,'2017','Gómez','Cornejo',0,1,'2018-12-24 13:30:01','Autoinducción emocional en el conductor orquestal en su labor como performer','jlcornejo@gmail.com','Jorge Luis','12889313K',NULL,9,9),
		 * 		(376,'2015','Castro','Sanchez',1,1,'2018-12-31 18:51:38','Carta de solicitud y certificados medicos adjuntos','rebeca.sanchez.castro@gmail.com','Maria Rebeca','16092627-9',1295,1,1),
		 * 		(377,'2018 Admisión especial de Reincorporación','Muñoz','Carrizo',1,1,'2019-01-03 03:44:22','Después de una severa enfermedad personal, a partir del mes de Octubre de 2018, con la orientación de mi Profesora guía Dra. Verónica Sentis Hermann he trabajado en la elaboración del Anteproyecto de Tesis lo que ha permitido que esté en condiciones de Inscribir la Tesis que hemos titulado \"LO AURÁTICO COMO SUSTANCIA PRIMERA Y DISTINTIVA DEL TEATRO\"','abeljcarrizo@gmail.com','Abel','5.610.792-4',1297,3,9),
		 *      (378,'2015','bahamondes','cuevas',0,1,'2019-01-10 14:42:24','Solicité la prorroga para relizar la tesis durante el año 2017, por motivos laborales  y familiares me fue imposible lograr dicho objetivo. El año 2019 tengo la disponibilidad completa para realizar mi tesis y finalizar así el Magister.','claudia.cuevas.bah@gmail.com','claudia','16626939-3',NULL,7,2),
		 *      (379,'2016','Abraham','Gaspar',1,1,'2019-01-10 16:53:07','A través de la presente quisiera inscribir mi tesis magistral. ','gaspar.soledad@gmail.com','María Soledad','153246017',1309,3,9),
		 *      (380,'2014','Arévalo','San Martín ',0,1,'2019-01-15 20:46:24','En los actuales momentos me encuentro realizando los trámites finales para la obtención del grado Magister en Artes mención Dirección Teatral','sanmartin.paul@gmail.com','Diego Paul','24.950.677-k',NULL,3,9),
		 *      (381,'2016','Hermosilla','Ahumada',1,1,'2019-01-17 20:00:20','Hola, me encuentro en el proceso de entrega de mi tesis, y por medio del programa me informaron que faltaba realizar este trámite. Me encuentro matriculado en el año 2018, y pretendo matricularme en 2019 para realizar mi defensa durante el presente año. ','tomas.ahumada.h@gmail.com','Tomas Andres','169546339',1315,3,9),
		 *      (382,'2016','Ibáñez','Muñoz',1,1,'2019-01-17 20:11:58','inscripcion de tesis para postular a grado de magister.','alanm.ibanez@live.cl','Allan Cristopher','18528676-2',1316,3,9),
		 *      (383,'2016','Reynaldos','Acuña',1,1,'2019-01-17 22:51:44','Termino del postgrado de dirección teatral.','Priscila.reynolds@gmail.com','Priscila','17904033-6',1318,3,9),
		 *      (384,'2016','Carrasco','Pérez',1,1,'2019-01-21 22:39:24','Conclusión y entrega de tesis, para iniciar proceso de defensa y titulación de esta.','teatrocorpus@yahoo.com.br','Gonzalo Edgardo','12.102.137-4',1327,3,9),
		 *      (385,'2014','Campusano','Rojas',0,1,'2019-01-24 14:10:11','Para dejar registro de que mi tesis ya está lista y fue aprobada por el profesor guía.','mariadelosangelesrojas@gmail.com','María de los Angeles','138521680',NULL,7,9),
		 *      (386,'2015','Cisterna','Portillo',1,1,'2019-01-25 07:04:47','Debido a un presente acontecimiento que entorpece gravemente mi investigación de tesis, me veo obligada a pedir una prórroga para mi entrega final. Lamentablemente hace unos días fui violentamente asaltada por dos delincuentes en la comuna de Puente Alto, usurpándome gran parte de mi material de investigación. A pesar de que tengo parte de mi trabajo respaldado, el trabajo realizado en las últimas semanas, crucial para el cierre de mi investigación, ha escapado de mi poder. A partir de esta situación, consulté a mi profesor guía Camilo Rossel cómo proceder y el profesor sugirió aplicar a una prórroga. El suceso ha provocado en mí un cuadro de estrés post traumático que actualmente me tiene muy afectada. Aun así, he intentado reaccionar a la brevedad para poder aplicar a esta solicitud con todos los antecedentes y apoyos aquí adjuntos.','portillo.cisterna@gmail.com','Daniela Jacqueline de Lourdes','17.798.250-4',1336,6,5),
		 *      (387,'2013','Langenbach','Schwerter',1,1,'2019-01-27 04:00:32','Por motivos personales y laborales no logré finalizar proceso de tesis y me vi en la obligación de cambiarme de ciudad; actualmente trabajo en la Ilustre municipalidad de Lago Ranco, como asesora cultural del Programa de desarrollo territorial indígena y como gestora cultural de Museo Tringlo. Luego de adjudicar proyecto FNDR para construcción de un nuevo museo adquirí el compromiso de terminar el Magister para asumir la dirección de dicho museo, por lo cual me interesa poder realizar mi tesis y defensa de la misma a la brevedad.','catalizando@gmail.com','Carolina','15882442-6',1338,7,11),
		 *      (388,'2016','García','Hidalgo',1,1,'2019-01-29 15:25:58','Inscripción de Tesis','claudiahidalgogarcia@yahoo.com','Claudia Patricia','7982702-9',1347,3,9),
		 *      (389,'2003','Navarrete','Navarro',0,1,'2019-01-30 14:07:15','Busco certificado de diplomado efectuado en el año 2003 en el departamento de danza de la facultad de artes de la U. de Chile el nombre de este es \"Danza Aplicada a la Educación\" ','boydanzer@hotmail.com','Alex Christian ','11.886.484-0',NULL,29,10),
		 *      (391,'2001','Pinto','Mahaluf',1,1,'2019-01-31 12:00:00','Mi nombre es Sebastián Mahaluf Pinto, RUT: 13.050.509-0, fui alumno del Programa de Magíster en Artes, con Mención en Artes Visuales.\n\nIngresé al Magister en el año 2001 cursando todas las asignaturas del programa, y debido a motivos personales, no pude rendir el examen final en los plazos establecidos. (le adjunto certificado de concentración de notas)\n\nPosteriormente me enteré por mis compañeros del mismo cohorte, que se realizó un llamado para finalizar este proceso, del cual nunca fui contactado.\n\nPor lo anterior, ruego a usted considerar esta solicitud para poder reintegrarme y rendir mi examen final.\n\nEn espera de su comprensión y buena acogida, se despide atentamente,\n\nSebastián Mahaluf ','info@mahaluf.net','Sebastián','13.050.509-0',1376,2,10),
		 *      (392,'2010','Castro','Guzmán',1,1,'2019-03-05 12:00:00','El año 2014 inicié el área de Educación y Cultura de la Corporación Cultural de Peñalolén y soy creadora y coordinadora gral de Formarte, programa que incluye las asignaturas del Teatro, Danza y Canto Coral dentro del currículo formal de las escuelas públicas de Peñalolén, relevando la importancia de la educación artística para la formación integral de las personas. Formarte es un programa pionero y referente gracias a sus excelentes resultados.\nLas razones por las cuales no pude realizar mi fueron las siguientes: tuve problemas de tipo laboral y económico luego quedé embarazada y tuve a mi hijo, lo que demandó gran parte de mi tiempo. Los siguientes años tuve una gran carga laboral y problemas familiares importantes, como la enfermedad de mi padre quien está a mi cargo, entre otras. Hoy mis condiciones mejoraron y puedo finalizarla','ximenaguzmancastro@gmail.com','Ximena','139125371',1378,7,11),
		 *      (393,'2017','Briceño','Corvalán',0,1,'2019-03-06 18:37:49','Solicito la reincorporación al curso de especialización de Restauración del Patrimonio Cultural mueble, ya que me encuentro en condiciones para poder realizarlo en relación a mi maternidad.','malejandra1702@gmail.com','María Alejandra','16.574.178-1',NULL,12,2),
		 *      (394,'2016','Roa','Flores',1,1,'2019-03-06 19:28:23','En la carta adjunta detallo las causas por las que solicito una prórroga de entrega de tesis - Magister en Artes, mención teoría e historia del arte.','flores.roa.eduardo@gmail.com','Eduardo Gonzalo Rodrigo','16.765.923-3',1380,6,5),
		 *      (395,'2016','Roa','Flores',1,1,'2019solicitudAcademicaDTOA = factoryServicioDAO.getSolicitudAcademicaServicio().crearSolicitudAcademicaDTO(solicitudAcademicaDTOA);-03-06 19:29:42','Fundamento adjunto en la carta','flores.roa.eduardo@gmail.com','Eduardo Gonzalo Rodrigo','16.765.923-3',1381,6,5),
		 *      (396,'2017','Soto','Ried',0,1,'2019-03-07 15:08:51','Cumplo con renunciar al programa, luego de haberlo postergado por razones de carácter económico. Dado que esas condiciones no se han visto modificadas de manera positiva, me veo en la obligación de renunciar al programa de doctorado mencionado.','nicolasried@gmail.com','Nicolás','17.286.621-2',NULL,1,8),
		 * 		(397,'2016','GONZÁLEZ','RODRÍGUEZ',1,1,'2019-03-07 18:04:36','Estimado Comité Académico, adjunto carta formal para solicitud de prórroga de entrega de Tesis. ','ara.edith@gmail.com','ARACELI','16.812.109-1',1383,6,5),
		 * 		(398,'2017','Flores','Tirapegui ',0,1,'2019-03-11 19:38:42','El motivo de solicitar la postergación de mis estudios de Magíster en Artes Mediales para el año 2019, se debe a que estoy residiendo y trabajando en Banff, Canadá. Actualmente estoy adquiriendo experiencias que aportarán a mis competencias profesionales y laborales, como el aprendizaje de idioma, generación de redes de trabajo y conocer otros entornos que me permitan una mirada más estratégica y comparativa.','gerardo.tirapegui@gmail.com','Gerardo Andrés','17.188.756-9',NULL,8,1),
		 * 		(399,'2017','Román','Adaros',1,1,'2018-11-12 20:38:25','Los motivos para esta solicitud tienen que ver, por un lado, con que yo tuve la oportunidad de realizar el mismo módulo (con la misma profesora) como asignatura obligatoria durante mi formación de Socióloga en pre-grado en la Facultad de Ciencias Sociales de la Universidad de Chile el año 2013, el cual aprobé con nota final 6,5. Y por otro lado, porque ya finalizando el Magíster me encuentro trabajando con total dedicación en mi tesis, por lo cual no tomar el módulo no significaría un alejamiento del programa, sino más bien el poder ocupar aquellas horas en mi trabajo final.','carola1250@gmail.com','Carolina','17.860.255-1',1180,7,4),
		 * 		(400,'2019','Campos','Gutierrez',1,1,'2019-03-15 20:02:52','Fui seleccionada en el MGC en 2015 pero finalmente no lo cursé. El prof Gabriel Matthey está al tanto de mi caso.','rsgutier@uc.cl','Rebeca','151404340',1403,7,11),
		 * 		(401,'2012','SAENZ','ORTEGA',1,1,'2019-03-18 12:43:45','SE ADJUNTA CARPETA (zip) CON CARTA DE SOLICITUD Y DOCUMENTOS DE RESPALDO','LFORTEGA@UC.CL','LEONORA FERNANDA','124871182',1408,1,2),
		 * 		(402,'2010','Aguayo','Aguayo',1,1,'2019-03-18 13:41:46','Ingresé al Megister en Gestión Cultural el año 2010, egresando el año 2011. Los estudios en Gestión Cultural cursados, me entregaron herramientas para el ejercicio profesional, reforzando los conocimientos obtenidos desde la práctica. Como es posible apreciar en el CV adjunto, desde mi egreso desde la Licenciatura en Artes Plásticas de la Universidad de Concepción hasta hoy, he desarrollado mi labor en el campo de la gestión cultural, especializándome en procesos de planificación de organizaciones culturales públicas y privadas. Además de ser socia fundadora de la Asociación para la Medicación Artística y Cultural http://www.redmediacionartistica.cl/, lugar en el que actualmente estoy a cargo de la administración y finanzas, soy asesora y apoyo de la Corporación Cultural Balmaceda Arte Joven en materias de planificación. ','gaatome@gmail.com','Gloria Albertina','12320953-2',1410,7,2),
		 * 		(403,'2016','Aguayo','Acuña ',1,1,'2019-03-18 15:44:18','Durante el segundo semestre de 2018 tuve dificultades en lo personal que me impidieron dedicarme a la investigación y elaboración de tesis de magister. Tales dificultades se relacionan con la dedicación de gran parte de mi tiempo –incluso mi cambio de domicilio–  para colaborar en el cuidado de mi padre quien durante ese semestre fue diagnosticado y posteriormente tratado por Linfoma no hodgkin, lo cual implicó varias hospitalizaciones ( quimioterapias y aislamientos por Leucopenia), así como cuidado y dedicación que irrumpieron mi quehacer, sin tomar en cuenta las circunstancias que emocionalmente implica la enfermedad, lo cual no me permitieron avanzar dentro del plan de trabajo propuesto de antemano.  Adjunto epicrisis de algunas hospitalizaciones, así como el certificado del diag. Esperando su comprensión, se despide atte, Anita A.','anita.e.acuna@gmail.com','Anita ','16605636-5',1413,6,5),
		 * 		(404,'2010','Castro','Jiménez',1,1,'2019-03-18 13:47:30','Egresé del Magister el año 2011 y por razones laborales y personales,  me vi en la obligación de postergar mi proceso de titulación. Tomando en cuenta la experiencia que adquirí en el magister y la que me ha dado ser  Co fundadora y Directora Ejecutiva del Circo del Mundo por 24 años, es que he decidió terminar mi proceso de titulación para adquirir el grado académico y a mediano plazo incrementar mis conocimientos con otros estudios.','alesiempre@gmail.com','Alejandra del Pilar','10061430-8',1412,7,2),
		 * 		(406,'2016','Cornejo','Alvarado',1,1,'2019-03-21 00:59:24','La fundamentación va en los archivos adjuntos ','mgalvara@uc.cl','Manuel','18084383-3',1422,6,5),
		 * 		(407,'2019','guarda','rodriguez',0,1,'2019-03-21 16:19:55','certificado medico tratamiento siquiatrico.','huapicana@gmail.com','carla','109878480',NULL,24,8),
		 * 		(408,'2019','guarda','rodriguez',0,1,'2019-03-21 19:27:19','certificado medico de mi psiquiatra  que he tratado de adjuntar a este link pero no lo carga , por tal motivo lo envié al correo de Srta Andrea Peñalosa con copia a Srta. Marcela Garcia','huapicana@gmail.com','carla','109878480',NULL,24,8),
		 * 		(409,'2019','Guarda ','Rodriguez',0,1,'2019-03-21 19:42:29','Certificado médico siquiatra, envié por vía correo a Andrea Peñaloza y Marcela García , por si es que no se carga en este link.','Huapicana@gmail.com','Carla ','109878480',NULL,24,8),
		 * 		(410,'2015','Leiva','Flores',0,1,'2019-03-22 15:35:45','Mi tesis ya fue entregada a mi profesor guía. Actualmente me encuentro a la espera de sus comentario finales y trabajando en la conclusión. Elevo esta solicitud, luego de que la coordinadora del magíster, Isabel Jara, determinara darme hasta la primera semana de mayo, luego de haber visto un resumen y de haber hablado con mi profesor guía, Sebastián Vidal. Para cumplir tal plazo, necesito matricularme.','mfloresl@ug.uchile.cl','Mariairis','17533999-k',NULL,6,5),
		 * 		(411,'2011','Diaz','Lopez',1,1,'2019-03-22 19:47:10','El 18 de diciembre de 2018 ingresé mi solicitud a través de esta misma plataforma para determinar qué modalidad aplica para mi caso, considerando que estoy egresada, con certificado de egreso oficial del año 2013 adjunto y me encuentro avanzando en mi tesis con entrega antes de julio de este año','carolopezd@gmail.com','Paula Carolina','100363909',1424,7,10)
				'412', '2016', 'Cayuela', 'Weinstein', '1', '1', '2019-03-26 14:06:07', 'Solicita prórroga según indica documento adjunto', 'luisweinstein@gmail.com', 'Luis', '6784594-3', '1428', '7', '5'
				'413', '2010', 'SolicitudAcademica C', 'SolicitudAcademica B', '1', '1', '2019-03-26 16:58:34', 'SolicitudAcademica ASolicitudAcademica ASolicitudAcademica ASolicitudAcademica A', 'a@mm.cl', 'SolicitudAcademica A', '1-9', '1430', '5', '11'
				'414', '2014', 'Cerpa', 'Farías', '0', '1', '2019-03-26 19:01:16', 'Solicito a la Escuela de Postgrado de la Universidad de Chile una prórroga para poder entregar mi tesis dentro del año académico 2019, esto debido a motivos de trabajo, salud y asuntos personales que retrasaron el término del doctorado dentro de los plazos establecidos por la Universidad. Quedo atenta y esperando que eta solicitud sea bien acogida, atentamente Maritza Farías Cerpa.  ', 'marifacer@gmail.com', 'Maritza', '15349302-2', NULL, '1', '5'
				'415', '2014', 'Órdenes', 'Sanhueza', '0', '1', '2019-03-26 21:38:49', 'Por medio de la presente solicito la prórroga para la entrega de mi tesis doctoral. Por motivos de trabajo principalmente, asociado a mi desempeño académico en nuestra misma casa de estudios (Departamento de Psicología, Facultad de Ciencias Sociales), el desarrollo de mi investigación ha tardado más de lo proyectado originalmente. Mi compromiso es dar término a la investigación durante el presente año. ', 'danilosanhueza@gmail.com', 'Danilo Esteban', '15509677-2', NULL, '1', '5'
				'416', '2014', 'moggia', 'garcía', '0', '1', '2019-03-27 14:57:44', 'Me encuentro finalizando la escritura de mi tesis, con miras a entregarla durante el mes de mayo. A lo que debo añadir que    estoy embarazada de siete meses.', 'macarenagarciamoggia@gmail.com', 'macarena', '15098634-6', NULL, '1', '5'
				'417', '2019', 'Madariaga', 'Mandujano', '1', '1', '2019-03-27 15:30:16', 'He tenido un problema familiar y económico (deudas impagas de operaciones  de mi madre en el Hospital de la Universidad de Chile) por el que me veo obligado a renunciar a mi calidad de alumno en dicho curso, para cubrir los cheques de dicha deuda.  Yo pagué un año completo del Postítulo al contado con el descuento $ 2.806.986, y mi preocupación es recobrar lo más posible el dinero, comprendo que la matrícula no se devuelva, por esto es que quisiera darme de baja lo antes posible para ya no ser considerado alumno, que el tiempo no pase y que se me pueda reembolsar lo demás. El problema es que mi madre arrastra un problema de salud que ha derivado en numerosas cirugías los último años, las que hemos financiado en familia. Ahora hay un cheque en abril por 4.000.0000 que hay que cubrir. ', 'ricardomandujano@gmail.com', 'Ricardo ', '13.270.843-6', '1432', '12', '8'
				'418', '2014', 'aránguiz', 'kong', '1', '1', '2019-03-27 16:03:54', 'Solicito prórroga para la entrega de mi tesis, que ya se encuentra en su etapa final de redacción. La demora se ha debido sobre todo a modificaciones importantes en la formulación luego de la estadía de investigación realizada en París, a fines del 2017 y principios del 2018. He mantenido comunicación con mi tutor (Profesor Miguel Ruiz) y he recibido buena retroalimentación de su parte respecto a los avances de mi trabajo. adjunto un capítulo de mi tesis como muestra. ', 'felipekaranguiz@gmail.com', 'felipe esteban', '16742984K', '1433', '1', '5'
				'419', '2011', 'Chaves', 'López', '0', '1', '2019-03-29 14:56:43', 'Recibí una carta donde se me notificaban la eliminación del programa, por efectos de tiempo de permanencia en el plan de estudios. En acuerdo con mi profesor guía, Federico Galende, y en virtud de los avances de mi tesis, que representan el 70%, quisiera solicitar mi reincorporación. ', 'plopess@gmail.com', 'Paz', '15464926-3', NULL, '1', '2'
				'420', '2001', 'Moreno', 'Araya', '0', '1', '2019-03-30 16:26:10', 'Estimadas/os.  Solicito por favor una reincorporación al programa en el contexto de estar en mi finalización de tesis doctoral, tema conversado explícitamente con  el coordinador y mi profesor guía. Quedo atento a cualquier consulta o solicitud a carlosarayam@gmail.com Saludos cordiales.', 'carlosarayam@gmail.com', 'Carlos Alberto', '15.679.284-5', NULL, '1', '2'
				'421', '2013', 'Hidalgo', 'Retamal', '0', '1', '2019-04-01 21:19:02', 'Solicito inscribir la tesis.', 'jerehi@gmail.com', 'Jorge', '15.428.571-7', NULL, '1', '9'
				'422', '2018', ' Palma', 'Cancino', '0', '1', '2019-04-03 13:54:34', 'Estimados necesito certificado de alumno regular para justificar estudios ante Fondo Solidario de PUCV para su postergación ', 'ignaciocp@gmail.com', 'Jorge Ignacio ', '165750411', NULL, '6', '10'
		**/

		System.out.println("academica[j]:"+i);

		for(int j=0; j< arreglo.length; j++){
			if(arreglo[j]!=null && arreglo[j].getIdSolicitudAcademica()>0){
				try{
					factoryServicioDAO.getSolicitudAcademicaServicio().crearSolicitudAcademicaDTO(arreglo[j]);
				}catch(Exception e){
					System.out.println("rechazo["+j+"] ->"+arreglo[j].getIdSolicitudAcademica());
					e.printStackTrace();
				}
			}


		}



	}


	public void crearSolicitudPostulacionTest(){
		objLog.info("crearSolicitudPostulacionTest");

		SolicitudPostulacionDTO[] arreglo = new SolicitudPostulacionDTO[1000]; 

		int i=0;


		arreglo[i] = new SolicitudPostulacionDTO(146, "2017", "Alfaro", "Trujillo", "976178524", "Santiago", null, "Av. José Pedro Alessandri 1993 depto a-26", "Universidad Academia de Humanismo Cristiano", 1, "20-04-1993", AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-03 14:20:24"), null, "Ahorros y familiar", "En mi formación universitaria, búsqueda internet", "cltrujilloalfaro@gmail.com", "chilena",	 "Cesar", "cesante", "Chile", "Av. Condell 343, Providencia", "18366079-9", "Antropólogo", 1208, 303, 62); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(147, "2015", "Hernández", "Bachmann", "979548355", "Santiago", null, "Agustinas #1569, depto. 44", "Pontificia Universidad Católica de Valparaíso", 1, "9/03/1983",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-03 20:34:58"), null, "ahorros personales", "por internet", "katherine.bachmann.h@gmail.com", "chilena", "Katherine", "profesora", "Chile", "Valparaíso", "15.530.525-8", "Profesor de música", 1211, 323, 53); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(149, "2015", "Rosas", "Núñez", "944458441", "Santiago", null, "Av. Antonio Varas #1414 Depto. 91", "Universidad de Chile", 1, "25/03/1987",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-06 12:16:44"), null, "Propias", "Internet", "zapatosdetaco@gmail.com", "Chilena", "Daniela", "Antropóloga Social de la Academia de la Lengua y Cultura Mapuche en Contexto Uurbano", "Chile", "Chile", "164350665", "Antropóloga Social", 1221, 310, 55); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(150, "2015", "Rosas", "Núñez", "944458441", "Santiago", null, "Av. Antonio Varas 1414, depto. 91", "Universidad de Chile", 1, "25 de marzo 1987",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-06 15:13:40"), null, "Propia", "Página web", "zapatosdetaco@gmail.com", "Chilena", "Daniela ", "Antropóloga de Academia de la Lengua y Cultura Mapuche", "Chile", "Chile", "164350665", "Antropóloga Social", 1224, 310, 55); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(151, "2016", "Marilican", "Peña", null, null, null, null, "Universidad de Concepción", 1, "14/09/1992",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-08 17:55:49"), null, null, null, "felpena.pena@gmail.com", null, "Felipe", null, null, null, "18145856-9", "Antropólogo con mención en Antropología Física", 1226, 0, 54); i = i+1; 
		arreglo[i] = new SolicitudPostulacionDTO(152, "2016", "salvatierra", "peña", "+56972105917", "concepción", null, "la cantera 252 villuco", "universidad de concepción", 1, "10/09/1990",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-10 13:33:13"), "3185854", "propias", "a través de este sitio web", "javipsalvatierra@gmail.com", "chilena", "javiera ", "encargada de control de gestion", "chile", "concepción", "173488432", "ingeniera comercial", 1227, 147, 62); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(153, "2013", "Vio", "De Giovanni", "00393489211829", "Bologna", null, null, "Alma Mater Studiorum", 1, "12-11-1990",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-10 16:37:10"), "00393489211829", "El trabajo que hice hasta ahora", "Una amiga", "degiogre@gmail.com", "italiana", "Greta", "Empleada en un Museo", "Italy", "Bologna, Italia", "YA9450501", "Licenciatura en Arte", 1228, 0, 55); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(154, "2011", "Shea", "Ruiz", "963200209", "Valdivia", "Esta es una repostulación. El programa ya fue cursado. Sólo falta la entrega y defensa de la tesis", "Pedro Montt 2175", "Universidad Mayor", 1, "11-02-1986",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-10 18:48:34"), "963200209", "Ya fueron pagados los dos años de estudio.", "Es una repostulación. Ya cursé el programa", "franciscaru@gmail.com", "Chilena", "Francisca", "Productora", "Chile", "Santiago de Chile", "17537785-9", "Actriz", 1229, 335, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(155, "2016", "Marilican", "Peña", "+56 9952041853", "Puerto Montt", null, "Pasaje 12 nº 1706 Villa Jardin del Mirador ", "Universidad de Concepcion", 1, "14/09/1992",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-11 17:25:41"), "65 2633960", null, null, "FELPENA.PENA@GMAIL.COM", "CHILENA", "Felipe ", "Consultor ", "Chile", "Concepcion", "18145856-9", "Antropologo, Mencion en Antropologia Fisica", 1230, 242, 54); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(156, "2005", "Muñoz", "Muñoz", "974309205", "Ancud", null, "Eladio Vicuña n°73, Población Raúl Silva Henríquez", "Universidad de Concepción", 1, "20/06/1982",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-11 19:25:12"), "974309205", "propias", "diario de circulación provincial e internet", "soniasoledadmunoz@gmail.com", "Chilena", "Sonia Soledad", "Encargada de Proyectos y Coordinación Cultural, Cirporación Cultural Municipal de Ancud", "Chile", "Concepción", "15287771-4", "Socióloga. Licenciada en Sociología", 1231, 225, 59); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(157, "1994", "Fernández", "Vicentela", "+56942881067", "Valparaíso", null, "Las Lomas 241 Curauma Valparaíso", "DUOC", 1, "23-03-1971",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-11 19:44:13"), "322461207", "beca colaborador INACAP", "web", "cvicentela@inacap.cl", "chilena", "Cristina", "Coordinadora de Vinculación con el Medio INACAP Valparaíso", "Chile", "Viña del Mar", "10343904-3", "Relacionador Público", 1232, 75, 60); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(158, "1994", "Fernández", "Vicentela", "+56942881067", "Valparaíso", null, "Las Lomas 241 Curauma Valparaíso", "DUOC", 1, "23-03-1971",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-11 19:49:19"), "322461207", "beca colaborador INACAP", "web", "cvicentela@inacap.cl", "chilena", "Cristina", "Coordinadora de Vinculación con el Medio INACAP Valparaíso", "Chile", "Viña del Mar", "10343904-3", "Relacionador Público", 1233, 75, 60); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(159, "2018", "Benavides", "Padilla", "51-1-961545813", "Lima", "Reingreso para homologacion y sustentar la tesis ", "Residencial Santa Cruz, Block E, Dpto 202, San Isidro", "Universidad de Chile", 1, "02 octubre 1968",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-11 22:34:11"), "51-1-961545813", "propias", "Estudiaba en la facultad de artes", "padilla_abraham@yahoo.com", "peruana", "Abraham", "Musico", "Peru", "Santiago Centro", "14.587.979-5", "Licenciatura en Composicion", 1234, 0, 67); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(160, "2006", "Sepúlveda", "Moraga", "+56979304270", "Santiago", null, "Diagonal Paraguay 265 of 1001", "Universidad de Chile", 1, "01/07/1982",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-12 04:18:52"), "229781013", "Ahorros personales", "A través de la consulta sobre el devenir del MAC", "anamariamoraga@u.uchile.cl", "Chilena", "Ana María", "Coordinadora- Investigadora Consulta MAC U. Chile", "Chile", "Santiago, Chile", "151577318", "Licenciada en Gobierno y Gestión Pública", 1235, 0, 49); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(161, "2016", "Leal", "Blanco", "+56949665962", "Santiago", null, "Blanco encalada 1727", "Universidad Autónoma de Bucaramanga", 1, "25-03-1991",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-12 20:31:42"), "+56949665962", "Propia", "Familiar", "ximena.blanco@gmail.com", "colombiana", "Rosa", "Estudiante postítulo", "Chile", "Colombia", "25850633-2", "Maestro en música", 1237, 323, 48); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(162, "2007", "Castro", "Jiménez", "990014153", "Santiago", "Soy egresada del magister el año 2011 y quiero titularme ", "La Giralda 1865", "IP La Casa", 1, "31-01-1966",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-12 22:25:31"), "227788378", "sueldo fijo", "soy egresada", "alesiempre@gmail.com", "Chilena", "Alejandra", "Directora Ejecutiva El Circo del Mundo - Chile", "Chile", "Barrio República", "10061430-8", "Actriz Profesional", 1238, 303, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(163, "2011", "Gutierrez", "Arrieta", "+56983752811", "Santiago", null, "Brown Norte 76, Depto. 201", "Pontificia Universidad Católica de Chile", 1, "23 de enero de 1984",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-12 23:44:45"), null, "Mi fuente de finaanciamiento es mi trabajo como arquitecta, en una sociedad y como independiente.", "Por una ex alumna de la escuela de Artes de la Universidad de Chile", "pamela.arrieta.arq@gmail.com", "Chilena", "Pamela Andrea", "ejercicio profesional independiente de la Arquitectura", "Chile", "Campus Lo Contador, Providencia, Santiago.", "153333750", "Titulo de arquitecta", 1239, 303, 54); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(164, "2007", "Aguayo", "Aguayo", "997969040", "Santiago", null, "San Gumercindo 3909", "Universidad de Concepción", 1, "17-07-73",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-13 02:35:54"), "997969040", null, null, "gaatome@gmail.com", "Chilena", "Gloria ", "Planificación BAJ. Levantamiento de procesos Consultora SurLatina. Administración y finanzas Red de Mediación Artística ", "Chile", "Concepción", "123209532", "Licenciada en Artes ", 1240, 314, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(166, "2014", "Duque", "Arango", "+57 3007880868", "Bogotá", null, "Av 28 N° 39-06", "Universidad Nacional de Colombia", 1, "30 de diciembre de 1991",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-13 16:17:29"), "+57 3007880868", "Recursos propios y apoyo familiar.", "Pagina web de la universidad", "varangod@unal.edu.co", "Colombiana", "Viviana", "Gestora de Innovación social y Extensión solidaria", "Colombia", "Palmira, Valle del Cauca, Colombia.", "AN679288", "Diseñadora Industrial", 1247, 0, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(167, "En trámite", "Pérez", "Pizarro", null, null, null, null, "Universidad Finis Terrae", 1, "08/06/1980",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-13 16:47:03"), null, null, null, "lajosepizarro@gmail.com", null, "María José", null, null, null, "15522608-0", "Actriz", 1248, 0, 57); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(168, "2008", "Langenbach", "Schwerter", "990614353", "Rio Bueno", null, "Independencia 1436", "Universidad Austral de Chile", 1, "13/12/1984",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-13 18:02:13"), "642340389", "Autofinanciamiento", "Por internet", "catalizando@gmail.com", "chilena", "Carolina", "Asesora y gestora cultural", "catalizando@gmail.com", "Valdivia", "15882442-6", "Antropóloga,lic. en antropología", 1249, 0, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(169, "2007", "Aguayo", "Aguayo", "997969040", "Santiago", null, "San Gumercindo 3909", "Universidad de Concepción", 1, "17-07-73",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 01:41:03"), "997969040", null, null, "gaatome@gmail.com", "Chilena", "Gloria", "Planificación BAJ, Levantamiento procesos Consultora SurLatina, Administración y Finanzas Red de Mediación Artística ", "Chile", "Concepción", "12320953-2", "Licenciada en Artes", 1250, 314, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(170, "En trámite", "Alvarado", "Devia", "+56988235103", "Santiago", null, "Maturana 750 depto 405b", "Liceo Dario Salas Puerto Montt", 1, "16/10/1990",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 04:29:02"), null, "Músico sesionista, profesora de instrumento y gestión de proyectos", "Internet", "pvdevia@gmail.com", "Chilena", "Paulina", "Músico", "Chile", null, "17.631.230-0", "Licenciada enseñanza Media", 1251, 323, 65); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(171, "En trámite", "Alvarado", "Devia", "+56988235103", "Santiago", null, "Maturana 750 depto 405b", "Sin Grado académico", 1, "16/10/1990",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 14:42:12"), null, "Músico, monitora de instrumento y gestión", "Internet", "pvdevia@gmail.com", "Chilena", "Paulina", "Músico", "Chile", null, "17.631.230-0", "Egresada 4º Medio", 1252, 323, 65); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(172, "1994", "Diaz", "Lopez", "56996796256", "Santiago", "Estoy postulando para poder retomar mi condición de Candidata al grado de Magister en Gestión Cultural, puesto que actualmente estoy al día en los aspectos económicos de la carrera, asi como también con todos los créditos del programa, incluyendo las horas de práctica y los certificados de egreso y de notas con sus estampillas oficiales. Solo me queda terminar el porcentaje de tesis pendiente, cuyo título es: Diplomacia Cultural en Chile: Recursos de Cooperación para Gestores Culturales", "Cueto 530, Barrio Yungay", "INACAP", 1, "16/11/1965",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 17:34:03"), "56223303365", "Propios", "Portal web de la Universidad de Chile, buscando, navegando por internet", "carolopezd@gmail.com", "Chilena", "Paula Carolina", "Asistente Asuntos Culturales: Encargada de Programas de Intercambio y Asistente de Programas Culturales", "Chile", "Sede Colón, Padre Hurtado", "100363909", "Comunicadora Social", 1254, 323, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(173, "2018", "Julio", "Gallardo", "9 45136799", "Santiago", null, "Brown Sur 333, Depto 211", "Universidad Finis Terrae ", 1, "25 de noviembre, 1994",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 19:57:54"), "9 45136799", "Autofinanciamiento, trabajo en UFT y otros", "Por Docentes de la Universidad Finis Terrae", "tatianajulio.9@gmail.com", "Chilena", "Tatiana", "Docente asistente en el área teórica de la Universidad Finis Terrae ", "Chile", "Pedro de Valdivia 1642, Providencia", "189076509", "Licenciada en Artes Visuales ", 1257, 303, 47); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(174, "2016", "Coca", "Ibera", "998403087", "Puerto Aysén", null, "Eleuterio Ramirez #1060", "Universidad de Concepción", 1, "10/06/1992",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 21:38:54"), "998403087", "Crédito", "Internet", "carolinaibera@gmail.com", "Chilena", "Carolina", "Fonoaudióloga", "Chile", "Concepción", "18.217.787-3", "Fonoaudióloga", 1258, 255, 55); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(175, "2009", "Caberletti", "Toro", "9-84490204", "Santiago", null, "Jorge Matte Gormaz Nro. 2462, depto. 401, Providencia", "Universidad Pedro de Valdivia", 1, "03.06.1961",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 22:03:20"), null, "Remuneraciones mensuales", "Referencias y sitio web", "torocaberletti@gmail.com", "chilena", "Claudia", "Funcionaria pública", "Chile", "Providencia-Santiago", "8969776k", "Licenciada en Comunicación Social y Periodista", 1259, 0, 49); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(176, "2011", "Gabriela Alamo", "Alamo", null, "Santiago", "Por favor permítanme re-postular al programa de Magíster de Gestión Cultural, pudiendo ofrecer mi tesis y optar al grado. Muchas gracias. ", null, "Universidad del Pacífico", 1, "18-03-1988",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-14 23:32:30"), "+569 3225 2552", "Trabajo", "Programa cursado en 2015-2016", "g.alamopalma@gmail.com", "Chilena", "Gabriela", "Asistente Dirección Ejecutiva, Centro Cultural Gabriela Mistral (GAM)", "Chile", "Santiago, Las Condes", "16609058k", "Publicista", 1261, 293, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(177, "1990", "ESPIÑEIRA", "RIVEROS ", "963074100", "SANTIAGO", null, "DARIO URZUA 2051 DEPTO 102", "UNIVERSIDAD CATÓLICA DE CHILE", 1, "24.09.1965",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-15 01:28:02"), null, "PERSONAL", "INTERNET", "catalina.rives@gmail.com", "CHILENA", "MARIA CATALINA", "PROFESIONAL ÁREA FORMACIÓN DOCENTE CPEIP", "CHILE", "SANTIAGO", "60536228", "PROFESORA DE EDUCACIÓN GENERAL BÁSICA", 1264, 310, 55); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(178, "2010", "N/A", "TSAI", "931814622", "Santiago", null, "Estoril 707 depto c3", "Shin Hsin University", 1, "27/05/1988",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-15 01:33:26"), "224532352", "Ahorro personal, cuenta bancaria", "online", "jintsai12@gmail.com", "TAIWAN", "CHIN FONG", "SR. ECOMMERCE GLOBAL MARKETING MANAGEMENT", "chile", "Taiwan", "308808995", "BA-Digital multimedia design", 1265, 295, 52); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(179, "1989", "Guarda", "Rodríguez", "961923979", "Futrono", null, "Valentin Monsalve 100", "Colegio Santa Cruz", 1, "19/10/1971",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-15 03:07:46"), "961923979", "Ingresos Propios", "Amiga", "huapicana@gmail.com", "Chilena", "Carla Jimena", "Emprendedora Social", "Chile", "Santiago", "10987848-0", "Licencia Ed Media", 1266, 328, 65); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(180, "2017", "Olave", "Espinoza", "9 869 869 96", "San Sebastián", "ninguna", "Séptima Ote. playa ?19", "Universidad Alberto Hurtado", 1, "22 julio 1983",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-15 16:25:11"), "9 869 869 96", "Beca Conicyt ", "Estudié dos años teoría e historia del Arte, ahí me enteré", "casafrecuencias@gmail.com", "Chilena", "Karen", "Docente", "Chile", "Almirante Barroso 10, Santiago", "15341536-6", "Grado académico de Licenciada en Psicología, Título Profesional Psicóloga", 1268, 44, 49); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(181, "2012", "RIVERA ", "CASTILLO ", "2224698581", "PUEBLA ", null, "33 ORIENTE 2803 COL. JOSÉ LÓPEZ PORTILLO", "U. VERACRUZANA ", 1, "02-09-1980",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-15 17:22:41"), "2224698581", "BECA ", "INTERNET", "ivancastillorivera@gmail.com", "MEXICANA ", "IVAN ", "MAESTRO", "MÉXICO", "XALAPA, VER. MÉXICO ", "G29578092", "LICENCIATURA ", 1269, 0, 50); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(182, "1989", "Guarda", "Rodriguez", null, "Futrono", "No considerar postulación anterior, faltaban docs. Esta es la oficial", "Valentin Monsalve 100", "Colegio Inmaculada Concepción", 1, "19/10/1971",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-15 19:56:38"), "961923979", "Ingresos Propios", "Amiga", "huapicana@gmail.com", "Chilena", "Carla", "Emprendedora", "Chile", "Valdivia", "10987848-0", "Lic Ed Media", 1271, 328, 65); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(183, "2014", "Fischer", "Gaete ", "+56961423115", "Linares", "Adjunto cartas de recomendación U. Autónoma y Museo de Linares", "Diputado Mario Dueñas 678", "Universidad Autónoma de Chile", 1, "04/05/1984",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-15 20:46:31"), null, "Postulante a beca Conicyt / Financiamiento privado", "compañera de estudios", "caro.gaete.fischer@gmail.com", "chilena", "Carolina", "Artista Visual, Orfebre", "Chile", "Talca", "15.747.276-3", "Licenciada en Artes, Profesora de Artes, Licenciada en Educación", 1272, 121, 49); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(184, "2012", "Reyes", "Fernandez", "942301430", "san fernando", null, "negrete 1075", "Instituto Profesional Arcos", 1, "25/04/1986",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-15 21:05:32"), null, null, null, "marcela.fernandez@ug.uchile.cl", "chilena", "Marcela", "gestora cultural", "chile", "Santiago", "163093235", "Actriz profesional", 1273, 0, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(185, "2010", "Díaz", "Ramallo", "998554696", "Santiago", "-", "Huérfanos 1919, depto 55A", "Universidad Mayor de San Andrés", 1, "26-03-1988",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-15 23:00:33"), "226984995", "Financiamiento propio", "Internet", "cecy.ramallo@u.uchile.cl", "Chilena", "Cecilia del Carmen", "Historiadora", "Chile", "La Paz, Bolivia", "23379086-9", "Licenciada en Historia", 1275, 323, 67); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(186, "2017", "Landeros", "Contreras", "+56 9 98405978", "Santiago", null, "República de Cuba 2601", "Universidad Finis Terrae", 1, "11.12.1974",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-16 00:13:58"), "+56 2 27254007", "Propios", "Ex Alumna", "tamara.contreras.landeros@gmail.com", "Chilena", "Tamara Alejandra", "Estudiante Pedagogía en Educación Media, UFT", "Chile", "Providencia, Santiago", "128255958", "Licenciada en Artes Visuales, Mención Pintura", 1276, 310, 47); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(187, "2017", "Peragallo", "Sepúlveda", "959327012", "santiago", "Me interesa desarrollar el área investigativa y formación académica, ya que me gustaría contribuir de este modo a la humanidad  ", "Nueva Colon #1123", "Universidad Academia de Humanismo Cristiano", 1, "03 de enero de 1992",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-16 00:35:59"), "227354826", "postulando a beca Conicyt", "investigando acerca de magister que se adecuaran a mis intereses investigativos ", "j.sepulveda.peragallo.c@gmail.com", "Chilena", "Javiera", "psicóloga programa PIE colegio", "Chile", "Providencia", "18305509-7", "psicóloga, licenciada en psicología ", 1277, 287, 49); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(188, "2017", "Almonacid", "Cárdenas", "+56994571627", "Villa alemana", null, "arreglo[i] = new SolicitudPostulacionDTO(18nda #0211, casa 5", "Universidad de Playa Ancha", 1, "24/05/1991",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-16 02:34:51"), null, "Propio", "Por la página web", "gonzalocardenas24@hotmail.com", "Chilena", "Gonzalo", "Cesante", "Chile", "Valparaiso", "17.626.905-7", "Licenciado en sociología", 1278, 76, 49); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(189, "2016", "Oyarzún", "Campos", null, null, null, null, "Universidad de Chile", 1, "18/11/1988",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-16 16:26:32"), null, null, null, "daniela3831@gmail.com", null, "Daniela", "Profesora de Música", null, null, "17043763-2", "Profesora de Educación Media mención en Artes Musicales", 1280, 0, 65); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(190, "2017", "Sepúlveda", "Escare", "999724588", "Rancagua ", "envío con toda la fé hoy mi inscripción ya que hasta ayer no pude por viaje, espero por favor la consideren", "Villa Nueva Alameda pje. Asela Práxedes #0380 ", "Universidad Aurónoma de Chile", 1, "16/11/1987",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-17 02:59:46"), "732626634", "mi sueldo de 820.000 líquido", "Por internet", "natadivie@gmail.com", "Chilena", "Natalia", "Profesora de Artes Visuales ", "Chile", "Talca", "167930409", "Profesora de Artes Visuales", 1281, 105, 55); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(191, "2004", "Martínez", "Valle", "989063541", "quilpué", "Tengo que hacer este trámite para dar mi examen de grado.", "Los álamos 921 depto. E31 Condominio Los Naranjos 3 Quilpué", "Pontificia Universidad Católica de Valparaíso", 1, "04-03-1979",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-17 21:49:22"), "32 2274132", "mi trabajo en la universidad", "web comentario de colegas", "valeriazul79@gmail.com", "Chilena", "Valeria Gisel", "academica de la PUCV", "chile", "Valparaíso", "13.634.338-6", "Profesora de Música/ licenciatura en ciencias y artes musicales, licenciatura en educación", 1283, 67, 48); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(192, "2017", "Almonacid", "Cárdenas", "+56994571627", "Villa alemana", null, "Aranda #0211, casa #5", "Universidad de Playa Ancha", 1, "24/05/1991",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-18 15:43:48"), null, "Propio", "Por la página web", "gonzalocardenas24@hotmail.com", "Chilena", "Gonzalo", "Cesante ", "Chile", "Valparaiso", "17.626.905-7", "Licenciado en sociología", 1287, 76, 49); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(193, "2017", "Cueto", "Cueto ", "994417903", "Algarrobo", null, "El Olmo Nº 1720", "Universidad Andrés Bello", 1, "09-01-1995",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-27 12:45:49"), "994417903", "Salario ", "Internet", "damianjcueto@gmail.com", "chileno", "Damián ", "Profesor de Educación Musical", "Chile", "Casona Las Condes", "18.761.302-7", "Profesor de Educación Musical para la Educación Pre-Escolar y Básica", 1293, 41, 62); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(194, "2011", "Saavedra", "Garrido", "942580544", "Los Ángeles", null, "Indira Gandhi sitio 2B parque residencial Doña Isidora", "Universidad Adventista de Chile", 1, "16-03-86",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2018-12-28 14:37:51"), "432232906", "Trabajo y Padres", "Internet", "lorenagarridosaavedra@gmail.com", "Chilena", "Lorena Verónica", "Profesora de Música", "Chile", "Chillán, Chile", "16204621-7", "Profesor de música y licenciada en Educación", 1294, 163, 50); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(195, "2008", "APARICIO", "VALVERDE ", "+56 9 71550879", "CHILLAN", null, "LOS BOLDOS 876", "ARTURO PRAT", 1, "13-10-1984",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-03 17:01:12"), "42-2464059", null, "INTERNET", "jeannecita@gmail.com", "CHILENA", "JEANNETTE", null, "CHILE", "CHILLAN", "15.875.764-8", "PROFESOR GENERAL BASICA", 1299, 148, 47); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(196, "1994", "Diaz", "Lopez", "56996796256", "Santiago", "Tengo la inquietud sobre si podré acceder a un arancel reducido, puesto que cuento con el Certificado de Egreso del Magister solo necesito completar y entregar la Tesis", "Cueto 530, Barrio Yungay", "INACAP", 1, "16/11/1965",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-04 15:43:19"), "56223303365", "Propios, salario y ahorros personales", "Buscando la mejor casa de estudios donde imparten el Magister en G.C.", "carolopezd@gmail.com", "Chilena", "Paula Carolina", "Asistente Cultural y Coordinadora de Programas de Intercambio", "Chile", "Las Condes, Santiago", "100363909", "Profesional: Comunicador Social con Mención en Relaciones Públicas", 1300, 323, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(197, "2012", "Navarrete", "Salinas", null, null, null, null, "Escuela Moderna de Música y Danza", 1, "21-01-1986",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-04 17:11:02"), null, null, null, "f.salinas.navarrete@gmail.com", null, "Felipe", null, null, null, "16102615-8", "Especialista en Arreglos y Composición en Música Popular", 1301, 0, 53); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(198, "2012", "Navarrete", "Salinas", null, null, null, null, "Escuela Moderna de Música y Danza", 1, "21-01-1986",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-04 20:05:54"), null, null, null, "f.salinas.navarrete@gmail.com", null, "Felipe", null, null, null, "16.102.615-8", "Especialista en Arreglos y Composición de Música Popular", 1302, 0, 53); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(199, "2012", "Carvacho", "Ríos ", "944610619", "Santiago", null, "Pasaje Miguel de Cervantes # 486", "Universidad Mayor", 1, "28/05/1981",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-07 14:16:36"), "228862990", "Colegio Filipense", "Profesor Romilio Orellana me comento.", "profesordemusica2015@gmail.com", "Chilena", "Miguel Ángel ", "Docente", "Chile", "Vespucio", "141608738", "Profesor de Artes Musicales para Educación Básica y Media  ", 1303, 285, 53); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(200, "2016", "Noack", "Dinamarca", "957243317", "Viña del Mar", "Me encantaría cursar este diplomado ya que trata de una materia central para lo que fue mi tesis de pregrado, y que espero siga siendo piedra angular de mi carrera profesional, el patrimonio.", null, "Universidad de Playa Ancha", 1, "27-11-1992",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-08 16:54:15"), null, "Sueldo fijo", "Buscando postgrados por internet", "andresdinamarca.n@gmail.com", "Chilena", "Andrés ", "Profesor de Liceo", "Chile", "Valparaíso", "18298720-4", "Profesor de Historia y Geografía", 1304, 77, 60); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(201, "2015", "Muñoz", "Fuentes", "(+569)92999423", "Santiago", null, "Lincoyán 1050 dpto 405", "Universidad de Chile", 1, "20/07/1985",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-08 20:56:07"), null, "propias", "A través de una profesora de la facultad de artes", "fuentes.m.dani@gmail.com", "chilena", "Daniela ", null, "Chile", "Plaza Ercilla 833", "16124616-6", "Geóloga", 1305, 303, 54); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(202, "2009", "contreras", "Villalobos", "984571468", "santiago", "estoy a la expectativa de su respuesta ya que me interesa mucho este postgrado de antemano muchísimas gracias ", "pasaje 1410", "Escuela de Bellas Artes Macedonio de la Torre", 1, "06/09/1981",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-09 22:56:37"), "984571468", "trabajo en Colegio de basica", "a través de la pagina de la universidad", "jetaimecleodear@hotmail.com", "Peruana", "ibiss lourdes", "Profesora de Artes", "Chile", "Trujillo - Perú", "251232296", "Profesora de Educación Artistica mención Dibujo y pintura", 1307, 317, 55); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(203, "1994", "CANDIA", "ALARCON", "989220556", "villa alegre", null, "raul pino 246", "liceo agricola ", 1, "02-01-1975",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-10 13:23:19"), "989220556", "propias", "via web", "ralarconc@villalegre.cl", "CHILENA", "RANDOLFO FABIAN", "gestor cultural", "chile", "villa alegre", "12.131.718-4", "tecnico agricola", 1308, 140, 65); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(204, "2013", "Clavijo", "Palacio", "573123008642", "Bogota", "https://cosasyproyectos.webnode.com.co/ (pagina Web)", "Colombia", "Universidad Distrital Francisco José de Caldas ASAB ", 1, "20/08/1987",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-15 06:33:14"), "573034102", "Beca Jovenes Talento Banco de la República Bogotá ", "Internet", "palacioclavijo@gmail.com", "colombiano", "Henry Alexander", "Docente", "colombia", "Bogotá colombia", "AN931614", "Maestro en Artes Plásticas y Visuales", 1311, 0, 47); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(205, "2018(mitad)", "Fernández", "Apablaza", "+569 59100002", "santiago", null, "Domingo Gomez Rojas 0892", "Universidad Finis Terrae", 1, "14 de diciembre de 1992",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-16 16:04:06"), null, "personales y familiares", "investigando sobre temas de gestión cultural", "ignacioapablazaf@gmail.com", "chilena", "Ignacio Iván", "Sin Ocupación", "chile", "En Av. Pedro de Valdivia con Pocuro", "184685116", "Licenciado en Historia mención comunicación estratégica", 1312, 283, 62); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(206, "2015", "Ibaceta", "Becerra", "955253093", "Santiago", null, "Manuel Antonio Maira 1011 - N", "Universidad Central de Chile", 1, "20/08/1987",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-17 13:09:27"), "955253093", "Trabajador dependiente en el Sector Público", "Por internet", "mbecerraibaz@gmail.com", "Chilena", "Marcel Andrés", "Profesional en la Facultad de Artes de la Universidad de Chile", "Chile", "Santiago de Chile", "16729449-9", "Administrador Público - Licenciado en Gestión Pública", 1314, 310, 62); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(207, "2015", "basoalto", "sepúlveda", "+56975878450", "santiago", null, "Pedro de villagra 2457.", "Universidad Diego Portales", 1, "23/08/1990",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-17 21:10:23"), "+56975878450", "personal", "por amigos", "irma.sepulvedab@gmail.com", "chilena", "irma rocio", null, "chile", "Republica 180", "17577952-3", "título de artista visual", 1317, 326, 47); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(208, "2018", "Jiles", "Muñoz", "+56976161142", "Santiago", null, "Los Españoles 2259", "Departamento de Teoría de las Artes, Facultad de Artes, Universidad de Chile", 1, "12/11/1993",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-21 01:57:55"), "+56976161142", "Postulación Beca Conicyt", "Pregrado", "gaston.munoz.j@ug.uchile.cl", "Chilena", "Gastón", "Investigación y curatoría independiente", "Chile", "Santiago, Chile", "187664039", "Licenciatura en Artes con Mención en Teoría e Historia del Arte", 1323, 310, 49); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(209, "2017", "Gakneras", "Seghabi", "+56 9 46625930", "Ñuñoa", "Quisiera saber si existen becas o descuentos ya que además de apoyar a mi familia en Venezuela, estoy ayudando a mi hermana a pagar su carrera de Arquitectura en esta misma casa de estudios, próxima a empezar en marzo de este año.", "Av. Sucre 2725, depto 604", "Universidad Monteávila", 1, "21-12-1993",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-21 13:46:09"), "+56 9 46625930", "Mi ingreso salarial", "Investigando opciones de estudios superiores en internet", "jseghabi93@gmail.com", "Venezolano", "Jhonny", "Creador de Contenido Web", "Chile", "Boleita Norte, Caracas, Venezuela", "26219749-2", "Licenciado en Ciencias para la Comunicación e Información", 1326, 303, 53); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(210, "2017", "López", "Tello", "3312888859 (Movil Guadalajara, Jalisco, México)", "Guadalajara, Jalisco", null, "Isla Cancún 248", "Universidad de Guadalajara", 1, "5 de noviembre del 2",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-22 03:21:42"), "3312888859 ", "Mi propio trabajo", "Internet", "joan_tello@hotmail.com", "Mexicano", "Joan Salvador", "Músico ", "México", "Guadalajara,Jalisco,México", "G30290255", "Licenciatura en Música con orientación en Composición", 1328, 0, 48); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(211, "1998", "Bellenger", "Aranda", "940754900", "Coyhaique", null, "Avenida Norte Sur 1074 casa B", "Universidad de Chile", 1, "06/12/1966",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-23 15:27:39"), null, "propias", "Portal Web", "arandabellenger@gmail.com", "chilena", "Claudia", "Administrativo Biblioteca universitaria", "Chile", "Santiago", "9968580-8", "Licenciada en Historia", 1329, 259, 60); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(212, "2000", "martin-posse", "Talhouk", "+56 9 9969 8161", "Santiago", null, "Av. Ricardo Lyon 755 d.23", "Universidad Central", 1, "11/09/1073",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-23 19:29:53"), "+56 9 9969 8161", "Personal", "Internet", "pablo@talhouk.cl", "Chileno", "Pablo", "Arquitecto", "Chile", "Santiago", "103670012", "Arquitecto", 1330, 0, 47); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(213, "2019", "Apala", "Castel", "56-9-75894836", "Santiago", "Mi titulación tuvo lugar en este mismo mes de Enero. Ante esta situación no han sido entregados aún los certificados oficiales. Sin embargo, mi casa de estudios me ha extendido una carta de constancia, y ya se ha hecho una solicitud formal para que los documentos requeridos sean entregados lo más pronto posible.", "Transversal Suarez Mujica 2900. Dpto.64", "Pontificia Universidad Católica de Chile", 1, "14/01/1988",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-24 15:41:46"), null, "Propia", "Por medio de una compañera de estudios", "kmcastel@uc.cl", "Chilena", "Karen", null, "Chile", "Santiago", "169262187", "Licenciatura en artes visuales", 1334, 303, 54); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(214, "2019", "Apala", "Castel", "(56-9)75894836", "Santiago", "Mi titulación se realizó en este mes de Enero. Frente a esta situación no se han entregado los certificados oficiales. Sin embargo, se me ha extendido una carta de constancia por la coordinadora docente,  y se ha solicitado la más pronta entrega de los documentos requeridos.", "Transversal Suárez Mujica 2900, depto 64", "Pontificia Universidad Católica de Chile", 1, "14/01/1988",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-24 22:31:11"), null, "Propia", "Por medio de una compañera de estudios", "kmcastel@uc.cl", "Chilena", "Karen", null, "Chile", "Santiago", "169262187", "Licenciatura en Artes Visuales", 1335, 303, 54); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(215, "2009", "PACHECO", "GALAZ", "995966226", "Santiago", null, "Santos Dumont 190", "USACH", 1, "13/07/1979",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-26 16:04:39"), "995966226", "Privadas", "Colegas", "belem.galaz@gmail.com", "Chilena", "BELEM", "Directora de Proyectos en Gestión Cultural y Educativa", "Chile", "Santiago de Chile", "136821431", "Licenciada en Educación en Filosofía / Profesora de Estado en Filosofía", 1337, 315, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(216, "2019", "SALAZAR", "VIDAL", "983003480", "SANTIAGO", "ADJUNTO CONSTANCIA DE EGRESO, YA QUE MI PROCESO DE LICENCIATURA ESTARÁ LISTO EN EL PERIODO DE MARZO-ABRIL ", "PJE. GERMÁN GARCÉS 1814", "UNIVERSIDAD DE CHILE", 1, "24-06-1994",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-28 01:49:11"), "983003480", "PADRES", "EN CASA DE ESTUDIO", "VALENTINA.VIDAL.S@GMAIL.COM", "CHILENA", "VALENTINA", "ESTUDIANTE", "CHILE", "SANTIAGO", "186692551", "LICENCIATURA EN PROCESO DE EGRESO", 1340, 300, 62); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(217, "2011, 2005.", "Estades", "Dañobeitia", "984147401", "Stgo", null, "Simon Bolivar 5978 dep. 303, La Reina", "Universidad de las Américas, Taller de Musics", 1, "01/02/1974",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-28 15:58:13"), "228912646", "Ahorros, trabajo.", "Internet", "robjazz@gmail.com", "Chile", "Roberto", "Docente, Presidente Fundación Músicos por Chile.", "Chile", "Chile, España.", "8668109-9", "Licenciado en Música", 1341, 293, 62); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(218, "2012", "Jara", "Cornejo ", "56957537979", "Santiago", "He realizado ahorros para costear el magíster, además de tener un trabajo que me permite obtener los ingresos para llevar a cabo el postgrado.", "Santa Isabel 361, Depto. 112", "Universidad Metropolitana de Ciencias de la Educación (UMCE)", 1, "28/05/1989",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-28 18:45:49"), "228563582", "Cuenta Personal", "Por docentes", "lorenzo.cornejo.jara@gmail.com", "Chileno", "Lorenzo Miguel", "Profesor", "Chile", "Ñuñoa, Santiago, R.M.", "17.168.803-5", "Profesor de Educación Musical / Licenciado en Educación", 1342, 0, 67); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(219, "2014", "MORENO", "SALDIAS", "9 45154928", "ANTOFAGASTA", null, "AV. ANTILHUE 01302 DEPTO 406. ED. DON MARCELO", "UNIVERSIDAD CATOLICA DEL NORTE", 1, "21 MARZO 1986",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-28 18:54:30"), "2 27203446", "PROPIA", "INTERNET", "katerinesaldiasm@gmail.com", "CHILENA", "KATERINE", "ARQUITECTO ASESOR PVP SUBDERE", "CHILE", "ANTOFAGASTA", "16.221.956-1", "ARQUITECTO", 1343, 8, 60); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(220, "2007; 1996", "Núñez", "Quezada", "98449192", "Santiago", null, "Eliodoro Yáñez 1049, departamento 303. Providencia", "Pontificia Universidad Católica de Valparaíso", 1, "11/03/1967",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-28 19:05:58"), "98449192", "Mi sueldo y ahorros personales", "Por Internet", "jequenu@gmail.com", "Chilena", "Jessica", "Académica Universidad Alberto Hurtado; Directora de Coros", "Chile", "Valparaíso", "10299785-9", "Intérprete Musical Mención Canto; Licenciatura en Ciencias y Artes Musicales", 1344, 0, 50); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(221, "En trámite", "Palma", "Suárez", "9-72053695", "San vicente de Tagua Tagua", null, "Cristoforo Colombo #318", "ninguno", 1, "29/12/1985",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-28 19:06:16"), "72-2-326880", null, null, "aline.suarez.85@gmail.com", "chilena", "Aline ", null, "Chile", null, "16196422-0", "ninguno", 1345, 110, 65); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(222, "2005", "Casas", "Aramburú ", "+511 990012055", "Lima", null, "Calle Los Meteorólogos 125 La Molina", "Universidad Nacional Mayor de San Marcos", 1, "31/03/1973",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-29 17:39:15"), null, "Propias.", "Por Internet, redes sociales.", "rocioaramburuperu@gmail.com", "Peruana", "Carmen Rocío", "Arqueóloga", "Perú", "Lima", "7063468", "Licenciada en Arqueología", 1348, 0, 60); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(223, "2012", "Jara", "Cornejo", "957537979", "Santiago", null, "Santa Isabel 361, dpto. 112", "Universidad Metropolitana de Ciencias de la Educación (UMCE)", 1, "28/05/1989",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-29 18:34:19"), "228563582", "Cuenta personal", "Por otros docentes", "lorenzo.cornejo.jara@gmail.com", "Chileno", "Lorenzo Miguel", "Profesor", "Chile", "Ñuñoa, Santiago", "17168803-5", "Profesor de Educación Musical / Licenciado en Educación", 1349, 323, 67); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(224, "2014", "MORENO", "SALDIAS", "9 45154928", "ANTOFAGASTA", null, "AV. ANTILHUE 01302 DEPTO 406 ED. DON MARCELO", "2014", 1, "21 MARZO 1986",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-29 18:45:02"), "2 27203446", "PROPIAS", "INTERNET", "katerinesaldiasm@gmail.com", "CHILENA", "KATERINE", "ASESOR PVP SUBDERE", "CHILE", "ANTOFAGASTA", "162219561", "ARQUITECTO", 1350, 8, 60); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(225, "2015", "Allende", "Varas", null, "Rancagua", null, "El Nogal #1320", "Universidad de Talca", 1, "21/03/1991",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-30 00:35:25"), "955165492", "Propio", "Internet", "daniel.varas.allende@gmail.com", "Chilena", "Daniel Rodrigo", "Conservación arqueológica", "Chile", "Talca", "175216170", "Diseñador", 1351, 105, 54); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(226, "2018", "Zaror", "Yarad", "89011342", "Santiago", null, "Camino el cerrillo 2415, linderos. Buin", "Pontificia Universidad Católica", 1, "16/08/1995",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-30 00:54:10"), "89011342", null, "Internet", "mtyarad@uc.cl", "Chilena", "María Trinidad ", "Artista Visual", "Chile", "Campus Oriente", "190814475", "Licenciatura Artes Visuales", 1352, 276, 55); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(227, "2018", "Zaror", "Yarad", "+56989011342", "Santiago", null, "Camino El Cerrillo 2415, Linderos, Buin", "Pontificia Universidad Católica de Chile", 1, "16/08/95",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-30 18:15:44"), null, null, "Internet", "mtyarad@uc.cl", "chilena", "María Trinidad", "Artista Visual", "Chile", "Campus Oriente", "190814475", "Licenciatura en Artes Visuales", 1354, 0, 55); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(228, "2013", "Peña", "Araya", "+569 97331253", "Santiago", null, "Av. Condell 1807, depto. 1803", "Pontificia Universidad Católica", 1, "24/05/1991",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-30 18:56:27"), null, "Propio", "Internet", "auaraya@uc.cl", "Chilena", "Ana Paula", "Asistente de Producción Artística en Teatro Municipal de Santiago", "Chile", null, "17702203-9", "Licenciatura en Artes y Humanidades, Major en Gestión Cultural", 1355, 303, 60); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(229, "2010", "Orellana", "Arroyo", "982438683", "Santiago", "He recibido una formación musical en Guitarra previa a la Licenciatura obtenida en la Universidad de Chile, circunstancia explicada a la Directora del Programa de Magíster en Interpretación Musical en solicitud dirigida a su correo. La Dra. Paulina Zamora me ha invitado a postular online al programa, por recomendación del comité académico, la que será revisada.", "San Luis 6522", "Universidad de Chile", 1, "12 de Diciembre de 1971",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-30 19:06:58"), "982438683", "Beca, trabajo personal", "Consulta a Directora del Programa", "davidiv9@yahoo.es", "Chileno", "David Iván", "Abogado", "Chile", "Providencia, Santiago", "14.427.543-8", "Abogado", 1356, 289, 50); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(230, "2018", "murillo", "duarte", "976493219", "santiago", "He trabajado para juntar el dinero", "psje las lluvias 1603", "Universidad de Chile", 1, "01/06/1994",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-30 22:46:08"), "29801574", "particulares", "En la universidad y via web", "sebastian.duarte@ug.uchile.cl", "chileno", "sebastian", "trabajador", "Chile", "Santiago. Las encinas", "187310865", "licenciado en Artes con mención artes plásticas. actualmente se encuentra en trámite. estará disponible en marzo", 1358, 290, 47); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(231, "2004", "Solari", "Acosta", "961091712", "Santiago", "Entrega de declaración de propósitos y portafolio pendientes", "Estados Unidos 355", "Universidad Finis Terrae", 1, "21 octubre 1979",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-30 22:55:15"), "-", "Privado", "Paula Anguita", "virginia.acosta@gmail.com", "Uruguay", "Virginia", "Artista", "Chile", "Providencia, Santiago", "221110706", "Licenciada en artes plásticas", 1359, 323, 47); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(232, "En trámite", "Luxoro", "Urrutia", "+56974178299", "Santiago", null, "Bremen 239-A Casa C", "Pontificia Universidad Católica de Chile (en trámite)", 1, "19-03-1991",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-30 23:32:37"), "223261250", "Propias", "Recomendación de egresados y docentes", "luxoro.urrutia@gmail.com", "Chilena", "Antonio", "Ayudante de cátedra y tesista", "Chile", null, "17.700.781-1", "Licenciado en Estética (en trámite)", 1360, 303, 49); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(233, "2018", "Perez", "Izquierdo", "983198273", "Santiago", null, "Luis Pasteur 6240", "Universidad Finis Terrae", 1, "14.08.95",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-04 17:45:39"), "983198273", "Padre", "Amigos", "paula.izquierdopc@gmail.com", "Chilena", "Paula", "Ninguna", "Chile", "Av. Pedro de Valdivia 1646", "19081709-1", "Licenciada en Artes Visuales, Mención Pintura", 1370, 326, 48); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(234, "2001", "tripailaf", "sandoval", "988695544", "Iquique", null, "Arturo Fernandez 1371", "Universidad de la Frontera", 1, "09/06/1977",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-05 01:07:28"), null, "Ahorro", "Internet", "tripailaf@hotmail.com", "chilena", "cecilia", "Investigadora Independiente", "chile", "Temuco", "133999876", "Asistente Social", 1371, 5, 54); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(235, "2001", "Nicolet", "Ercilla", "995167347", "Santiago", "Hice el postítulo en Arteterapia en la Universidad de Chile el año 2013 y 2014", "Lonquimay 584", "Universidad de Chile", 1, "23 marzo 1980",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-05 13:25:48"), null, "Doy clases regulares de yoga, talleres de yogadanza y arteterapia", "Por mis compañeros de Universidad", "pazercilla@gmail.com", "Chilena", "María Paz", "Profesora de yoga, arteterapeuta", "Chile", "Las Encinas 3370", "137614561", "Licenciada en Artes, mención Artes Visuales", 1372, 293, 47); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(236, "2014", "Canto", "Canto", "984411108", "antofagasta", null, "rancagua 575", "Instituto profesional Aiep", 1, "11/10/1984",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-05 21:03:24"), null, "Ahorros e ingresos ", "internet", "danielacanto.rrpp@gmail.com", "Chilena", "Daniela", "independiente", "chile", "Antofagasta", "159210030", "Tecnico en Comunicaciones y Relaciones Publicas", 1377, 8, 65); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(237, "2015", "Villanueva", "Aguayo", "+56994199567", "Santiago", null, "Coventry 1934, depto. 802 TB", "Pontificia Universidad Catolica de Chile", 1, "28/01/1984",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-09 23:22:53"), null, "Financiamiento Particular", "Por Internet", "pauli.aguayo.pa@gmail.com", "Chilena", "Paulina", "Empresaria Independiente", "Chile", "Campus Oriente", "15593109-4", "Licenciada en Arte", 1384, 303, 55); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(238, "1998", "Haquin", "Manghi", "998879788", "Villa Alemana", "Me interesa este programa para comenzar a incorporar el tema del patrimonio en investigación y proyectos, y poner en diálogo con temas semióticos y educativos.", "Buenos Aires 1246", "UMCE, y postgrado en PUCV", 1, "20/06/1970",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-10 18:59:57"), null, "propia", "Página web del programa", "d.manghi.h@gmail.com", "chilena", "Dominique", "Profesora Universitaria, Investigadora", "Chile", "Santiago, Valparaíso", "7105989-8", "Profesora de Educación Diferencial, Licenciada en Educación, Doctora en Linguistica", 1385, 76, 60); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(239, "2013", "CONEJEROS", "DÍAZ", "956925813", "SANTIAGO", null, "PJE LOS DUENDES 7452", "IP ARCOS", 1, "10/02/1991",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-12 15:31:00"), null, "SUELDO FIJO", "INTERNET", "JDIAZC1991@GMAIL.COM", "CHILENA", "JUAN", "TRABAJADOR DEPENDIENTE", "CHILE", "STO DOMINGO 789", "178330888", "COMPOSITOR MUSICAL", 1386, 278, 57); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(240, "2014", "Trigo", "Alegría", "986626739", "Santiago", "", "Santiago", "Universidad Católica Silva Henríquez ", 1, "04/06/1980 ",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-01-27 20:47:33"), "986626739", "Sueldo Propio", "Internet", "sandra.floydiana@gmail.com", "Chilena", "Sandra", "Profesora de Artes Visuales ", "Chile", "Chile", "139086910", "Profesora de Educación Artística mención Artes Visuales en Básica y Media.", 1339, 320, 55); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(242, "2016", "Calderón", "Chávez", "+56978845238", "Santiago", "Además, se postulará al financiamiento otorgado por el Ministerio de la Cultura, las Artes y el Patrimonio. ", "Santa Elena 711. Depto 3.", "UMCE", 1, "18 - 03- 1988",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-14 20:23:09"), "+56978845238", "Ahorros personales y del trabajo como porfesor y mediador cultural.", "Personas que han cursado el programa y sitio web.", "juliochavezcalderon@gmail.com", "chilena", "Julio Andrés", "Profesor 3 Módulos de \"Museografía y Montaje\", AIEP y Mediador Cultural y Museografía parlante. MAC, Forestal.", "Chile", "Av. José Pedro Alessandri 774, Ñuñoa, Santiago - Chile", "16861901-4", "Profesor de Artes Visuales", 1389, 323, 47); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(243, "2010", "CARCAMO", "QUELIN", "983676584", "COYHAIQUE", null, "IGNACIO SERRANO 1132", "UNIVERSIDAD SAN SEBASTIAN", 1, "24 DE MARZO 1988",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-14 20:51:28"), "672232103", "PERSONALES", "INDAGANDO EN INTERNET", "DANIELA.QUELIN@GMAIL.COM", "CHILENA", "DANIELA", "GESTORA CULTURAL", "CHILE", "PUERTO MONTT", "166848997", "PROFESORA DE HISTORIA Y CIENCIAS SOCIALES", 1390, 259, 65); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(244, "2010", "CARCAMO", "QUELIN", "983676584", "COYHAIQUE", null, "IGNACIO SERRANO 1132", "UNIVERSIDAD SAN SEBASTIAN", 1, "24 DE MARZO 1988",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-14 22:51:39"), "672232103", "PERSONALES", "INDAGANDO POR INTERNET", "DANIELA.QUELIN@GMAIL.COM", "CHILENA", "DANIELA", "GESTORA CULTURAL", "CHILE", "PUERTO MONTT", "166848997", "PROFESORA DE HISTORIA Y CIENCIAS SOCIALES", 1394, 259, 65); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(245, "2009", "Campos", "Gutierrez", "999199210", "Santiago", "Fui seleccionada en este Magister en el año 2015, me matriculé pero tuve que retirarme por motivos personales. Quiero cursarlo ahora, no sé si debo pagar nuevamente la cuota de postulación.", "Jose Manuel Infante 2511 depto 1503", "Pontificia Universidad Católica de Chile", 1, "26 agosto 1983",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-15 15:49:17"), "999199210", "Recursos propios", "Internet", "rsgutier@uc.cl", "Chilena", "Rebeca", "Productora audiovisual", "Chile", null, "151404340", "Director Audiovisual y Periodista, Licenciada en Comunicación Social", 1395, 303, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(246, "2009", "LEIVA", "CALDERON", "9 79281636", "SANTIAGO", null, "JANEQUEO 5991", "UNIVERSIDAD SANTO TOMÁS", 1, "24 NOVIEMBRE 1986",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-15 16:28:09"), "9 79281636", "PROPIAS", "INTERNET", "taniacalderonleiva@gmail.com", "CHILENA", "TANIA", "DIRECTORA DE ARTE", "CHILE", "CALLE EJERCITO", "16560850-k", "DISEÑDOR GRÁFICO", 1396, 314, 47); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(247, "2005", "Schwartz", "Rojas ", "+56 9 68482496", "Santiago", null, "Macul", "Universidad Arcis", 1, "28-09-1974",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-15 17:21:52"), null, "Beca", "Pagina Universidad ", "galeriacallejera@gmail.com", "Chilena ", "Pablo ", "Productor ", "Chile", "Santiago - Chile", "10.034.095-k", "Licenciado en Bellas Artes", 1397, 299, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(248, "2010", "Vallejos", "Vergara", "988994006", "Santiago", "De ser aceptada en el programa me interesa postular a becas de la universidad.", "Río Petrohue 4703, Villa el Alba", "UMCE / PUC", 1, "01-10-1984",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-15 17:41:30"), null, "Becas / Personales", "Feria de educacion", "vivia.vergarav@gmail.com", "Chilena", "Viviana", "Mediadora Cultural, Museo Violeta Parra", "Chile", "Santiago", "16509388-7", "Licenciatura en Artes Visuales / Profesora de Educacion Media en Artes Plasticas ", 1399, 312, 52); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(249, "2005", "Alfaro", "Segovia", "971331048", "Chile", null, "Ochagavia 12508", "UniV. De chile", 1, "28 06 1976",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-16 03:05:29"), "999888927", "Laboral", "Prof. Johana teille", "Lorenzo.segovia@yahoo.es", "Chileno", "Cristian lorenzo", "Profesor artes educación primaria y secundaria", "Chile", "Chile", "106978557", "Licenciado en artes c/m artes visuales", 1405, 283, 54); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(250, "2014", "Aránguiz", "Otárola", "997019752", "Santiago", null, "Manuel Rodríguez Norte 694, departamento 1218", "Universidad de Santiago de Chile", 1, "19/03/1990",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-18 00:40:23"), "997019752", "Personales", "Página Web", "fotarolaaranguiz@gmail.com", "Chileno", "Fernando", "Director Interino Liceo Experimental Artístico", "Chile", "Santiago", "175523294", "Licenciado en Educación en Castellano, Profesor de Estado", 1406, 323, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(251, "2014", "Aránguiz", "Otárola", "997019752", "Santiago", null, "Manuel Rodríguez 694, departamento 1218", "Universidad de Santiago de Chile", 1, "19/03/1990",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-18 18:04:55"), "997019752", "Personales", "Página Web institucional", "fotarolaaranguiz@gmail.com", "Chileno", "Fernando", "Director Interino Liceo Experimental Artístico", "Chile", "Santiago", "175523294", "Profesor de Estado en Castellano, Licenciado en Educación en Castellano", 1415, 323, 51); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(252, "1992", "WATTSON", "BARRIOS", "997163496", "SANTIAGO", null, "CANUMANQUI 1822", "UNIVERSIDAD DE CHILE", 1, "18 DE MAYO DE 1970",  AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-20 19:42:55"), "997163496", "FINANCIAMIENTO PROPIO", "A TRAVES DE LA FACULTAD DE ARTES DE LA U DE CHILE", "barrioswattson@yahoo.es", "CHILENA", "JULIO", "CELLISTA ORQUESTA DE CAMARA DE CHILE Y PROFESOR DE CELLO EN FACULTAD DE ARTE U DE CHILE", "CHILE", "FACULTAD DE ARTES ", "116342421", "INTERPRETE DE ORQUESTA CON MENCION EN VIOLONCELLO", 1421, 295, 50); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(254, "2019", "olivares", "flores", "+56981439049", "santiago", "desarrollo laboral en la dirección y creación coreográfica de deportes artísticos, específicamente patinaje,donde vinculo las diferentes areas del arte para el deporte, así como en mis creaciones de danza contemporánea llevo el deporte a un arte inclusivo de diferentes áreas integradas.", "pasaje foresta 5281", "Universidad de Las Américas", 1, "20-02-1996", AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-28 16:49:11"), "25524445", "laboral", "internet", "maiflores.oliv@gmail.com", "chilena", "maite", "profesora", "chile", "providencia", "191288165", "Interprete en Danza, licenciado", 1434, 320, 57); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(255, "2007", "Toro", "Araya", "56976265153", "Castro", "", "Castro", "Universidad de La Serena ", 1, "07/07/1978", AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-03-21 14:15:24"), "56976265153", "propias", "Otros alumnos ", "katerinearaya@yahoo.com ", "Chilena", "Katerine", "Arquitecta independiente", "Chile", "Chile", "143857352", "Arquitecto", 1423, 227, 59); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(256, "2013", "Cáceres", "Teare", "+56982553023", "Santiago", null, "Tucapel Jiménez 76", "Duoc UC", 1, "17/08/1987", AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-02 20:56:59"), null, "Crédito ", "por la página de U de chile", "oscar.teare@gmail.com", "Chileno", "Oscar ", "Ingeniero en sonido en La Tercera TV", "Chile", "San Carlos de Apoquindo, Las Condes, Santiago", "16660005-7", "Ingeniero en Sonido", 1438, 323, 57); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(257, "2013", "Cáceres", "Teare", "+56982553023", "Santiago", null, "Tucapel Jiménez 76", "Duoc UC", 1, "17/08/1987", AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-03 13:08:24"), null, "Crédito ", "por la página de U de chile", "oscar.teare@gmail.com", "Chileno", "Oscar ", "Ingeniero en Sonido, La Tercera TV", "Chile", "San Carlos de Apoquindo, Las Condes, Santiago", "16660005-7", "Ingeniero en Sonido", 1439, 323, 57); i = i+1;
		arreglo[i] = new SolicitudPostulacionDTO(258, "2015", "Garrido", "Aravena", "56988248448", "Santiago", null, "Gorbea 2550, departamento 213", "Universidad de Chile", 1, "24/08/1985", AppDate.convertirStrFormatDD_MM_YYYY_HH_MM_SSToDate("2019-04-03 17:32:29"), "56988248448", "La mayoría ahorros y salario", "Por internet", "marianelaaravena@gmail.com", "Chilena", "Marianela Andrea", "Profesora de Historia", "Chile", "Santiago, Juan Gomez Milla", "16125077-5", "Magister en Historia", 1440, 323, 62); i = i+1;

		
		
		/**		
'146', '2017', 'Alfaro', 'Trujillo', '976178524', 'Santiago', NULL, 'Av. José Pedro Alessandri 1993 depto a-26', 'Universidad Academia de Humanismo Cristiano', '1', '20-04-1993', '2018-12-03 14:20:24', NULL, 'Ahorros y familiar', 'En mi formación universitaria, búsqueda internet', 'cltrujilloalfaro@gmail.com', 'chilena', 'Cesar', 'cesante', 'Chile', 'Av. Condell 343, Providencia', '18366079-9', 'Antropólogo', '1208', '303', '62'
'147', '2015', 'Hernández', 'Bachmann', '979548355', 'Santiago', NULL, 'Agustinas #1569, depto. 44', 'Pontificia Universidad Católica de Valparaíso', '1', '9/03/1983', '2018-12-03 20:34:58', NULL, 'ahorros personales', 'por internet', 'katherine.bachmann.h@gmail.com', 'chilena', 'Katherine', 'profesora', 'Chile', 'Valparaíso', '15.530.525-8', 'Profesor de música', '1211', '323', '53'
'149', '2015', 'Rosas', 'Núñez', '944458441', 'Santiago', NULL, 'Av. Antonio Varas #1414 Depto. 91', 'Universidad de Chile', '1', '25/03/1987', '2018-12-06 12:16:44', NULL, 'Propias', 'Internet', 'zapatosdetaco@gmail.com', 'Chilena', 'Daniela', 'Antropóloga Social de la Academia de la Lengua y Cultura Mapuche en Contexto Uurbano', 'Chile', 'Chile', '164350665', 'Antropóloga Social', '1221', '310', '55'
'150', '2015', 'Rosas', 'Núñez', '944458441', 'Santiago', NULL, 'Av. Antonio Varas 1414, depto. 91', 'Universidad de Chile', '1', '25 de marzo 1987', '2018-12-06 15:13:40', NULL, 'Propia', 'Página web', 'zapatosdetaco@gmail.com', 'Chilena', 'Daniela ', 'Antropóloga de Academia de la Lengua y Cultura Mapuche', 'Chile', 'Chile', '164350665', 'Antropóloga Social', '1224', '310', '55'
'151', '2016', 'Marilican', 'Peña', NULL, NULL, NULL, NULL, 'Universidad de Concepción', '1', '14/09/1992', '2018-12-08 17:55:49', NULL, NULL, NULL, 'felpena.pena@gmail.com', NULL, 'Felipe', NULL, NULL, NULL, '18145856-9', 'Antropólogo con mención en Antropología Física', '1226', NULL, '54'
'152', '2016', 'salvatierra', 'peña', '+56972105917', 'concepción', NULL, 'la cantera 252 villuco', 'universidad de concepción', '1', '10/09/1990', '2018-12-10 13:33:13', '3185854', 'propias', 'a través de este sitio web', 'javipsalvatierra@gmail.com', 'chilena', 'javiera ', 'encargada de control de gestion', 'chile', 'concepción', '173488432', 'ingeniera comercial', '1227', '147', '62'
'153', '2013', 'Vio', 'De Giovanni', '00393489211829', 'Bologna', NULL, NULL, 'Alma Mater Studiorum', '1', '12-11-1990', '2018-12-10 16:37:10', '00393489211829', 'El trabajo que hice hasta ahora', 'Una amiga', 'degiogre@gmail.com', 'italiana', 'Greta', 'Empleada en un Museo', 'Italy', 'Bologna, Italia', 'YA9450501', 'Licenciatura en Arte', '1228', NULL, '55'
'154', '2011', 'Shea', 'Ruiz', '963200209', 'Valdivia', 'Esta es una repostulación. El programa ya fue cursado. Sólo falta la entrega y defensa de la tesis', 'Pedro Montt 2175', 'Universidad Mayor', '1', '11-02-1986', '2018-12-10 18:48:34', '963200209', 'Ya fueron pagados los dos años de estudio.', 'Es una repostulación. Ya cursé el programa', 'franciscaru@gmail.com', 'Chilena', 'Francisca', 'Productora', 'Chile', 'Santiago de Chile', '17537785-9', 'Actriz', '1229', '335', '51'
'155', '2016', 'Marilican', 'Peña', '+56 9952041853', 'Puerto Montt', NULL, 'Pasaje 12 nº 1706 Villa Jardin del Mirador ', 'Universidad de Concepcion', '1', '14/09/1992', '2018-12-11 17:25:41', '65 2633960', NULL, NULL, 'FELPENA.PENA@GMAIL.COM', 'CHILENA', 'Felipe ', 'Consultor ', 'Chile', 'Concepcion', '18145856-9', 'Antropologo, Mencion en Antropologia Fisica', '1230', '242', '54'
'156', '2005', 'Muñoz', 'Muñoz', '974309205', 'Ancud', NULL, 'Eladio Vicuña n°73, Población Raúl Silva Henríquez', 'Universidad de Concepción', '1', '20/06/1982', '2018-12-11 19:25:12', '974309205', 'propias', 'diario de circulación provincial e internet', 'soniasoledadmunoz@gmail.com', 'Chilena', 'Sonia Soledad', 'Encargada de Proyectos y Coordinación Cultural, Cirporación Cultural Municipal de Ancud', 'Chile', 'Concepción', '15287771-4', 'Socióloga. Licenciada en Sociología', '1231', '225', '59'
'157', '1994', 'Fernández', 'Vicentela', '+56942881067', 'Valparaíso', NULL, 'Las Lomas 241 Curauma Valparaíso', 'DUOC', '1', '23-03-1971', '2018-12-11 19:44:13', '322461207', 'beca colaborador INACAP', 'web', 'cvicentela@inacap.cl', 'chilena', 'Cristina', 'Coordinadora de Vinculación con el Medio INACAP Valparaíso', 'Chile', 'Viña del Mar', '10343904-3', 'Relacionador Público', '1232', '75', '60'
'158', '1994', 'Fernández', 'Vicentela', '+56942881067', 'Valparaíso', NULL, 'Las Lomas 241 Curauma Valparaíso', 'DUOC', '1', '23-03-1971', '2018-12-11 19:49:19', '322461207', 'beca colaborador INACAP', 'web', 'cvicentela@inacap.cl', 'chilena', 'Cristina', 'Coordinadora de Vinculación con el Medio INACAP Valparaíso', 'Chile', 'Viña del Mar', '10343904-3', 'Relacionador Público', '1233', '75', '60'
'159', '2018', 'Benavides', 'Padilla', '51-1-961545813', 'Lima', 'Reingreso para homologacion y sustentar la tesis ', 'Residencial Santa Cruz, Block E, Dpto 202, San Isidro', 'Universidad de Chile', '1', '02 octubre 1968', '2018-12-11 22:34:11', '51-1-961545813', 'propias', 'Estudiaba en la facultad de artes', 'padilla_abraham@yahoo.com', 'peruana', 'Abraham', 'Musico', 'Peru', 'Santiago Centro', '14.587.979-5', 'Licenciatura en Composicion', '1234', NULL, '67'
'160', '2006', 'Sepúlveda', 'Moraga', '+56979304270', 'Santiago', NULL, 'Diagonal Paraguay 265 of 1001', 'Universidad de Chile', '1', '01/07/1982', '2018-12-12 04:18:52', '229781013', 'Ahorros personales', 'A través de la consulta sobre el devenir del MAC', 'anamariamoraga@u.uchile.cl', 'Chilena', 'Ana María', 'Coordinadora- Investigadora Consulta MAC U. Chile', 'Chile', 'Santiago, Chile', '151577318', 'Licenciada en Gobierno y Gestión Pública', '1235', NULL, '49'
'161', '2016', 'Leal', 'Blanco', '+56949665962', 'Santiago', NULL, 'Blanco encalada 1727', 'Universidad Autónoma de Bucaramanga', '1', '25-03-1991', '2018-12-12 20:31:42', '+56949665962', 'Propia', 'Familiar', 'ximena.blanco@gmail.com', 'colombiana', 'Rosa', 'Estudiante postítulo', 'Chile', 'Colombia', '25850633-2', 'Maestro en música', '1237', '323', '48'
'162', '2007', 'Castro', 'Jiménez', '990014153', 'Santiago', 'Soy egresada del magister el año 2011 y quiero titularme ', 'La Giralda 1865', 'IP La Casa', '1', '31-01-1966', '2018-12-12 22:25:31', '227788378', 'sueldo fijo', 'soy egresada', 'alesiempre@gmail.com', 'Chilena', 'Alejandra', 'Directora Ejecutiva El Circo del Mundo - Chile', 'Chile', 'Barrio República', '10061430-8', 'Actriz Profesional', '1238', '303', '51'
'163', '2011', 'Gutierrez', 'Arrieta', '+56983752811', 'Santiago', NULL, 'Brown Norte 76, Depto. 201', 'Pontificia Universidad Católica de Chile', '1', '23 de enero de 1984', '2018-12-12 23:44:45', NULL, 'Mi fuente de finaanciamiento es mi trabajo como arquitecta, en una sociedad y como independiente.', 'Por una ex alumna de la escuela de Artes de la Universidad de Chile', 'pamela.arrieta.arq@gmail.com', 'Chilena', 'Pamela Andrea', 'ejercicio profesional independiente de la Arquitectura', 'Chile', 'Campus Lo Contador, Providencia, Santiago.', '153333750', 'Titulo de arquitecta', '1239', '303', '54'
'164', '2007', 'Aguayo', 'Aguayo', '997969040', 'Santiago', NULL, 'San Gumercindo 3909', 'Universidad de Concepción', '1', '17-07-73', '2018-12-13 02:35:54', '997969040', NULL, NULL, 'gaatome@gmail.com', 'Chilena', 'Gloria ', 'Planificación BAJ. Levantamiento de procesos Consultora SurLatina. Administración y finanzas Red de Mediación Artística ', 'Chile', 'Concepción', '123209532', 'Licenciada en Artes ', '1240', '314', '51'
'166', '2014', 'Duque', 'Arango', '+57 3007880868', 'Bogotá', NULL, 'Av 28 N° 39-06', 'Universidad Nacional de Colombia', '1', '30 de diciembre de 1991', '2018-12-13 16:17:29', '+57 3007880868', 'Recursos propios y apoyo familiar.', 'Pagina web de la universidad', 'varangod@unal.edu.co', 'Colombiana', 'Viviana', 'Gestora de Innovación social y Extensión solidaria', 'Colombia', 'Palmira, Valle del Cauca, Colombia.', 'AN679288', 'Diseñadora Industrial', '1247', NULL, '51'
'167', NULL, 'Pérez', 'Pizarro', NULL, NULL, NULL, NULL, 'Universidad Finis Terrae', '1', '08/06/1980', '2018-12-13 16:47:03', NULL, NULL, NULL, 'lajosepizarro@gmail.com', NULL, 'María José', NULL, NULL, NULL, '15522608-0', 'Actriz', '1248', NULL, '57'
'168', '2008', 'Langenbach', 'Schwerter', '990614353', 'Rio Bueno', NULL, 'Independencia 1436', 'Universidad Austral de Chile', '1', '13/12/1984', '2018-12-13 18:02:13', '642340389', 'Autofinanciamiento', 'Por internet', 'catalizando@gmail.com', 'chilena', 'Carolina', 'Asesora y gestora cultural', 'catalizando@gmail.com', 'Valdivia', '15882442-6', 'Antropóloga,lic. en antropología', '1249', NULL, '51'
'169', '2007', 'Aguayo', 'Aguayo', '997969040', 'Santiago', NULL, 'San Gumercindo 3909', 'Universidad de Concepción', '1', '17-07-73', '2018-12-14 01:41:03', '997969040', NULL, NULL, 'gaatome@gmail.com', 'Chilena', 'Gloria', 'Planificación BAJ, Levantamiento procesos Consultora SurLatina, Administración y Finanzas Red de Mediación Artística ', 'Chile', 'Concepción', '12320953-2', 'Licenciada en Artes', '1250', '314', '51'
'170', NULL, 'Alvarado', 'Devia', '+56988235103', 'Santiago', NULL, 'Maturana 750 depto 405b', 'Liceo Dario Salas Puerto Montt', '1', '16/10/1990', '2018-12-14 04:29:02', NULL, 'Músico sesionista, profesora de instrumento y gestión de proyectos', 'Internet', 'pvdevia@gmail.com', 'Chilena', 'Paulina', 'Músico', 'Chile', NULL, '17.631.230-0', 'Licenciada enseñanza Media', '1251', '323', '65'
'171', NULL, 'Alvarado', 'Devia', '+56988235103', 'Santiago', NULL, 'Maturana 750 depto 405b', 'Sin Grado académico', '1', '16/10/1990', '2018-12-14 14:42:12', NULL, 'Músico, monitora de instrumento y gestión', 'Internet', 'pvdevia@gmail.com', 'Chilena', 'Paulina', 'Músico', 'Chile', NULL, '17.631.230-0', 'Egresada 4º Medio', '1252', '323', '65'
'172', '1994', 'Diaz', 'Lopez', '56996796256', 'Santiago', 'Estoy postulando para poder retomar mi condición de Candidata al grado de Magister en Gestión Cultural, puesto que actualmente estoy al día en los aspectos económicos de la carrera, asi como también con todos los créditos del programa, incluyendo las horas de práctica y los certificados de egreso y de notas con sus estampillas oficiales. Solo me queda terminar el porcentaje de tesis pendiente, cuyo título es: Diplomacia Cultural en Chile: Recursos de Cooperación para Gestores Culturales', 'Cueto 530, Barrio Yungay', 'INACAP', '1', '16/11/1965', '2018-12-14 17:34:03', '56223303365', 'Propios', 'Portal web de la Universidad de Chile, buscando, navegando por internet', 'carolopezd@gmail.com', 'Chilena', 'Paula Carolina', 'Asistente Asuntos Culturales: Encargada de Programas de Intercambio y Asistente de Programas Culturales', 'Chile', 'Sede Colón, Padre Hurtado', '100363909', 'Comunicadora Social', '1254', '323', '51'
'173', '2018', 'Julio', 'Gallardo', '9 45136799', 'Santiago', NULL, 'Brown Sur 333, Depto 211', 'Universidad Finis Terrae ', '1', '25 de noviembre, 1994', '2018-12-14 19:57:54', '9 45136799', 'Autofinanciamiento, trabajo en UFT y otros', 'Por Docentes de la Universidad Finis Terrae', 'tatianajulio.9@gmail.com', 'Chilena', 'Tatiana', 'Docente asistente en el área teórica de la Universidad Finis Terrae ', 'Chile', 'Pedro de Valdivia 1642, Providencia', '189076509', 'Licenciada en Artes Visuales ', '1257', '303', '47'
'174', '2016', 'Coca', 'Ibera', '998403087', 'Puerto Aysén', NULL, 'Eleuterio Ramirez #1060', 'Universidad de Concepción', '1', '10/06/1992', '2018-12-14 21:38:54', '998403087', 'Crédito', 'Internet', 'carolinaibera@gmail.com', 'Chilena', 'Carolina', 'Fonoaudióloga', 'Chile', 'Concepción', '18.217.787-3', 'Fonoaudióloga', '1258', '255', '55'
'175', '2009', 'Caberletti', 'Toro', '9-84490204', 'Santiago', NULL, 'Jorge Matte Gormaz Nro. 2462, depto. 401, Providencia', 'Universidad Pedro de Valdivia', '1', '03.06.1961', '2018-12-14 22:03:20', NULL, 'Remuneraciones mensuales', 'Referencias y sitio web', 'torocaberletti@gmail.com', 'chilena', 'Claudia', 'Funcionaria pública', 'Chile', 'Providencia-Santiago', '8969776k', 'Licenciada en Comunicación Social y Periodista', '1259', NULL, '49'
'176', '2011', 'Gabriela Alamo', 'Alamo', NULL, 'Santiago', 'Por favor permítanme re-postular al programa de Magíster de Gestión Cultural, pudiendo ofrecer mi tesis y optar al grado. Muchas gracias. ', NULL, 'Universidad del Pacífico', '1', '18-03-1988', '2018-12-14 23:32:30', '+569 3225 2552', 'Trabajo', 'Programa cursado en 2015-2016', 'g.alamopalma@gmail.com', 'Chilena', 'Gabriela', 'Asistente Dirección Ejecutiva, Centro Cultural Gabriela Mistral (GAM)', 'Chile', 'Santiago, Las Condes', '16609058k', 'Publicista', '1261', '293', '51'
'177', '1990', 'ESPIÑEIRA', 'RIVEROS ', '963074100', 'SANTIAGO', NULL, 'DARIO URZUA 2051 DEPTO 102', 'UNIVERSIDAD CATÓLICA DE CHILE', '1', '24.09.1965', '2018-12-15 01:28:02', NULL, 'PERSONAL', 'INTERNET', 'catalina.rives@gmail.com', 'CHILENA', 'MARIA CATALINA', 'PROFESIONAL ÁREA FORMACIÓN DOCENTE CPEIP', 'CHILE', 'SANTIAGO', '60536228', 'PROFESORA DE EDUCACIÓN GENERAL BÁSICA', '1264', '310', '55'
'178', '2010', 'N/A', 'TSAI', '931814622', 'Santiago', NULL, 'Estoril 707 depto c3', 'Shin Hsin University', '1', '27/05/1988', '2018-12-15 01:33:26', '224532352', 'Ahorro personal, cuenta bancaria', 'online', 'jintsai12@gmail.com', 'TAIWAN', 'CHIN FONG', 'SR. ECOMMERCE GLOBAL MARKETING MANAGEMENT', 'chile', 'Taiwan', '308808995', 'BA-Digital multimedia design', '1265', '295', '52'
'179', '1989', 'Guarda', 'Rodríguez', '961923979', 'Futrono', NULL, 'Valentin Monsalve 100', 'Colegio Santa Cruz', '1', '19/10/1971', '2018-12-15 03:07:46', '961923979', 'Ingresos Propios', 'Amiga', 'huapicana@gmail.com', 'Chilena', 'Carla Jimena', 'Emprendedora Social', 'Chile', 'Santiago', '10987848-0', 'Licencia Ed Media', '1266', '328', '65'
'180', '2017', 'Olave', 'Espinoza', '9 869 869 96', 'San Sebastián', 'ninguna', 'Séptima Ote. playa ?19', 'Universidad Alberto Hurtado', '1', '22 julio 1983', '2018-12-15 16:25:11', '9 869 869 96', 'Beca Conicyt ', 'Estudié dos años teoría e historia del Arte, ahí me enteré', 'casafrecuencias@gmail.com', 'Chilena', 'Karen', 'Docente', 'Chile', 'Almirante Barroso 10, Santiago', '15341536-6', 'Grado académico de Licenciada en Psicología, Título Profesional Psicóloga', '1268', '44', '49'
'181', '2012', 'RIVERA ', 'CASTILLO ', '2224698581', 'PUEBLA ', NULL, '33 ORIENTE 2803 COL. JOSÉ LÓPEZ PORTILLO', 'U. VERACRUZANA ', '1', '02-09-1980', '2018-12-15 17:22:41', '2224698581', 'BECA ', 'INTERNET', 'ivancastillorivera@gmail.com', 'MEXICANA ', 'IVAN ', 'MAESTRO', 'MÉXICO', 'XALAPA, VER. MÉXICO ', 'G29578092', 'LICENCIATURA ', '1269', NULL, '50'
'182', '1989', 'Guarda', 'Rodriguez', NULL, 'Futrono', 'No considerar postulación anterior, faltaban docs. Esta es la oficial', 'Valentin Monsalve 100', 'Colegio Inmaculada Concepción', '1', '19/10/1971', '2018-12-15 19:56:38', '961923979', 'Ingresos Propios', 'Amiga', 'huapicana@gmail.com', 'Chilena', 'Carla', 'Emprendedora', 'Chile', 'Valdivia', '10987848-0', 'Lic Ed Media', '1271', '328', '65'
'183', '2014', 'Fischer', 'Gaete ', '+56961423115', 'Linares', 'Adjunto cartas de recomendación U. Autónoma y Museo de Linares', 'Diputado Mario Dueñas 678', 'Universidad Autónoma de Chile', '1', '04/05/1984', '2018-12-15 20:46:31', NULL, 'Postulante a beca Conicyt / Financiamiento privado', 'compañera de estudios', 'caro.gaete.fischer@gmail.com', 'chilena', 'Carolina', 'Artista Visual, Orfebre', 'Chile', 'Talca', '15.747.276-3', 'Licenciada en Artes, Profesora de Artes, Licenciada en Educación', '1272', '121', '49'
'184', '2012', 'Reyes', 'Fernandez', '942301430', 'san fernando', NULL, 'negrete 1075', 'Instituto Profesional Arcos', '1', '25/04/1986', '2018-12-15 21:05:32', NULL, NULL, NULL, 'marcela.fernandez@ug.uchile.cl', 'chilena', 'Marcela', 'gestora cultural', 'chile', 'Santiago', '163093235', 'Actriz profesional', '1273', NULL, '51'
'185', '2010', 'Díaz', 'Ramallo', '998554696', 'Santiago', '-', 'Huérfanos 1919, depto 55A', 'Universidad Mayor de San Andrés', '1', '26-03-1988', '2018-12-15 23:00:33', '226984995', 'Financiamiento propio', 'Internet', 'cecy.ramallo@u.uchile.cl', 'Chilena', 'Cecilia del Carmen', 'Historiadora', 'Chile', 'La Paz, Bolivia', '23379086-9', 'Licenciada en Historia', '1275', '323', '67'
'186', '2017', 'Landeros', 'Contreras', '+56 9 98405978', 'Santiago', NULL, 'República de Cuba 2601', 'Universidad Finis Terrae', '1', '11.12.1974', '2018-12-16 00:13:58', '+56 2 27254007', 'Propios', 'Ex Alumna', 'tamara.contreras.landeros@gmail.com', 'Chilena', 'Tamara Alejandra', 'Estudiante Pedagogía en Educación Media, UFT', 'Chile', 'Providencia, Santiago', '128255958', 'Licenciada en Artes Visuales, Mención Pintura', '1276', '310', '47'
'187', '2017', 'Peragallo', 'Sepúlveda', '959327012', 'santiago', 'Me interesa desarrollar el área investigativa y formación académica, ya que me gustaría contribuir de este modo a la humanidad  ', 'Nueva Colon #1123', 'Universidad Academia de Humanismo Cristiano', '1', '03 de enero de 1992', '2018-12-16 00:35:59', '227354826', 'postulando a beca Conicyt', 'investigando acerca de magister que se adecuaran a mis intereses investigativos ', 'j.sepulveda.peragallo.c@gmail.com', 'Chilena', 'Javiera', 'psicóloga programa PIE colegio', 'Chile', 'Providencia', '18305509-7', 'psicóloga, licenciada en psicología ', '1277', '287', '49'
'188', '2017', 'Almonacid', 'Cárdenas', '+56994571627', 'Villa alemana', NULL, 'Aranda #0211, casa 5', 'Universidad de Playa Ancha', '1', '24/05/1991', '2018-12-16 02:34:51', NULL, 'Propio', 'Por la página web', 'gonzalocardenas24@hotmail.com', 'Chilena', 'Gonzalo', 'Cesante', 'Chile', 'Valparaiso', '17.626.905-7', 'Licenciado en sociología', '1278', '76', '49'
'189', '2016', 'Oyarzún', 'Campos', NULL, NULL, NULL, NULL, 'Universidad de Chile', '1', '18/11/1988', '2018-12-16 16:26:32', NULL, NULL, NULL, 'daniela3831@gmail.com', NULL, 'Daniela', 'Profesora de Música', NULL, NULL, '17043763-2', 'Profesora de Educación Media mención en Artes Musicales', '1280', NULL, '65'
'190', '2017', 'Sepúlveda', 'Escare', '999724588', 'Rancagua ', 'envío con toda la fé hoy mi inscripción ya que hasta ayer no pude por viaje, espero por favor la consideren', 'Villa Nueva Alameda pje. Asela Práxedes #0380 ', 'Universidad Aurónoma de Chile', '1', '16/11/1987', '2018-12-17 02:59:46', '732626634', 'mi sueldo de 820.000 líquido', 'Por internet', 'natadivie@gmail.com', 'Chilena', 'Natalia', 'Profesora de Artes Visuales ', 'Chile', 'Talca', '167930409', 'Profesora de Artes Visuales', '1281', '105', '55'
'191', '2004', 'Martínez', 'Valle', '989063541', 'quilpué', 'Tengo que hacer este trámite para dar mi examen de grado.', 'Los álamos 921 depto. E31 Condominio Los Naranjos 3 Quilpué', 'Pontificia Universidad Católica de Valparaíso', '1', '04-03-1979', '2018-12-17 21:49:22', '32 2274132', 'mi trabajo en la universidad', 'web comentario de colegas', 'valeriazul79@gmail.com', 'Chilena', 'Valeria Gisel', 'academica de la PUCV', 'chile', 'Valparaíso', '13.634.338-6', 'Profesora de Música/ licenciatura en ciencias y artes musicales, licenciatura en educación', '1283', '67', '48'
'192', '2017', 'Almonacid', 'Cárdenas', '+56994571627', 'Villa alemana', NULL, 'Aranda #0211, casa #5', 'Universidad de Playa Ancha', '1', '24/05/1991', '2018-12-18 15:43:48', NULL, 'Propio', 'Por la página web', 'gonzalocardenas24@hotmail.com', 'Chilena', 'Gonzalo', 'Cesante ', 'Chile', 'Valparaiso', '17.626.905-7', 'Licenciado en sociología', '1287', '76', '49'
'193', '2017', 'Cueto', 'Cueto ', '994417903', 'Algarrobo', NULL, 'El Olmo Nº 1720', 'Universidad Andrés Bello', '1', '09-01-1995', '2018-12-27 12:45:49', '994417903', 'Salario ', 'Internet', 'damianjcueto@gmail.com', 'chileno', 'Damián ', 'Profesor de Educación Musical', 'Chile', 'Casona Las Condes', '18.761.302-7', 'Profesor de Educación Musical para la Educación Pre-Escolar y Básica', '1293', '41', '62'
'194', '2011', 'Saavedra', 'Garrido', '942580544', 'Los Ángeles', NULL, 'Indira Gandhi sitio 2B parque residencial Doña Isidora', 'Universidad Adventista de Chile', '1', '16-03-86', '2018-12-28 14:37:51', '432232906', 'Trabajo y Padres', 'Internet', 'lorenagarridosaavedra@gmail.com', 'Chilena', 'Lorena Verónica', 'Profesora de Música', 'Chile', 'Chillán, Chile', '16204621-7', 'Profesor de música y licenciada en Educación', '1294', '163', '50'
'195', '2008', 'APARICIO', 'VALVERDE ', '+56 9 71550879', 'CHILLAN', NULL, 'LOS BOLDOS 876', 'ARTURO PRAT', '1', '13-10-1984', '2019-01-03 17:01:12', '42-2464059', NULL, 'INTERNET', 'jeannecita@gmail.com', 'CHILENA', 'JEANNETTE', NULL, 'CHILE', 'CHILLAN', '15.875.764-8', 'PROFESOR GENERAL BASICA', '1299', '148', '47'
'196', '1994', 'Diaz', 'Lopez', '56996796256', 'Santiago', 'Tengo la inquietud sobre si podré acceder a un arancel reducido, puesto que cuento con el Certificado de Egreso del Magister solo necesito completar y entregar la Tesis', 'Cueto 530, Barrio Yungay', 'INACAP', '1', '16/11/1965', '2019-01-04 15:43:19', '56223303365', 'Propios, salario y ahorros personales', 'Buscando la mejor casa de estudios donde imparten el Magister en G.C.', 'carolopezd@gmail.com', 'Chilena', 'Paula Carolina', 'Asistente Cultural y Coordinadora de Programas de Intercambio', 'Chile', 'Las Condes, Santiago', '100363909', 'Profesional: Comunicador Social con Mención en Relaciones Públicas', '1300', '323', '51'
'197', '2012', 'Navarrete', 'Salinas', NULL, NULL, NULL, NULL, 'Escuela Moderna de Música y Danza', '1', '21-01-1986', '2019-01-04 17:11:02', NULL, NULL, NULL, 'f.salinas.navarrete@gmail.com', NULL, 'Felipe', NULL, NULL, NULL, '16102615-8', 'Especialista en Arreglos y Composición en Música Popular', '1301', NULL, '53'
'198', '2012', 'Navarrete', 'Salinas', NULL, NULL, NULL, NULL, 'Escuela Moderna de Música y Danza', '1', '21-01-1986', '2019-01-04 20:05:54', NULL, NULL, NULL, 'f.salinas.navarrete@gmail.com', NULL, 'Felipe', NULL, NULL, NULL, '16.102.615-8', 'Especialista en Arreglos y Composición de Música Popular', '1302', NULL, '53'
'199', '2012', 'Carvacho', 'Ríos ', '944610619', 'Santiago', NULL, 'Pasaje Miguel de Cervantes # 486', 'Universidad Mayor', '1', '28/05/1981', '2019-01-07 14:16:36', '228862990', 'Colegio Filipense', 'Profesor Romilio Orellana me comento.', 'profesordemusica2015@gmail.com', 'Chilena', 'Miguel Ángel ', 'Docente', 'Chile', 'Vespucio', '141608738', 'Profesor de Artes Musicales para Educación Básica y Media  ', '1303', '285', '53'
'200', '2016', 'Noack', 'Dinamarca', '957243317', 'Viña del Mar', 'Me encantaría cursar este diplomado ya que trata de una materia central para lo que fue mi tesis de pregrado, y que espero siga siendo piedra angular de mi carrera profesional, el patrimonio.', NULL, 'Universidad de Playa Ancha', '1', '27-11-1992', '2019-01-08 16:54:15', NULL, 'Sueldo fijo', 'Buscando postgrados por internet', 'andresdinamarca.n@gmail.com', 'Chilena', 'Andrés ', 'Profesor de Liceo', 'Chile', 'Valparaíso', '18298720-4', 'Profesor de Historia y Geografía', '1304', '77', '60'
'201', '2015', 'Muñoz', 'Fuentes', '(+569)92999423', 'Santiago', NULL, 'Lincoyán 1050 dpto 405', 'Universidad de Chile', '1', '20/07/1985', '2019-01-08 20:56:07', NULL, 'propias', 'A través de una profesora de la facultad de artes', 'fuentes.m.dani@gmail.com', 'chilena', 'Daniela ', NULL, 'Chile', 'Plaza Ercilla 833', '16124616-6', 'Geóloga', '1305', '303', '54'
'202', '2009', 'contreras', 'Villalobos', '984571468', 'santiago', 'estoy a la expectativa de su respuesta ya que me interesa mucho este postgrado de antemano muchísimas gracias ', 'pasaje 1410', 'Escuela de Bellas Artes Macedonio de la Torre', '1', '06/09/1981', '2019-01-09 22:56:37', '984571468', 'trabajo en Colegio de basica', 'a través de la pagina de la universidad', 'jetaimecleodear@hotmail.com', 'Peruana', 'ibiss lourdes', 'Profesora de Artes', 'Chile', 'Trujillo - Perú', '251232296', 'Profesora de Educación Artistica mención Dibujo y pintura', '1307', '317', '55'
'203', '1994', 'CANDIA', 'ALARCON', '989220556', 'villa alegre', NULL, 'raul pino 246', 'liceo agricola ', '1', '02-01-1975', '2019-01-10 13:23:19', '989220556', 'propias', 'via web', 'ralarconc@villalegre.cl', 'CHILENA', 'RANDOLFO FABIAN', 'gestor cultural', 'chile', 'villa alegre', '12.131.718-4', 'tecnico agricola', '1308', '140', '65'
'204', '2013', 'Clavijo', 'Palacio', '573123008642', 'Bogota', 'https://cosasyproyectos.webnode.com.co/ (pagina Web)', 'Colombia', 'Universidad Distrital Francisco José de Caldas ASAB ', '1', '20/08/1987', '2019-01-15 06:33:14', '573034102', 'Beca Jovenes Talento Banco de la República Bogotá ', 'Internet', 'palacioclavijo@gmail.com', 'colombiano', 'Henry Alexander', 'Docente', 'colombia', 'Bogotá colombia', 'AN931614', 'Maestro en Artes Plásticas y Visuales', '1311', NULL, '47'
'205', '2018(mitad)', 'Fernández', 'Apablaza', '+569 59100002', 'santiago', NULL, 'Domingo Gomez Rojas 0892', 'Universidad Finis Terrae', '1', '14 de diciembre de 1992', '2019-01-16 16:04:06', NULL, 'personales y familiares', 'investigando sobre temas de gestión cultural', 'ignacioapablazaf@gmail.com', 'chilena', 'Ignacio Iván', 'Sin Ocupación', 'chile', 'En Av. Pedro de Valdivia con Pocuro', '184685116', 'Licenciado en Historia mención comunicación estratégica', '1312', '283', '62'
'206', '2015', 'Ibaceta', 'Becerra', '955253093', 'Santiago', NULL, 'Manuel Antonio Maira 1011 - N', 'Universidad Central de Chile', '1', '20/08/1987', '2019-01-17 13:09:27', '955253093', 'Trabajador dependiente en el Sector Público', 'Por internet', 'mbecerraibaz@gmail.com', 'Chilena', 'Marcel Andrés', 'Profesional en la Facultad de Artes de la Universidad de Chile', 'Chile', 'Santiago de Chile', '16729449-9', 'Administrador Público - Licenciado en Gestión Pública', '1314', '310', '62'
'207', '2015', 'basoalto', 'sepúlveda', '+56975878450', 'santiago', NULL, 'Pedro de villagra 2457.', 'Universidad Diego Portales', '1', '23/08/1990', '2019-01-17 21:10:23', '+56975878450', 'personal', 'por amigos', 'irma.sepulvedab@gmail.com', 'chilena', 'irma rocio', NULL, 'chile', 'Republica 180', '17577952-3', 'título de artista visual', '1317', '326', '47'
'208', '2018', 'Jiles', 'Muñoz', '+56976161142', 'Santiago', NULL, 'Los Españoles 2259', 'Departamento de Teoría de las Artes, Facultad de Artes, Universidad de Chile', '1', '12/11/1993', '2019-01-21 01:57:55', '+56976161142', 'Postulación Beca Conicyt', 'Pregrado', 'gaston.munoz.j@ug.uchile.cl', 'Chilena', 'Gastón', 'Investigación y curatoría independiente', 'Chile', 'Santiago, Chile', '187664039', 'Licenciatura en Artes con Mención en Teoría e Historia del Arte', '1323', '310', '49'
'209', '2017', 'Gakneras', 'Seghabi', '+56 9 46625930', 'Ñuñoa', 'Quisiera saber si existen becas o descuentos ya que además de apoyar a mi familia en Venezuela, estoy ayudando a mi hermana a pagar su carrera de Arquitectura en esta misma casa de estudios, próxima a empezar en marzo de este año.', 'Av. Sucre 2725, depto 604', 'Universidad Monteávila', '1', '21-12-1993', '2019-01-21 13:46:09', '+56 9 46625930', 'Mi ingreso salarial', 'Investigando opciones de estudios superiores en internet', 'jseghabi93@gmail.com', 'Venezolano', 'Jhonny', 'Creador de Contenido Web', 'Chile', 'Boleita Norte, Caracas, Venezuela', '26219749-2', 'Licenciado en Ciencias para la Comunicación e Información', '1326', '303', '53'
'210', '2017', 'López', 'Tello', '3312888859 (Movil Guadalajara, Jalisco, México)', 'Guadalajara, Jalisco', NULL, 'Isla Cancún 248', 'Universidad de Guadalajara', '1', '5 de noviembre del 2', '2019-01-22 03:21:42', '3312888859 ', 'Mi propio trabajo', 'Internet', 'joan_tello@hotmail.com', 'Mexicano', 'Joan Salvador', 'Músico ', 'México', 'Guadalajara,Jalisco,México', 'G30290255', 'Licenciatura en Música con orientación en Composición', '1328', NULL, '48'
'211', '1998', 'Bellenger', 'Aranda', '940754900', 'Coyhaique', NULL, 'Avenida Norte Sur 1074 casa B', 'Universidad de Chile', '1', '06/12/1966', '2019-01-23 15:27:39', NULL, 'propias', 'Portal Web', 'arandabellenger@gmail.com', 'chilena', 'Claudia', 'Administrativo Biblioteca universitaria', 'Chile', 'Santiago', '9968580-8', 'Licenciada en Historia', '1329', '259', '60'
'212', '2000', 'martin-posse', 'Talhouk', '+56 9 9969 8161', 'Santiago', NULL, 'Av. Ricardo Lyon 755 d.23', 'Universidad Central', '1', '11/09/1073', '2019-01-23 19:29:53', '+56 9 9969 8161', 'Personal', 'Internet', 'pablo@talhouk.cl', 'Chileno', 'Pablo', 'Arquitecto', 'Chile', 'Santiago', '103670012', 'Arquitecto', '1330', NULL, '47'
'213', '2019', 'Apala', 'Castel', '56-9-75894836', 'Santiago', 'Mi titulación tuvo lugar en este mismo mes de Enero. Ante esta situación no han sido entregados aún los certificados oficiales. Sin embargo, mi casa de estudios me ha extendido una carta de constancia, y ya se ha hecho una solicitud formal para que los documentos requeridos sean entregados lo más pronto posible.', 'Transversal Suarez Mujica 2900. Dpto.64', 'Pontificia Universidad Católica de Chile', '1', '14/01/1988', '2019-01-24 15:41:46', NULL, 'Propia', 'Por medio de una compañera de estudios', 'kmcastel@uc.cl', 'Chilena', 'Karen', NULL, 'Chile', 'Santiago', '169262187', 'Licenciatura en artes visuales', '1334', '303', '54'
'214', '2019', 'Apala', 'Castel', '(56-9)75894836', 'Santiago', 'Mi titulación se realizó en este mes de Enero. Frente a esta situación no se han entregado los certificados oficiales. Sin embargo, se me ha extendido una carta de constancia por la coordinadora docente,  y se ha solicitado la más pronta entrega de los documentos requeridos.', 'Transversal Suárez Mujica 2900, depto 64', 'Pontificia Universidad Católica de Chile', '1', '14/01/1988', '2019-01-24 22:31:11', NULL, 'Propia', 'Por medio de una compañera de estudios', 'kmcastel@uc.cl', 'Chilena', 'Karen', NULL, 'Chile', 'Santiago', '169262187', 'Licenciatura en Artes Visuales', '1335', '303', '54'
'215', '2009', 'PACHECO', 'GALAZ', '995966226', 'Santiago', NULL, 'Santos Dumont 190', 'USACH', '1', '13/07/1979', '2019-01-26 16:04:39', '995966226', 'Privadas', 'Colegas', 'belem.galaz@gmail.com', 'Chilena', 'BELEM', 'Directora de Proyectos en Gestión Cultural y Educativa', 'Chile', 'Santiago de Chile', '136821431', 'Licenciada en Educación en Filosofía / Profesora de Estado en Filosofía', '1337', '315', '51'
'216', '2019', 'SALAZAR', 'VIDAL', '983003480', 'SANTIAGO', 'ADJUNTO CONSTANCIA DE EGRESO, YA QUE MI PROCESO DE LICENCIATURA ESTARÁ LISTO EN EL PERIODO DE MARZO-ABRIL ', 'PJE. GERMÁN GARCÉS 1814', 'UNIVERSIDAD DE CHILE', '1', '24-06-1994', '2019-01-28 01:49:11', '983003480', 'PADRES', 'EN CASA DE ESTUDIO', 'VALENTINA.VIDAL.S@GMAIL.COM', 'CHILENA', 'VALENTINA', 'ESTUDIANTE', 'CHILE', 'SANTIAGO', '186692551', 'LICENCIATURA EN PROCESO DE EGRESO', '1340', '300', '62'
'217', '2011, 2005.', 'Estades', 'Dañobeitia', '984147401', 'Stgo', NULL, 'Simon Bolivar 5978 dep. 303, La Reina', 'Universidad de las Américas, Taller de Musics', '1', '01/02/1974', '2019-01-28 15:58:13', '228912646', 'Ahorros, trabajo.', 'Internet', 'robjazz@gmail.com', 'Chile', 'Roberto', 'Docente, Presidente Fundación Músicos por Chile.', 'Chile', 'Chile, España.', '8668109-9', 'Licenciado en Música', '1341', '293', '62'
'218', '2012', 'Jara', 'Cornejo ', '56957537979', 'Santiago', 'He realizado ahorros para costear el magíster, además de tener un trabajo que me permite obtener los ingresos para llevar a cabo el postgrado.', 'Santa Isabel 361, Depto. 112', 'Universidad Metropolitana de Ciencias de la Educación (UMCE)', '1', '28/05/1989', '2019-01-28 18:45:49', '228563582', 'Cuenta Personal', 'Por docentes', 'lorenzo.cornejo.jara@gmail.com', 'Chileno', 'Lorenzo Miguel', 'Profesor', 'Chile', 'Ñuñoa, Santiago, R.M.', '17.168.803-5', 'Profesor de Educación Musical / Licenciado en Educación', '1342', NULL, '67'
'219', '2014', 'MORENO', 'SALDIAS', '9 45154928', 'ANTOFAGASTA', NULL, 'AV. ANTILHUE 01302 DEPTO 406. ED. DON MARCELO', 'UNIVERSIDAD CATOLICA DEL NORTE', '1', '21 MARZO 1986', '2019-01-28 18:54:30', '2 27203446', 'PROPIA', 'INTERNET', 'katerinesaldiasm@gmail.com', 'CHILENA', 'KATERINE', 'ARQUITECTO ASESOR PVP SUBDERE', 'CHILE', 'ANTOFAGASTA', '16.221.956-1', 'ARQUITECTO', '1343', '8', '60'
'220', '2007; 1996', 'Núñez', 'Quezada', '98449192', 'Santiago', NULL, 'Eliodoro Yáñez 1049, departamento 303. Providencia', 'Pontificia Universidad Católica de Valparaíso', '1', '11/03/1967', '2019-01-28 19:05:58', '98449192', 'Mi sueldo y ahorros personales', 'Por Internet', 'jequenu@gmail.com', 'Chilena', 'Jessica', 'Académica Universidad Alberto Hurtado; Directora de Coros', 'Chile', 'Valparaíso', '10299785-9', 'Intérprete Musical Mención Canto; Licenciatura en Ciencias y Artes Musicales', '1344', NULL, '50'
'221', NULL, 'Palma', 'Suárez', '9-72053695', 'San vicente de Tagua Tagua', NULL, 'Cristoforo Colombo #318', 'ninguno', '1', '29/12/1985', '2019-01-28 19:06:16', '72-2-326880', NULL, NULL, 'aline.suarez.85@gmail.com', 'chilena', 'Aline ', NULL, 'Chile', NULL, '16196422-0', 'ninguno', '1345', '110', '65'
'222', '2005', 'Casas', 'Aramburú ', '+511 990012055', 'Lima', NULL, 'Calle Los Meteorólogos 125 La Molina', 'Universidad Nacional Mayor de San Marcos', '1', '31/03/1973', '2019-01-29 17:39:15', NULL, 'Propias.', 'Por Internet, redes sociales.', 'rocioaramburuperu@gmail.com', 'Peruana', 'Carmen Rocío', 'Arqueóloga', 'Perú', 'Lima', '7063468', 'Licenciada en Arqueología', '1348', NULL, '60'
'223', '2012', 'Jara', 'Cornejo', '957537979', 'Santiago', NULL, 'Santa Isabel 361, dpto. 112', 'Universidad Metropolitana de Ciencias de la Educación (UMCE)', '1', '28/05/1989', '2019-01-29 18:34:19', '228563582', 'Cuenta personal', 'Por otros docentes', 'lorenzo.cornejo.jara@gmail.com', 'Chileno', 'Lorenzo Miguel', 'Profesor', 'Chile', 'Ñuñoa, Santiago', '17168803-5', 'Profesor de Educación Musical / Licenciado en Educación', '1349', '323', '67'
'224', '2014', 'MORENO', 'SALDIAS', '9 45154928', 'ANTOFAGASTA', NULL, 'AV. ANTILHUE 01302 DEPTO 406 ED. DON MARCELO', '2014', '1', '21 MARZO 1986', '2019-01-29 18:45:02', '2 27203446', 'PROPIAS', 'INTERNET', 'katerinesaldiasm@gmail.com', 'CHILENA', 'KATERINE', 'ASESOR PVP SUBDERE', 'CHILE', 'ANTOFAGASTA', '162219561', 'ARQUITECTO', '1350', '8', '60'
'225', '2015', 'Allende', 'Varas', NULL, 'Rancagua', NULL, 'El Nogal #1320', 'Universidad de Talca', '1', '21/03/1991', '2019-01-30 00:35:25', '955165492', 'Propio', 'Internet', 'daniel.varas.allende@gmail.com', 'Chilena', 'Daniel Rodrigo', 'Conservación arqueológica', 'Chile', 'Talca', '175216170', 'Diseñador', '1351', '105', '54'
'226', '2018', 'Zaror', 'Yarad', '89011342', 'Santiago', NULL, 'Camino el cerrillo 2415, linderos. Buin', 'Pontificia Universidad Católica', '1', '16/08/1995', '2019-01-30 00:54:10', '89011342', NULL, 'Internet', 'mtyarad@uc.cl', 'Chilena', 'María Trinidad ', 'Artista Visual', 'Chile', 'Campus Oriente', '190814475', 'Licenciatura Artes Visuales', '1352', '276', '55'
'227', '2018', 'Zaror', 'Yarad', '+56989011342', 'Santiago', NULL, 'Camino El Cerrillo 2415, Linderos, Buin', 'Pontificia Universidad Católica de Chile', '1', '16/08/95', '2019-01-30 18:15:44', NULL, NULL, 'Internet', 'mtyarad@uc.cl', 'chilena', 'María Trinidad', 'Artista Visual', 'Chile', 'Campus Oriente', '190814475', 'Licenciatura en Artes Visuales', '1354', NULL, '55'
'228', '2013', 'Peña', 'Araya', '+569 97331253', 'Santiago', NULL, 'Av. Condell 1807, depto. 1803', 'Pontificia Universidad Católica', '1', '24/05/1991', '2019-01-30 18:56:27', NULL, 'Propio', 'Internet', 'auaraya@uc.cl', 'Chilena', 'Ana Paula', 'Asistente de Producción Artística en Teatro Municipal de Santiago', 'Chile', NULL, '17702203-9', 'Licenciatura en Artes y Humanidades, Major en Gestión Cultural', '1355', '303', '60'
'229', '2010', 'Orellana', 'Arroyo', '982438683', 'Santiago', 'He recibido una formación musical en Guitarra previa a la Licenciatura obtenida en la Universidad de Chile, circunstancia explicada a la Directora del Programa de Magíster en Interpretación Musical en solicitud dirigida a su correo. La Dra. Paulina Zamora me ha invitado a postular online al programa, por recomendación del comité académico, la que será revisada.', 'San Luis 6522', 'Universidad de Chile', '1', '12 de Diciembre de 1971', '2019-01-30 19:06:58', '982438683', 'Beca, trabajo personal', 'Consulta a Directora del Programa', 'davidiv9@yahoo.es', 'Chileno', 'David Iván', 'Abogado', 'Chile', 'Providencia, Santiago', '14.427.543-8', 'Abogado', '1356', '289', '50'
'230', '2018', 'murillo', 'duarte', '976493219', 'santiago', 'He trabajado para juntar el dinero', 'psje las lluvias 1603', 'Universidad de Chile', '1', '01/06/1994', '2019-01-30 22:46:08', '29801574', 'particulares', 'En la universidad y via web', 'sebastian.duarte@ug.uchile.cl', 'chileno', 'sebastian', 'trabajador', 'Chile', 'Santiago. Las encinas', '187310865', 'licenciado en Artes con mención artes plásticas. actualmente se encuentra en trámite. estará disponible en marzo', '1358', '290', '47'
'231', '2004', 'Solari', 'Acosta', '961091712', 'Santiago', 'Entrega de declaración de propósitos y portafolio pendientes', 'Estados Unidos 355', 'Universidad Finis Terrae', '1', '21 octubre 1979', '2019-01-30 22:55:15', '-', 'Privado', 'Paula Anguita', 'virginia.acosta@gmail.com', 'Uruguay', 'Virginia', 'Artista', 'Chile', 'Providencia, Santiago', '221110706', 'Licenciada en artes plásticas', '1359', '323', '47'
'232', 'En trámite', 'Luxoro', 'Urrutia', '+56974178299', 'Santiago', NULL, 'Bremen 239-A Casa C', 'Pontificia Universidad Católica de Chile (en trámite)', '1', '19-03-1991', '2019-01-30 23:32:37', '223261250', 'Propias', 'Recomendación de egresados y docentes', 'luxoro.urrutia@gmail.com', 'Chilena', 'Antonio', 'Ayudante de cátedra y tesista', 'Chile', NULL, '17.700.781-1', 'Licenciado en Estética (en trámite)', '1360', '303', '49'
'233', '2018', 'Perez', 'Izquierdo', '983198273', 'Santiago', NULL, 'Luis Pasteur 6240', 'Universidad Finis Terrae', '1', '14.08.95', '2019-03-04 17:45:39', '983198273', 'Padre', 'Amigos', 'paula.izquierdopc@gmail.com', 'Chilena', 'Paula', 'Ninguna', 'Chile', 'Av. Pedro de Valdivia 1646', '19081709-1', 'Licenciada en Artes Visuales, Mención Pintura', '1370', '326', '48'
'234', '2001', 'tripailaf', 'sandoval', '988695544', 'Iquique', NULL, 'Arturo Fernandez 1371', 'Universidad de la Frontera', '1', '09/06/1977', '2019-03-05 01:07:28', NULL, 'Ahorro', 'Internet', 'tripailaf@hotmail.com', 'chilena', 'cecilia', 'Investigadora Independiente', 'chile', 'Temuco', '133999876', 'Asistente Social', '1371', '5', '54'
'235', '2001', 'Nicolet', 'Ercilla', '995167347', 'Santiago', 'Hice el postítulo en Arteterapia en la Universidad de Chile el año 2013 y 2014', 'Lonquimay 584', 'Universidad de Chile', '1', '23 marzo 1980', '2019-03-05 13:25:48', NULL, 'Doy clases regulares de yoga, talleres de yogadanza y arteterapia', 'Por mis compañeros de Universidad', 'pazercilla@gmail.com', 'Chilena', 'María Paz', 'Profesora de yoga, arteterapeuta', 'Chile', 'Las Encinas 3370', '137614561', 'Licenciada en Artes, mención Artes Visuales', '1372', '293', '47'
'236', '2014', 'Canto', 'Canto', '984411108', 'antofagasta', NULL, 'rancagua 575', 'Instituto profesional Aiep', '1', '11/10/1984', '2019-03-05 21:03:24', NULL, 'Ahorros e ingresos ', 'internet', 'danielacanto.rrpp@gmail.com', 'Chilena', 'Daniela', 'independiente', 'chile', 'Antofagasta', '159210030', 'Tecnico en Comunicaciones y Relaciones Publicas', '1377', '8', '65'
'237', '2015', 'Villanueva', 'Aguayo', '+56994199567', 'Santiago', NULL, 'Coventry 1934, depto. 802 TB', 'Pontificia Universidad Catolica de Chile', '1', '28/01/1984', '2019-03-09 23:22:53', NULL, 'Financiamiento Particular', 'Por Internet', 'pauli.aguayo.pa@gmail.com', 'Chilena', 'Paulina', 'Empresaria Independiente', 'Chile', 'Campus Oriente', '15593109-4', 'Licenciada en Arte', '1384', '303', '55'
'238', '1998', 'Haquin', 'Manghi', '998879788', 'Villa Alemana', 'Me interesa este programa para comenzar a incorporar el tema del patrimonio en investigación y proyectos, y poner en diálogo con temas semióticos y educativos.', 'Buenos Aires 1246', 'UMCE, y postgrado en PUCV', '1', '20/06/1970', '2019-03-10 18:59:57', NULL, 'propia', 'Página web del programa', 'd.manghi.h@gmail.com', 'chilena', 'Dominique', 'Profesora Universitaria, Investigadora', 'Chile', 'Santiago, Valparaíso', '7105989-8', 'Profesora de Educación Diferencial, Licenciada en Educación, Doctora en Linguistica', '1385', '76', '60'
'239', '2013', 'CONEJEROS', 'DÍAZ', '956925813', 'SANTIAGO', NULL, 'PJE LOS DUENDES 7452', 'IP ARCOS', '1', '10/02/1991', '2019-03-12 15:31:00', NULL, 'SUELDO FIJO', 'INTERNET', 'JDIAZC1991@GMAIL.COM', 'CHILENA', 'JUAN', 'TRABAJADOR DEPENDIENTE', 'CHILE', 'STO DOMINGO 789', '178330888', 'COMPOSITOR MUSICAL', '1386', '278', '57'
'240', '2014', 'Trigo', 'Alegría', '986626739', 'Santiago', '', 'Santiago', 'Universidad Católica Silva Henríquez ', '1', '04/06/1980 ', '2019-01-27 20:47:33', '986626739', 'Sueldo Propio', 'Internet', 'sandra.floydiana@gmail.com', 'Chilena', 'Sandra', 'Profesora de Artes Visuales ', 'Chile', 'Chile', '139086910', 'Profesora de Educación Artística mención Artes Visuales en Básica y Media.', '1339', '320', '55'
'242', '2016', 'Calderón', 'Chávez', '+56978845238', 'Santiago', 'Además, se postulará al financiamiento otorgado por el Ministerio de la Cultura, las Artes y el Patrimonio. ', 'Santa Elena 711. Depto 3.', 'UMCE', '1', '18 - 03- 1988', '2019-03-14 20:23:09', '+56978845238', 'Ahorros personales y del trabajo como porfesor y mediador cultural.', 'Personas que han cursado el programa y sitio web.', 'juliochavezcalderon@gmail.com', 'chilena', 'Julio Andrés', 'Profesor 3 Módulos de \"Museografía y Montaje\", AIEP y Mediador Cultural y Museografía parlante. MAC, Forestal.', 'Chile', 'Av. José Pedro Alessandri 774, Ñuñoa, Santiago - Chile', '16861901-4', 'Profesor de Artes Visuales', '1389', '323', '47'
'243', '2010', 'CARCAMO', 'QUELIN', '983676584', 'COYHAIQUE', NULL, 'IGNACIO SERRANO 1132', 'UNIVERSIDAD SAN SEBASTIAN', '1', '24 DE MARZO 1988', '2019-03-14 20:51:28', '672232103', 'PERSONALES', 'INDAGANDO EN INTERNET', 'DANIELA.QUELIN@GMAIL.COM', 'CHILENA', 'DANIELA', 'GESTORA CULTURAL', 'CHILE', 'PUERTO MONTT', '166848997', 'PROFESORA DE HISTORIA Y CIENCIAS SOCIALES', '1390', '259', '65'
'244', '2010', 'CARCAMO', 'QUELIN', '983676584', 'COYHAIQUE', NULL, 'IGNACIO SERRANO 1132', 'UNIVERSIDAD SAN SEBASTIAN', '1', '24 DE MARZO 1988', '2019-03-14 22:51:39', '672232103', 'PERSONALES', 'INDAGANDO POR INTERNET', 'DANIELA.QUELIN@GMAIL.COM', 'CHILENA', 'DANIELA', 'GESTORA CULTURAL', 'CHILE', 'PUERTO MONTT', '166848997', 'PROFESORA DE HISTORIA Y CIENCIAS SOCIALES', '1394', '259', '65'
'245', '2009', 'Campos', 'Gutierrez', '999199210', 'Santiago', 'Fui seleccionada en este Magister en el año 2015, me matriculé pero tuve que retirarme por motivos personales. Quiero cursarlo ahora, no sé si debo pagar nuevamente la cuota de postulación.', 'Jose Manuel Infante 2511 depto 1503', 'Pontificia Universidad Católica de Chile', '1', '26 agosto 1983', '2019-03-15 15:49:17', '999199210', 'Recursos propios', 'Internet', 'rsgutier@uc.cl', 'Chilena', 'Rebeca', 'Productora audiovisual', 'Chile', NULL, '151404340', 'Director Audiovisual y Periodista, Licenciada en Comunicación Social', '1395', '303', '51'
'246', '2009', 'LEIVA', 'CALDERON', '9 79281636', 'SANTIAGO', NULL, 'JANEQUEO 5991', 'UNIVERSIDAD SANTO TOMÁS', '1', '24 NOVIEMBRE 1986', '2019-03-15 16:28:09', '9 79281636', 'PROPIAS', 'INTERNET', 'taniacalderonleiva@gmail.com', 'CHILENA', 'TANIA', 'DIRECTORA DE ARTE', 'CHILE', 'CALLE EJERCITO', '16560850-k', 'DISEÑDOR GRÁFICO', '1396', '314', '47'
'247', '2005', 'Schwartz', 'Rojas ', '+56 9 68482496', 'Santiago', NULL, 'Macul', 'Universidad Arcis', '1', '28-09-1974', '2019-03-15 17:21:52', NULL, 'Beca', 'Pagina Universidad ', 'galeriacallejera@gmail.com', 'Chilena ', 'Pablo ', 'Productor ', 'Chile', 'Santiago - Chile', '10.034.095-k', 'Licenciado en Bellas Artes', '1397', '299', '51'
'248', '2010', 'Vallejos', 'Vergara', '988994006', 'Santiago', 'De ser aceptada en el programa me interesa postular a becas de la universidad.', 'Río Petrohue 4703, Villa el Alba', 'UMCE / PUC', '1', '01-10-1984', '2019-03-15 17:41:30', NULL, 'Becas / Personales', 'Feria de educacion', 'vivia.vergarav@gmail.com', 'Chilena', 'Viviana', 'Mediadora Cultural, Museo Violeta Parra', 'Chile', 'Santiago', '16509388-7', 'Licenciatura en Artes Visuales / Profesora de Educacion Media en Artes Plasticas ', '1399', '312', '52'
'249', '2005', 'Alfaro', 'Segovia', '971331048', 'Chile', NULL, 'Ochagavia 12508', 'UniV. De chile', '1', '28 06 1976', '2019-03-16 03:05:29', '999888927', 'Laboral', 'Prof. Johana teille', 'Lorenzo.segovia@yahoo.es', 'Chileno', 'Cristian lorenzo', 'Profesor artes educación primaria y secundaria', 'Chile', 'Chile', '106978557', 'Licenciado en artes c/m artes visuales', '1405', '283', '54'
'250', '2014', 'Aránguiz', 'Otárola', '997019752', 'Santiago', NULL, 'Manuel Rodríguez Norte 694, departamento 1218', 'Universidad de Santiago de Chile', '1', '19/03/1990', '2019-03-18 00:40:23', '997019752', 'Personales', 'Página Web', 'fotarolaaranguiz@gmail.com', 'Chileno', 'Fernando', 'Director Interino Liceo Experimental Artístico', 'Chile', 'Santiago', '175523294', 'Licenciado en Educación en Castellano, Profesor de Estado', '1406', '323', '51'
'251', '2014', 'Aránguiz', 'Otárola', '997019752', 'Santiago', NULL, 'Manuel Rodríguez 694, departamento 1218', 'Universidad de Santiago de Chile', '1', '19/03/1990', '2019-03-18 18:04:55', '997019752', 'Personales', 'Página Web institucional', 'fotarolaaranguiz@gmail.com', 'Chileno', 'Fernando', 'Director Interino Liceo Experimental Artístico', 'Chile', 'Santiago', '175523294', 'Profesor de Estado en Castellano, Licenciado en Educación en Castellano', '1415', '323', '51'
'252', '1992', 'WATTSON', 'BARRIOS', '997163496', 'SANTIAGO', NULL, 'CANUMANQUI 1822', 'UNIVERSIDAD DE CHILE', '1', '18 DE MAYO DE 1970', '2019-03-20 19:42:55', '997163496', 'FINANCIAMIENTO PROPIO', 'A TRAVES DE LA FACULTAD DE ARTES DE LA U DE CHILE', 'barrioswattson@yahoo.es', 'CHILENA', 'JULIO', 'CELLISTA ORQUESTA DE CAMARA DE CHILE Y PROFESOR DE CELLO EN FACULTAD DE ARTE U DE CHILE', 'CHILE', 'FACULTAD DE ARTES ', '116342421', 'INTERPRETE DE ORQUESTA CON MENCION EN VIOLONCELLO', '1421', '295', '50'
'253', 'prueba AA', 'JULIO D', 'JULIO C', '988776655', 'andacollo', 'prueba en la postulacion archivo de 10Mb', 'por alli 123', 'prueba Y', '1', '26-07-1985', '2019-03-26 16:55:11', '988678877', 'prueba HHH', 'prueba GGG', 'a@a.cl', 'Chilena', 'JULIO B', 'prueba ACV', 'Chile', 'prueba Z', 'JULIO A', 'prueba X', '1429', '29', '46'
'254', '2019', 'olivares', 'flores', '+56981439049', 'santiago', 'desarrollo laboral en la dirección y creación coreográfica de deportes artísticos, específicamente patinaje,donde vinculo las diferentes areas del arte para el deporte, así como en mis creaciones de danza contemporánea llevo el deporte a un arte inclusivo de diferentes áreas integradas.', 'pasaje foresta 5281', 'Universidad de Las Américas', '1', '20-02-1996', '2019-03-28 16:49:11', '25524445', 'laboral', 'internet', 'maiflores.oliv@gmail.com', 'chilena', 'maite', 'profesora', 'chile', 'providencia', '191288165', 'Interprete en Danza, licenciado', '1434', '320', '57'
'255', '2007', 'Toro', 'Araya', '56976265153', 'Castro', '', 'Castro', 'Universidad de La Serena ', '1', '07/07/1978', '2019-03-21 14:15:24', '56976265153', 'propias', 'Otros alumnos ', 'katerinearaya@yahoo.com ', 'Chilena', 'Katerine', 'Arquitecta independiente', 'Chile', 'Chile', '143857352', 'Arquitecto', '1423', '227', '59'
'256', '2013', 'Cáceres', 'Teare', '+56982553023', 'Santiago', NULL, 'Tucapel Jiménez 76', 'Duoc UC', '1', '17/08/1987', '2019-04-02 20:56:59', NULL, 'Crédito ', 'por la página de U de chile', 'oscar.teare@gmail.com', 'Chileno', 'Oscar ', 'Ingeniero en sonido en La Tercera TV', 'Chile', 'San Carlos de Apoquindo, Las Condes, Santiago', '16660005-7', 'Ingeniero en Sonido', '1438', '323', '57'
'257', '2013', 'Cáceres', 'Teare', '+56982553023', 'Santiago', NULL, 'Tucapel Jiménez 76', 'Duoc UC', '1', '17/08/1987', '2019-04-03 13:08:24', NULL, 'Crédito ', 'por la página de U de chile', 'oscar.teare@gmail.com', 'Chileno', 'Oscar ', 'Ingeniero en Sonido, La Tercera TV', 'Chile', 'San Carlos de Apoquindo, Las Condes, Santiago', '16660005-7', 'Ingeniero en Sonido', '1439', '323', '57'
'258', '2015', 'Garrido', 'Aravena', '56988248448', 'Santiago', NULL, 'Gorbea 2550, departamento 213', 'Universidad de Chile', '1', '24/08/1985', '2019-04-03 17:32:29', '56988248448', 'La mayoría ahorros y salario', 'Por internet', 'marianelaaravena@gmail.com', 'Chilena', 'Marianela Andrea', 'Profesora de Historia', 'Chile', 'Santiago, Juan Gomez Milla', '16125077-5', 'Magister en Historia', '1440', '323', '62'
'259', '2010', 'diploma gestion cultural v 2019', 'diploma gestion cultural v 2019', 'diploma gestion cultural v 2019', 'Carahue', 'diploma gestion cultural v 2019diploma gestion cultural v 2019diploma gestion cultural v 2019diploma gestion cultural v 2019diploma gestion cultural v 2019', 'diploma gestion cultural v 2019', 'diploma gestion cultural v 2019', '1', '21/06/1985', '2019-04-03 19:18:53', 'diploma gestion cultural v 2019', 'diploma gestion cultural v 2019', 'diploma gestion cultural v 2019', 'a@a.cl', 'chilena', 'diploma gestion cultural v 2019', 'diploma gestion cultural v 2019', 'chile', 'diploma gestion cultural v 2019', 'diploma gestion cultural v 2019', 'diploma gestion cultural v 2019', '1441', '21', '69'



		 ***/


		System.out.println("postulacion[j]:"+i);

		for(int j=0; j< arreglo.length; j++){
			if(arreglo[j]!=null && arreglo[j].getIdSolicitudPostulacion()>0){
				try{
					factoryServicioDAO.getSolicitudPostulacionServicio().crearSolicitudPostulacionDTO(arreglo[j]);
				}catch(Exception e){
					System.out.println("rechazo["+j+"] ->"+arreglo[j].getIdSolicitudPostulacion());
					e.printStackTrace();
				}
			}
		}

	}

}
