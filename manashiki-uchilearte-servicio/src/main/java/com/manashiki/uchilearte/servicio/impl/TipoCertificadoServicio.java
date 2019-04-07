package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.TipoCertificadoModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoCertificadoDTO;
import com.manashiki.uchilearte.servicio.ITipoCertificadoServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.TipoCertificadoDTOMapper;

@Service
public class TipoCertificadoServicio implements ITipoCertificadoServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(TipoCertificadoServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public TipoCertificadoDTO crearTipoCertificadoDTO(TipoCertificadoDTO tipoCertificadoDTO) {
		objLog.info("INI - crearTipoCertificadoDTO");
		TipoCertificadoModel tipoCertificado = new TipoCertificadoModel();
		tipoCertificado = TipoCertificadoDTOMapper.TipoCertificadoDTOToTipoCertificadoModel(tipoCertificadoDTO);

		tipoCertificado = factoryNegocioDAO.getTipoCertificadoNegocioDAO().crearTipoCertificadoModel(tipoCertificado);
		
		tipoCertificadoDTO = TipoCertificadoDTOMapper.TipoCertificadoModelToTipoCertificadoDTO(tipoCertificado);
		objLog.info("FIN - crearTipoCertificadoDTO "+tipoCertificadoDTO.getIdTipoCertificado());
		return tipoCertificadoDTO;

	}

	public TipoCertificadoDTO actualizarTipoCertificadoDTO(TipoCertificadoDTO tipoCertificadoDTO) {
		objLog.info("INI - actualizarTipoCertificadoDTO "+tipoCertificadoDTO.getIdTipoCertificado());
		TipoCertificadoModel tipoCertificado = new TipoCertificadoModel();
		tipoCertificado = TipoCertificadoDTOMapper.TipoCertificadoDTOToTipoCertificadoModel(tipoCertificadoDTO);

		tipoCertificado = factoryNegocioDAO.getTipoCertificadoNegocioDAO().actualizarTipoCertificadoModel(tipoCertificado);
		
		tipoCertificadoDTO = TipoCertificadoDTOMapper.TipoCertificadoModelToTipoCertificadoDTO(tipoCertificado);
		objLog.info("FIN - actualizarTipoCertificadoDTO "+tipoCertificadoDTO.getIdTipoCertificado());
		return tipoCertificadoDTO;

	}

	public TipoCertificadoDTO buscarTipoCertificadoxIdDTO(TipoCertificadoDTO tipoCertificadoDTO)throws ServicioImplException{
		objLog.info("INI - buscarTipoCertificadoxIdDTO "+tipoCertificadoDTO.getIdTipoCertificado());
		TipoCertificadoModel tipoCertificado = new TipoCertificadoModel();
		tipoCertificado = TipoCertificadoDTOMapper.TipoCertificadoDTOToTipoCertificadoModel(tipoCertificadoDTO);

		try {
			tipoCertificado=factoryNegocioDAO.getTipoCertificadoNegocioDAO().buscarTipoCertificadoxIdModel(tipoCertificado);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		tipoCertificadoDTO = TipoCertificadoDTOMapper.TipoCertificadoModelToTipoCertificadoDTO(tipoCertificado);
		
		objLog.info("FIN - buscarTipoCertificadoxIdDTO "+tipoCertificadoDTO.getIdTipoCertificado());
		return tipoCertificadoDTO;
	}

	public List<TipoCertificadoDTO> listarTipoCertificadoDTO() {
		objLog.info("INI - listarTipoCertificadoDTO");
		List<TipoCertificadoDTO> listaTipoCertificadoDTO=new ArrayList<TipoCertificadoDTO>();
		
		List<TipoCertificadoModel> listaTipoCertificadoes = new ArrayList<TipoCertificadoModel>();

		listaTipoCertificadoes=factoryNegocioDAO.getTipoCertificadoNegocioDAO().listarTipoCertificadoModel();

		listaTipoCertificadoDTO = TipoCertificadoDTOMapper.ListTipoCertificadoModelToListTipoCertificadoDTO(listaTipoCertificadoes);
		
		objLog.info("FIN - listarTipoCertificadoDTO "+listaTipoCertificadoDTO.size());
		
		return listaTipoCertificadoDTO;
	}
	
	public List<TipoCertificadoDTO> listarTipoCertificadoxEstadoDTO() {
		objLog.info("INI - listarTipoCertificadoOrdenDTO");
		
		List<TipoCertificadoDTO> listaTipoCertificadoDTO=new ArrayList<TipoCertificadoDTO>();
		
		List<TipoCertificadoModel> listaTipoCertificadoes = new ArrayList<TipoCertificadoModel>();

		listaTipoCertificadoes=factoryNegocioDAO.getTipoCertificadoNegocioDAO().listarTipoCertificadoxEstadoModel();

		listaTipoCertificadoDTO = TipoCertificadoDTOMapper.ListTipoCertificadoModelToListTipoCertificadoDTO(listaTipoCertificadoes);
		
		objLog.info("FIN - listarTipoCertificadoOrdenDTO "+listaTipoCertificadoDTO.size());
		
		return listaTipoCertificadoDTO;
	}

}
