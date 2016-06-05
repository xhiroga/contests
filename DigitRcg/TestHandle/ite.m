function [ymin] = ite(fh, i)
disp('ite.m is called');

ymin = 0;

x1 = i;
[y1, y2] = fh(x1);

if (y1 > y2)
  ymin = y2;
elseif
  ymin = y1;
end


end