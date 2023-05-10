package com.ssafy.wonik.service;

import com.ssafy.wonik.domain.dto.*;
import com.ssafy.wonik.domain.entity.Machine;
import com.ssafy.wonik.repository.MachineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MachineServiceImpl implements MachineService{

    private final MachineRepository machineRepository;

    @Override
    public List<Machine> findAll() {
        return machineRepository.findAll();
    }

    @Override
    public ComponentRootDto findMachine(String machineName) {
        List<ComponentRootDto> list = machineRepository.findMachine(machineName);
        ComponentRootDto componentRootDto = list.get(0);
        return componentRootDto;
    }

    @Override
    public GraphResponseDto  findGraph(GraphInputDto graphInputDto) {
        GraphResponseDto graphData = machineRepository.findGraph(graphInputDto);
        return graphData;
    }

    @Override
    public List<MachineToModuleDto> findRecentModuleData(String machineName) {
        return machineRepository.findRecentModuleData(machineName);
    }

    @Override
    public List<ResultDataDto> findGraphData(GraphInputDto graphInputDto) {
        List<ResultDataDto> resultDataDto = machineRepository.findGraphData(graphInputDto);
        return resultDataDto;
    }

    @Override
    public List<MachineToModuleDto> findRecentComponentData(ModuleToComponentInputDto moduleToComponentInputDto) {
        return machineRepository.findRecentComponentData(moduleToComponentInputDto);
    }
}