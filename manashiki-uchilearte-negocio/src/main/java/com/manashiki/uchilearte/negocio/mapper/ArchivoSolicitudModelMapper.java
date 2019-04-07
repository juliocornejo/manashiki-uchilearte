package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ArchivoSolicitudEntity;
import com.manashiki.uchilearte.negocio.model.ArchivoSolicitudModel;

import vijnana.utilidades.component.utilidades.DateMapper;

public class ArchivoSolicitudModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static ArchivoSolicitudEntity ArchivoSolicitudModelToArchivoSolicitudEntity(ArchivoSolicitudModel archivoSolicitudModel){

		ArchivoSolicitudEntity archivoSolicitudEntity=new ArchivoSolicitudEntity();

		if(archivoSolicitudModel==null){
			return new ArchivoSolicitudEntity();
		}
		else{
			archivoSolicitudEntity.setIdArchivoSolicitud(archivoSolicitudModel.getIdArchivoSolicitud());
			archivoSolicitudEntity.setNombreArchivoSolicitud(archivoSolicitudModel.getNombreArchivoSolicitud());
			archivoSolicitudEntity.setDireccionAlmacenamientoArchivoSolicitud(archivoSolicitudModel.getDireccionAlmacenamientoArchivoSolicitud());
			archivoSolicitudEntity.setTipoArchivoSolicitud(archivoSolicitudModel.getTipoArchivoSolicitud());
			archivoSolicitudEntity.setFechaArchivo(DateMapper.DateUtilToTimestamp(archivoSolicitudModel.getFechaArchivo()));
		}
		return archivoSolicitudEntity;
	}

	public static List<ArchivoSolicitudEntity> ListArchivoSolicitudModelToListArchivoSolicitudEntity(List<ArchivoSolicitudModel> listaArchivoSolicitudModel){

		List<ArchivoSolicitudEntity> listaArchivoSolicitudEntity=new ArrayList<ArchivoSolicitudEntity>();

		if(listaArchivoSolicitudModel==null || listaArchivoSolicitudModel.size()==0){
			return new ArrayList<ArchivoSolicitudEntity>();
		}
		else{
			listaArchivoSolicitudEntity=new ArrayList<ArchivoSolicitudEntity>();
			
			ArchivoSolicitudEntity archivoSolicitudEntity=new ArchivoSolicitudEntity();

			for(ArchivoSolicitudModel arcSolAcaMod: listaArchivoSolicitudModel){
				archivoSolicitudEntity=new ArchivoSolicitudEntity();
				
				archivoSolicitudEntity = ArchivoSolicitudModelToArchivoSolicitudEntity(arcSolAcaMod);

				listaArchivoSolicitudEntity.add(archivoSolicitudEntity);
			}
		}

		return listaArchivoSolicitudEntity;
	}

	public static ArchivoSolicitudModel ArchivoSolicitudEntityToArchivoSolicitudModel(ArchivoSolicitudEntity archivoSolicitudEntity){

		ArchivoSolicitudModel archivoSolicitudModel=new ArchivoSolicitudModel();
		if(archivoSolicitudEntity==null){
			return new ArchivoSolicitudModel();
		}
		else{
			archivoSolicitudModel.setIdArchivoSolicitud(archivoSolicitudEntity.getIdArchivoSolicitud());
			archivoSolicitudModel.setNombreArchivoSolicitud(archivoSolicitudEntity.getNombreArchivoSolicitud());
			archivoSolicitudModel.setDireccionAlmacenamientoArchivoSolicitud(archivoSolicitudEntity.getDireccionAlmacenamientoArchivoSolicitud());
			archivoSolicitudModel.setTipoArchivoSolicitud(archivoSolicitudEntity.getTipoArchivoSolicitud());
			archivoSolicitudModel.setFechaArchivo(DateMapper.TimestampToDateUtil(archivoSolicitudEntity.getFechaArchivo()));
		}
		return archivoSolicitudModel;
	}

	public static List<ArchivoSolicitudModel> ListArchivoSolicitudEntityToListArchivoSolicitudModel(List<ArchivoSolicitudEntity> listaArchivoSolicitudEntity){

		List<ArchivoSolicitudModel> listaArchivoSolicitudModel=new ArrayList<ArchivoSolicitudModel>();

		if(listaArchivoSolicitudEntity==null || listaArchivoSolicitudEntity.size()==0){
			return new ArrayList<ArchivoSolicitudModel>();
		}
		else{
			listaArchivoSolicitudModel=new ArrayList<ArchivoSolicitudModel>();
			ArchivoSolicitudModel archivoSolicitudModel=new ArchivoSolicitudModel();

			for(ArchivoSolicitudEntity arcSolAcaEnt: listaArchivoSolicitudEntity){
				archivoSolicitudModel=new ArchivoSolicitudModel();
				archivoSolicitudModel = ArchivoSolicitudEntityToArchivoSolicitudModel(arcSolAcaEnt);
				listaArchivoSolicitudModel.add(archivoSolicitudModel);
			}
		}
		return listaArchivoSolicitudModel;
	}
}
