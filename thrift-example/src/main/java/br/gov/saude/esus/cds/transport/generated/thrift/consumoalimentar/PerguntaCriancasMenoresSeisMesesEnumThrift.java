/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esus.cds.transport.generated.thrift.consumoalimentar;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum PerguntaCriancasMenoresSeisMesesEnumThrift implements org.apache.thrift.TEnum {
  A_CRIANCA_ONTEM_TOMOU_LEITE_DO_PEITO(1),
  MINGAU(3),
  AGUA_CHA(4),
  LEITE_VACA(5),
  FORMULA_INFANTIL(6),
  SUCO_FRUTA(7),
  FRUTA(8),
  COMIDA_DE_SAL(9),
  OUTROS_ALIMENTOS_BEBIDAS(10);

  private final int value;

  private PerguntaCriancasMenoresSeisMesesEnumThrift(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static PerguntaCriancasMenoresSeisMesesEnumThrift findByValue(int value) { 
    switch (value) {
      case 1:
        return A_CRIANCA_ONTEM_TOMOU_LEITE_DO_PEITO;
      case 3:
        return MINGAU;
      case 4:
        return AGUA_CHA;
      case 5:
        return LEITE_VACA;
      case 6:
        return FORMULA_INFANTIL;
      case 7:
        return SUCO_FRUTA;
      case 8:
        return FRUTA;
      case 9:
        return COMIDA_DE_SAL;
      case 10:
        return OUTROS_ALIMENTOS_BEBIDAS;
      default:
        return null;
    }
  }
}
