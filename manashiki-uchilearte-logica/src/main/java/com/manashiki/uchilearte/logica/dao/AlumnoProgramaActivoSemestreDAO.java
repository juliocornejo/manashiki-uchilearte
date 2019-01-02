package com.manashiki.uchilearte.logica.dao;


import java.util.List;

import com.manashiki.uchilearte.logica.entidad.AlumnoProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;

public interface AlumnoProgramaActivoSemestreDAO{
	
	public AlumnoProgramaActivoSemestreEntity crearAlumnoProgramaActivoSemestreEntity(AlumnoProgramaActivoSemestreEntity objAlumnoProgramaActivoSemestreEntity );
	public AlumnoProgramaActivoSemestreEntity actualizarAlumnoProgramaActivoSemestreEntity(AlumnoProgramaActivoSemestreEntity objAlumnoProgramaActivoSemestreEntity );
 	public AlumnoProgramaActivoSemestreEntity buscarAlumnoProgramaActivoSemestrexIdEntity(AlumnoProgramaActivoSemestreEntity objAlumnoProgramaActivoSemestreEntity ) throws PersistenceImplException;
 	public List<AlumnoProgramaActivoSemestreEntity> listarAlumnoProgramaActivoSemestreEntity();
}