package serg;

import serg.devices.*;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private HardDisk hard;
    private Monitor monitor;
    private CustomerClipboard clipboard;

    public Computer(Cpu cpu, Memory ddr, HardDisk ssd, Monitor monitor, CustomerClipboard clipboard) {
        this.cpu = cpu;
        this.memory = ddr;
        this.hard = ssd;
        this.monitor = monitor;
        this.clipboard = clipboard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHard() {
        return hard;
    }

    public void setHard(HardDisk hard) {
        this.hard = hard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public CustomerClipboard getClipboard() {
        return clipboard;
    }

    public void setClipboard(CustomerClipboard clipboard) {
        this.clipboard = clipboard;
    }
}
