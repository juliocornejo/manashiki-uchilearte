package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.TipoSolicitudEntity;
import com.manashiki.uchilearte.negocio.model.TipoSolicitudModel;

public class TipoSolicitudModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static TipoSolicitudEntity TipoSolicitudModelToTipoSolicitudEntity(TipoSolicitudModel tipoSolicitudModel){

		TipoSolicitudEntity tipoSolicitudEntity=new TipoSolicitudEntity();
		if(tipoSolicitudModel==null){
			return new TipoSolicitudEntity();
		}
		else{
			tipoSolicitudEntity.setIdTipoSolicitud(tipoSolicitudModel.getIdTipoSolicitud());
			tipoSolicitudEntity.setCodigoTipoSolicitud(tipoSolicitudModel.getCodigoTipoSolicitud());
			tipoSolicitudEntity.setNombreTipoSolicitud(tipoSolicitudModel.getNombreTipoSolicitud());
			tipoSolicitudEntity.setEstadoTipoSolicitud(tipoSolicitudModel.getEstadoTipoSolicitud());
			tipoSolicitudEntity.setPrioridadTipoSolicitud(tipoSolicitudModel.getPrioridadTipoSolicitud());
		}
		
		return tipoSolicitudEntity;
	}

	public static List<TipoSolicitudEntity> ListTipoSolicitudModelToListTipoSolicitudEntity(List<TipoSolicitudModel> listaTipoSolicitudModel){

		List<TipoSolicitudEntity> listaTipoSolicitudEntity=new ArrayList<TipoSolicitudEntity>();

		if(listaTipoSolicitudModel==null || listaTipoSolicitudModel.size()==0){
			return new ArrayList<TipoSolicitudEntity>();
		}
		else{
			listaTipoSolicitudEntity=new ArrayList<TipoSolicitudEntity>();
			
			TipoSolicitudEntity tipoSolicitudEntity=new TipoSolicitudEntity();

			for(TipoSolicitudModel tipSolMod: listaTipoSolicitudModel){
				tipoSolicitudEntity=new TipoSolicitudEntity();
				
				tipoSolicitudEntity = TipoSolicitudModelToTipoSolicitudEntity(tipSolMod);

				listaTipoSolicitudEntity.add(tipoSolicitudEntity);
			}
		}

		return listaTipoSolicitudEntity;
	}

	public static TipoSolicitudModel TipoSolicitudEntityToTipoSolicitudModel(TipoSolicitudEntity tipoSolicitudEntity){

		TipoSolicitudModel tipoSolicitudModel=new TipoSolicitudModel();
		if(tipoSolicitudEntity==null){
			return new TipoSolicitudModel();
		}
		else{
			tipoSolicitudModel.setIdTipoSolicitud(tipoSolicitudEntity.getIdTipoSolicitud());
			tipoSolicitudModel.setCodigoTipoSolicitud(tipoSolicitudEntity.getCodigoTipoSolicitud());
			tipoSolicitudModel.setNombreTipoSolicitud(tipoSolicitudEntity.getNombreTipoSolicitud());
			tipoSolicitudModel.setEstadoTipoSolicitud(tipoSolicitudEntity.getEstadoTipoSolicitud());
			tipoSolicitudModel.setPrioridadTipoSolicitud(tipoSolicitudEntity.getPrioridadTipoSolicitud());
		}
		return tipoSolicitudModel;
	}

	public static List<TipoSolicitudModel> ListTipoSolicitudEntityToListTipoSolicitudModel(List<TipoSolicitudEntity> listaTipoSolicitudEntity){

		List<TipoSolicitudModel> listaTipoSolicitudModel=new ArrayList<TipoSolicitudModel>();

		if(listaTipoSolicitudEntity==null || listaTipoSolicitudEntity.size()==0){
			return new ArrayList<TipoSolicitudModel>();
		}
		else{
			listaTipoSolicitudModel=new ArrayList<TipoSolicitudModel>();
			TipoSolicitudModel tipoSolicitudModel=new TipoSolicitudModel();

			for(TipoSolicitudEntity tipSolEnt: listaTipoSolicitudEntity){
				tipoSolicitudModel=new TipoSolicitudModel();

				tipoSolicitudModel = TipoSolicitudEntityToTipoSolicitudModel(tipSolEnt);

				listaTipoSolicitudModel.add(tipoSolicitudModel);
			}
		}
		return listaTipoSolicitudModel;
	}
}
