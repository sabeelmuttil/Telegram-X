package org.thunderdog.challegram.tool;

public class TGPhoneFormat {
  public static String build (final String in, boolean needEnd) {
    final int length = in.length();
    String result = buildImpl(in, length);
    if (result == null) {
      int expectedNumberLength = getExpectedNumberLength(in);
      if (expectedNumberLength != -1 && length != expectedNumberLength) {
        if (length > expectedNumberLength) {
          result = buildImpl(in, expectedNumberLength);
          if (result != null) {
            return result + in.substring(expectedNumberLength);
          }
        } else {
          int addedZeros = expectedNumberLength - length;
          StringBuilder b = new StringBuilder(in);
          b.ensureCapacity(in.length() + addedZeros);
          for (int i = 0; i < addedZeros; i++) {
            b.append('0');
          }
          String tempResult = buildImpl(b.toString(), expectedNumberLength);
          if (tempResult != null) {
            int end = tempResult.length();
            char c;
            while (end > 0 && (!Character.isDigit(c = tempResult.charAt(end - 1)) || addedZeros > 0)) {
              if (addedZeros > 0) {
                if (c == '0') {
                  addedZeros--;
                }
              } else if (c == ')' && needEnd) {
                break;
              }
              end--;
            }
            if (end != 0 && end != tempResult.length()) {
              return tempResult.substring(0, end);
            }
          }
        }
      }
    }
    return result;
  }
  private static String buildImpl (final String in, final int length) {
    switch (length) {
      case 11:
        if (in.startsWith("1649")) {
          return new StringBuilder(14).append("+1649 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1473")) {
          return new StringBuilder(14).append("+1473 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1664")) {
          return new StringBuilder(14).append("+1664 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1670")) {
          return new StringBuilder(14).append("+1670 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1671")) {
          return new StringBuilder(14).append("+1671 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1441")) {
          return new StringBuilder(14).append("+1441 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1345")) {
          return new StringBuilder(14).append("+1345 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1264")) {
          return new StringBuilder(14).append("+1264 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1242")) {
          return new StringBuilder(14).append("+1242 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1268")) {
          return new StringBuilder(14).append("+1268 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1284")) {
          return new StringBuilder(14).append("+1284 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1340")) {
          return new StringBuilder(14).append("+1340 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1684")) {
          return new StringBuilder(14).append("+1684 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1246")) {
          return new StringBuilder(14).append("+1246 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1721")) {
          return new StringBuilder(14).append("+1721 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1849")) {
          return new StringBuilder(14).append("+1849 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1869")) {
          return new StringBuilder(14).append("+1869 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1876")) {
          return new StringBuilder(14).append("+1876 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1939")) {
          return new StringBuilder(14).append("+1939 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1829")) {
          return new StringBuilder(14).append("+1829 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1868")) {
          return new StringBuilder(14).append("+1868 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1809")) {
          return new StringBuilder(14).append("+1809 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1758")) {
          return new StringBuilder(14).append("+1758 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1767")) {
          return new StringBuilder(14).append("+1767 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1784")) {
          return new StringBuilder(14).append("+1784 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1787")) {
          return new StringBuilder(14).append("+1787 ").append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("253")) {
          return new StringBuilder(16).append("+253 ").append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).append(' ').append(in, 9, 11).toString();
        } else if (in.startsWith("350")) {
          return new StringBuilder(14).append("+350 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("268")) {
          return new StringBuilder(14).append("+268 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("267")) {
          return new StringBuilder(15).append("+267 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("266")) {
          return new StringBuilder(15).append("+266 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("229")) {
          return new StringBuilder(15).append("+229 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("223")) {
          return new StringBuilder(16).append("+223 ").append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).append(' ').append(in, 9, 11).toString();
        } else if (in.startsWith("222")) {
          return new StringBuilder(14).append("+222 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("225")) {
          return new StringBuilder(16).append("+225 ").append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).append(' ').append(in, 9, 11).toString();
        } else if (in.startsWith("227")) {
          return new StringBuilder(16).append("+227 ").append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).append(' ').append(in, 9, 11).toString();
        } else if (in.startsWith("226")) {
          return new StringBuilder(16).append("+226 ").append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).append(' ').append(in, 9, 11).toString();
        } else if (in.startsWith("216")) {
          return new StringBuilder(15).append("+216 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("228")) {
          return new StringBuilder(15).append("+228 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("232")) {
          return new StringBuilder(15).append("+232 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("236")) {
          return new StringBuilder(16).append("+236 ").append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).append(' ').append(in, 9, 11).toString();
        } else if (in.startsWith("965")) {
          return new StringBuilder(14).append("+965 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("968")) {
          return new StringBuilder(14).append("+968 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("880")) {
          return new StringBuilder(15).append("+880 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("599")) {
          return new StringBuilder(15).append("+599 ").append(in.charAt(3)).append(' ').append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("993")) {
          return new StringBuilder(14).append("+993 ").append(in, 3, 5).append(' ').append(in, 5, 11).toString();
        } else if (in.startsWith("974")) {
          return new StringBuilder(15).append("+974 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("973")) {
          return new StringBuilder(14).append("+973 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("975")) {
          return new StringBuilder(15).append("+975 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("976")) {
          return new StringBuilder(15).append("+976 ").append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("356")) {
          return new StringBuilder(16).append("+356 ").append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).append(' ').append(in, 9, 11).toString();
        } else if (in.startsWith("855")) {
          return new StringBuilder(15).append("+855 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("381")) {
          return new StringBuilder(15).append("+381 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("503")) {
          return new StringBuilder(14).append("+503 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("502")) {
          return new StringBuilder(14).append("+502 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("377")) {
          return new StringBuilder(14).append("+377 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("357")) {
          return new StringBuilder(14).append("+357 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("853")) {
          return new StringBuilder(14).append("+853 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("370")) {
          return new StringBuilder(14).append("+370 ").append(in, 3, 6).append(' ').append(in, 6, 11).toString();
        } else if (in.startsWith("371")) {
          return new StringBuilder(14).append("+371 ").append(in, 3, 6).append(' ').append(in, 6, 11).toString();
        } else if (in.startsWith("373")) {
          return new StringBuilder(14).append("+373 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("504")) {
          return new StringBuilder(14).append("+504 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("598")) {
          return new StringBuilder(15).append("+598 ").append(in.charAt(3)).append(' ').append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("686")) {
          return new StringBuilder(14).append("+686 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("505")) {
          return new StringBuilder(14).append("+505 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("852")) {
          return new StringBuilder(15).append("+852 ").append(in.charAt(3)).append(' ').append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("675")) {
          return new StringBuilder(15).append("+675 ").append(in, 3, 6).append(' ').append(in, 6, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("506")) {
          return new StringBuilder(14).append("+506 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("509")) {
          return new StringBuilder(14).append("+509 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("591")) {
          return new StringBuilder(15).append("+591 ").append(in.charAt(3)).append(' ').append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("507")) {
          return new StringBuilder(14).append("+507 ").append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("43")) {
          return new StringBuilder(14).append("+43 ").append(in, 2, 6).append(' ').append(in, 6, 11).toString();
        } else if (in.startsWith("46")) {
          return new StringBuilder(15).append("+46 ").append(in, 2, 4).append(' ').append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("41")) {
          return new StringBuilder(15).append("+41 ").append(in, 2, 4).append(' ').append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("51")) {
          return new StringBuilder(15).append("+51 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("48")) {
          return new StringBuilder(16).append("+48 ").append(in, 2, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).append(' ').append(in, 9, 11).toString();
        } else if (in.startsWith("32")) {
          return new StringBuilder(16).append("+32 ").append(in, 2, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).append(' ').append(in, 9, 11).toString();
        } else if (in.startsWith("56")) {
          return new StringBuilder(15).append("+56 ").append(in.charAt(2)).append(' ').append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("31")) {
          return new StringBuilder(17).append("+31 ").append(in.charAt(2)).append(' ').append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).append(' ').append(in, 9, 11).toString();
        } else if (in.startsWith("33")) {
          return new StringBuilder(17).append("+33 ").append(in.charAt(2)).append(' ').append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).append(' ').append(in, 9, 11).toString();
        } else if (in.startsWith("39")) {
          return new StringBuilder(15).append("+39 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("36")) {
          return new StringBuilder(15).append("+36 ").append(in, 2, 4).append(' ').append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("34")) {
          return new StringBuilder(15).append("+34 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("40")) {
          return new StringBuilder(15).append("+40 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("84")) {
          return new StringBuilder(15).append("+84 ").append(in, 2, 4).append(' ').append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("82")) {
          return new StringBuilder(15).append("+82 ").append(in, 2, 4).append(' ').append(in, 4, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("93")) {
          return new StringBuilder(15).append("+93 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 11).toString();
        } else if (in.startsWith("94")) {
          return new StringBuilder(15).append("+94 ").append(in, 2, 4).append(' ').append(in, 4, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("61")) {
          return new StringBuilder(15).append("+61 ").append(in.charAt(2)).append(' ').append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("62")) {
          return new StringBuilder(14).append("+62 ").append(in, 2, 5).append(' ').append(in, 5, 11).toString();
        } else if (in.startsWith("66")) {
          return new StringBuilder(15).append("+66 ").append(in.charAt(2)).append(' ').append(in, 3, 7).append(' ').append(in, 7, 11).toString();
        } else if (in.startsWith("1")) {
          return new StringBuilder(17).append("+1 (").append(in, 1, 4).append(") ").append(in, 4, 7).append('-').append(in, 7, 11).toString();
        } else if (in.startsWith("7")) {
          return new StringBuilder(18).append("+7 (").append(in, 1, 4).append(") ").append(in, 4, 7).append('-').append(in, 7, 9).append('-').append(in, 9, 11).toString();
        }
        break;
      case 12:
        if (in.startsWith("260")) {
          return new StringBuilder(16).append("+260 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("258")) {
          return new StringBuilder(16).append("+258 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("261")) {
          return new StringBuilder(17).append("+261 ").append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 10).append(' ').append(in, 10, 12).toString();
        } else if (in.startsWith("264")) {
          return new StringBuilder(16).append("+264 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("263")) {
          return new StringBuilder(16).append("+263 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("262")) {
          return new StringBuilder(16).append("+262 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("249")) {
          return new StringBuilder(16).append("+249 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("250")) {
          return new StringBuilder(16).append("+250 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("265")) {
          return new StringBuilder(16).append("+265 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("251")) {
          return new StringBuilder(16).append("+251 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("255")) {
          return new StringBuilder(16).append("+255 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("254")) {
          return new StringBuilder(16).append("+254 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("256")) {
          return new StringBuilder(16).append("+256 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("351")) {
          return new StringBuilder(16).append("+351 ").append(in.charAt(3)).append(' ').append(in, 4, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("352")) {
          return new StringBuilder(16).append("+352 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("224")) {
          return new StringBuilder(16).append("+224 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("221")) {
          return new StringBuilder(16).append("+221 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("212")) {
          return new StringBuilder(16).append("+212 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("211")) {
          return new StringBuilder(16).append("+211 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("213")) {
          return new StringBuilder(17).append("+213 ").append(in, 3, 6).append(' ').append(in, 6, 8).append(' ').append(in, 8, 10).append(' ').append(in, 10, 12).toString();
        } else if (in.startsWith("218")) {
          return new StringBuilder(16).append("+218 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("355")) {
          return new StringBuilder(16).append("+355 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("240")) {
          return new StringBuilder(16).append("+240 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("243")) {
          return new StringBuilder(16).append("+243 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("244")) {
          return new StringBuilder(16).append("+244 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("233")) {
          return new StringBuilder(16).append("+233 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("237")) {
          return new StringBuilder(18).append("+237 ").append(in.charAt(3)).append(' ').append(in, 4, 6).append(' ').append(in, 6, 8).append(' ').append(in, 8, 10).append(' ').append(in, 10, 12).toString();
        } else if (in.startsWith("966")) {
          return new StringBuilder(16).append("+966 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("967")) {
          return new StringBuilder(16).append("+967 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("970")) {
          return new StringBuilder(16).append("+970 ").append(in, 3, 6).append(' ').append(in, 6, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("963")) {
          return new StringBuilder(16).append("+963 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("962")) {
          return new StringBuilder(16).append("+962 ").append(in.charAt(3)).append(' ').append(in, 4, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("886")) {
          return new StringBuilder(16).append("+886 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("971")) {
          return new StringBuilder(16).append("+971 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("972")) {
          return new StringBuilder(16).append("+972 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("995")) {
          return new StringBuilder(16).append("+995 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("994")) {
          return new StringBuilder(16).append("+994 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("996")) {
          return new StringBuilder(15).append("+996 ").append(in, 3, 6).append(' ').append(in, 6, 12).toString();
        } else if (in.startsWith("998")) {
          return new StringBuilder(15).append("+998 ").append(in, 3, 5).append(' ').append(in, 5, 12).toString();
        } else if (in.startsWith("992")) {
          return new StringBuilder(16).append("+992 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("387")) {
          return new StringBuilder(16).append("+387 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("420")) {
          return new StringBuilder(16).append("+420 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("421")) {
          return new StringBuilder(16).append("+421 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("380")) {
          return new StringBuilder(17).append("+380 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 10).append(' ').append(in, 10, 12).toString();
        } else if (in.startsWith("593")) {
          return new StringBuilder(16).append("+593 ").append(in, 3, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("595")) {
          return new StringBuilder(16).append("+595 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 12).toString();
        } else if (in.startsWith("44")) {
          return new StringBuilder(15).append("+44 ").append(in, 2, 6).append(' ').append(in, 6, 12).toString();
        } else if (in.startsWith("55")) {
          return new StringBuilder(15).append("+55 ").append(in, 2, 4).append(' ').append(in, 4, 12).toString();
        } else if (in.startsWith("30")) {
          return new StringBuilder(16).append("+30 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("20")) {
          return new StringBuilder(16).append("+20 ").append(in, 2, 4).append(' ').append(in, 4, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("90")) {
          return new StringBuilder(16).append("+90 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("91")) {
          return new StringBuilder(15).append("+91 ").append(in, 2, 7).append(' ').append(in, 7, 12).toString();
        } else if (in.startsWith("92")) {
          return new StringBuilder(16).append("+92 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("98")) {
          return new StringBuilder(16).append("+98 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("57")) {
          return new StringBuilder(16).append("+57 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("81")) {
          return new StringBuilder(16).append("+81 ").append(in, 2, 4).append(' ').append(in, 4, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("60")) {
          return new StringBuilder(16).append("+60 ").append(in, 2, 4).append(' ').append(in, 4, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("58")) {
          return new StringBuilder(16).append("+58 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        } else if (in.startsWith("63")) {
          return new StringBuilder(16).append("+63 ").append(in, 2, 5).append(' ').append(in, 5, 8).append(' ').append(in, 8, 12).toString();
        }
        break;
      case 9:
        if (in.startsWith("672")) {
          return new StringBuilder(13).append("+672 ").append(in.charAt(3)).append(' ').append(in, 4, 6).append(' ').append(in, 6, 9).toString();
        } else if (in.startsWith("299")) {
          return new StringBuilder(12).append("+299 ").append(in, 3, 6).append(' ').append(in, 6, 9).toString();
        } else if (in.startsWith("298")) {
          return new StringBuilder(12).append("+298 ").append(in, 3, 6).append(' ').append(in, 6, 9).toString();
        } else if (in.startsWith("376")) {
          return new StringBuilder(13).append("+376 ").append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 9).toString();
        }
        break;
      case 10:
        if (in.startsWith("354")) {
          return new StringBuilder(13).append("+354 ").append(in, 3, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("248")) {
          return new StringBuilder(15).append("+248 ").append(in.charAt(3)).append(' ').append(in, 4, 6).append(' ').append(in, 6, 8).append(' ').append(in, 8, 10).toString();
        } else if (in.startsWith("269")) {
          return new StringBuilder(13).append("+269 ").append(in, 3, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("291")) {
          return new StringBuilder(14).append("+291 ").append(in.charAt(3)).append(' ').append(in, 4, 7).append(' ').append(in, 7, 10).toString();
        } else if (in.startsWith("220")) {
          return new StringBuilder(13).append("+220 ").append(in, 3, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("241")) {
          return new StringBuilder(15).append("+241 ").append(in.charAt(3)).append(' ').append(in, 4, 6).append(' ').append(in, 6, 8).append(' ').append(in, 8, 10).toString();
        } else if (in.startsWith("245")) {
          return new StringBuilder(13).append("+245 ").append(in, 3, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("239")) {
          return new StringBuilder(13).append("+239 ").append(in, 3, 5).append(' ').append(in, 5, 10).toString();
        } else if (in.startsWith("238")) {
          return new StringBuilder(13).append("+238 ").append(in, 3, 5).append(' ').append(in, 5, 10).toString();
        } else if (in.startsWith("246")) {
          return new StringBuilder(13).append("+246 ").append(in, 3, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("297")) {
          return new StringBuilder(13).append("+297 ").append(in, 3, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("960")) {
          return new StringBuilder(13).append("+960 ").append(in, 3, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("961")) {
          return new StringBuilder(14).append("+961 ").append(in.charAt(3)).append(' ').append(in, 4, 7).append(' ').append(in, 7, 10).toString();
        } else if (in.startsWith("673")) {
          return new StringBuilder(13).append("+673 ").append(in, 3, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("597")) {
          return new StringBuilder(13).append("+597 ").append(in, 3, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("45")) {
          return new StringBuilder(13).append("+45 ").append(in, 2, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("47")) {
          return new StringBuilder(13).append("+47 ").append(in, 2, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("95")) {
          return new StringBuilder(13).append("+95 ").append(in.charAt(2)).append(' ').append(in, 3, 10).toString();
        } else if (in.startsWith("65")) {
          return new StringBuilder(13).append("+65 ").append(in, 2, 6).append(' ').append(in, 6, 10).toString();
        } else if (in.startsWith("64")) {
          return new StringBuilder(13).append("+64 ").append(in, 2, 6).append(' ').append(in, 6, 10).toString();
        }
        break;
      case 8:
        if (in.startsWith("290")) {
          return new StringBuilder(11).append("+290 ").append(in, 3, 5).append(' ').append(in, 5, 8).toString();
        }
        break;
      case 13:
        if (in.startsWith("234")) {
          return new StringBuilder(17).append("+234 ").append(in, 3, 5).append(' ').append(in, 5, 9).append(' ').append(in, 9, 13).toString();
        } else if (in.startsWith("964")) {
          return new StringBuilder(17).append("+964 ").append(in, 3, 6).append(' ').append(in, 6, 9).append(' ').append(in, 9, 13).toString();
        } else if (in.startsWith("856")) {
          return new StringBuilder(18).append("+856 ").append(in, 3, 5).append(' ').append(in, 5, 7).append(' ').append(in, 7, 10).append(' ').append(in, 10, 13).toString();
        } else if (in.startsWith("977")) {
          return new StringBuilder(17).append("+977 ").append(in, 3, 5).append(' ').append(in, 5, 9).append(' ').append(in, 9, 13).toString();
        } else if (in.startsWith("49")) {
          return new StringBuilder(18).append("+49 ").append(in, 2, 4).append(' ').append(in, 4, 7).append(' ').append(in, 7, 10).append(' ').append(in, 10, 13).toString();
        } else if (in.startsWith("86")) {
          return new StringBuilder(17).append("+86 ").append(in, 2, 5).append(' ').append(in, 5, 9).append(' ').append(in, 9, 13).toString();
        }
        break;
    }
    return null;
  }
  public static int getExpectedNumberLength (String in) {
    if (in.startsWith("1649") || in.startsWith("1473") || in.startsWith("1664") || in.startsWith("1670") || in.startsWith("1671") || in.startsWith("1441") || in.startsWith("1345") || in.startsWith("1264") || in.startsWith("1242") || in.startsWith("1268") || in.startsWith("1284") || in.startsWith("1340") || in.startsWith("1684") || in.startsWith("1246") || in.startsWith("1721") || in.startsWith("1849") || in.startsWith("1869") || in.startsWith("1876") || in.startsWith("1939") || in.startsWith("1829") || in.startsWith("1868") || in.startsWith("1809") || in.startsWith("1758") || in.startsWith("1767") || in.startsWith("1784") || in.startsWith("1787") || in.startsWith("253") || in.startsWith("350") || in.startsWith("268") || in.startsWith("267") || in.startsWith("266") || in.startsWith("229") || in.startsWith("223") || in.startsWith("222") || in.startsWith("225") || in.startsWith("227") || in.startsWith("226") || in.startsWith("216") || in.startsWith("228") || in.startsWith("232") || in.startsWith("236") || in.startsWith("965") || in.startsWith("968") || in.startsWith("880") || in.startsWith("599") || in.startsWith("993") || in.startsWith("974") || in.startsWith("973") || in.startsWith("975") || in.startsWith("976") || in.startsWith("356") || in.startsWith("855") || in.startsWith("381") || in.startsWith("503") || in.startsWith("502") || in.startsWith("377") || in.startsWith("357") || in.startsWith("853") || in.startsWith("370") || in.startsWith("371") || in.startsWith("373") || in.startsWith("504") || in.startsWith("598") || in.startsWith("686") || in.startsWith("505") || in.startsWith("852") || in.startsWith("675") || in.startsWith("506") || in.startsWith("509") || in.startsWith("591") || in.startsWith("507") || in.startsWith("43") || in.startsWith("46") || in.startsWith("41") || in.startsWith("51") || in.startsWith("48") || in.startsWith("32") || in.startsWith("56") || in.startsWith("31") || in.startsWith("33") || in.startsWith("39") || in.startsWith("36") || in.startsWith("34") || in.startsWith("40") || in.startsWith("84") || in.startsWith("82") || in.startsWith("93") || in.startsWith("94") || in.startsWith("61") || in.startsWith("62") || in.startsWith("66") || in.startsWith("1") || in.startsWith("7")) {
      return 11;
    }
    if (in.startsWith("260") || in.startsWith("258") || in.startsWith("261") || in.startsWith("264") || in.startsWith("263") || in.startsWith("262") || in.startsWith("249") || in.startsWith("250") || in.startsWith("265") || in.startsWith("251") || in.startsWith("255") || in.startsWith("254") || in.startsWith("256") || in.startsWith("351") || in.startsWith("352") || in.startsWith("224") || in.startsWith("221") || in.startsWith("212") || in.startsWith("211") || in.startsWith("213") || in.startsWith("218") || in.startsWith("355") || in.startsWith("240") || in.startsWith("243") || in.startsWith("244") || in.startsWith("233") || in.startsWith("237") || in.startsWith("966") || in.startsWith("967") || in.startsWith("970") || in.startsWith("963") || in.startsWith("962") || in.startsWith("886") || in.startsWith("971") || in.startsWith("972") || in.startsWith("995") || in.startsWith("994") || in.startsWith("996") || in.startsWith("998") || in.startsWith("992") || in.startsWith("387") || in.startsWith("420") || in.startsWith("421") || in.startsWith("380") || in.startsWith("593") || in.startsWith("595") || in.startsWith("44") || in.startsWith("55") || in.startsWith("30") || in.startsWith("20") || in.startsWith("90") || in.startsWith("91") || in.startsWith("92") || in.startsWith("98") || in.startsWith("57") || in.startsWith("81") || in.startsWith("60") || in.startsWith("58") || in.startsWith("63")) {
      return 12;
    }
    if (in.startsWith("672") || in.startsWith("299") || in.startsWith("298") || in.startsWith("376")) {
      return 9;
    }
    if (in.startsWith("354") || in.startsWith("248") || in.startsWith("269") || in.startsWith("291") || in.startsWith("220") || in.startsWith("241") || in.startsWith("245") || in.startsWith("239") || in.startsWith("238") || in.startsWith("246") || in.startsWith("297") || in.startsWith("960") || in.startsWith("961") || in.startsWith("673") || in.startsWith("597") || in.startsWith("45") || in.startsWith("47") || in.startsWith("95") || in.startsWith("65") || in.startsWith("64")) {
      return 10;
    }
    if (in.startsWith("290")) {
      return 8;
    }
    if (in.startsWith("234") || in.startsWith("964") || in.startsWith("856") || in.startsWith("977") || in.startsWith("49") || in.startsWith("86")) {
      return 13;
    }
    return -1;
  }
}

